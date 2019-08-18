package com.ydsn.tms.action;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.ydsn.tms.po.ComFile;
import com.ydsn.tms.service.jcxxComfileService;
import com.ydsn.tms.util.List2json;
import com.ydsn.tms.vo.ComCus;
/**
 * 控制层-（商品档案信息的crud）
 * 
 *@author  孙军
 *2015年6月8日 下午10:41:41
 */
//为什么要继承ActionSupport这个类
@SuppressWarnings("serial")
public class jcxxComfileAction extends ActionSupport{
	//日志类定义
	Logger logger = Logger.getLogger(jcxxComfileAction.class);
	private jcxxComfileService comser;
	private ComCus cc;
	private List<ComCus> ccs;
	private String str;
	
	public String addCom(){
		comser.addCom(cc);
		return Action.SUCCESS;
	}
	public String updateCom(){
		comser.updateCom(cc);
		return Action.SUCCESS;
	}
	public String deleteCom(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String[] str=request.getParameterValues("str");
		for(int i=0;i<str.length;i++){
			comser.deleteComById(str[i]);
		}
		return Action.SUCCESS;
	}
	public String showInCom(){
		HttpServletResponse response = ServletActionContext.getResponse();
    	response.setCharacterEncoding("utf-8");
    	List<ComFile> list=comser.findCom();
    	String str=JSONArray.fromObject(list).toString();
    	try {
			PrintWriter out=response.getWriter();
			out.write(str);
		} catch (Exception e) {
           e.printStackTrace();
		}
		return null;
	}
    /**
     * 档案信息查询
     * @return
     */
	public String showCom() {
		
		//response中文转码
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		//获取请求参数
		HttpServletRequest request = ServletActionContext.getRequest();
		int currentPage = Integer.parseInt(request.getParameter("page"));
		int pageSize = Integer.parseInt(request.getParameter("rows"));
		System.out.println("===========begin execute====1`=====>");
		List<ComCus> cclist = comser.findAll();
		try {
			//cc是模糊查询封装成的一个对象，首先判断cc是否为null，如果为null，则不是模糊查询，如果不是null，则是模糊查询。
			if (cc == null) {
				ccs = comser.findAllBySplite(currentPage, pageSize);
				//cclist.size()查询记录的总条数，界面需要。通过自己写的一个工具类将查询到的集合转换成json格式的字符串，返回给界面。
				str = "{\"total\":" + cclist.size() + ",\"rows\":"
						+ List2json.obj2jsonArr(ccs, "cc") + "}";
			} else {
				ccs = comser.findAllBySpliteAndLike(cc,currentPage, pageSize);
				str = "{\"total\":" + ccs.size() + ",\"rows\":"
						+ List2json.obj2jsonArr(ccs, "cc") + "}";
			}
			System.out.println(str);
			PrintWriter write = response.getWriter();
			write.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
/*----------------------------------------构造器和get/set方法-------------------------------------------------*/
	public ComCus getCc() {
		return cc;
	}

	public void setCc(ComCus cc) {
		this.cc = cc;
	}

	public jcxxComfileService getComser() {
		System.out.println("========getser=======");
		return comser;
	}

	public void setComser(jcxxComfileService comser) {
		System.out.println("========setser=======");
		this.comser = comser;
	}
	
}
