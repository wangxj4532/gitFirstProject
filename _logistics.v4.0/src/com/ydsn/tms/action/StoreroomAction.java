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
import com.ydsn.tms.po.Storeroom;
import com.ydsn.tms.service.StoreroomService;
import com.ydsn.tms.util.List2json;

/**
 * 控制层-（库房档案crud）
 * 
 *@author  孙军
 *2015年6月8日 下午10:57:56
 */
@SuppressWarnings("serial")
public class StoreroomAction extends ActionSupport {
	Logger logger = Logger.getLogger(StoreroomAction.class);
	private StoreroomService ser;
	private Storeroom sto;
	private List<Storeroom> stos;
	private String str;
	/**
	 * 添加库房档案
	 * @return
	 */
	public String add() {
		ser.addSto(sto);
		return Action.SUCCESS;
	}
    /**]
     * 删除库房档案
     * @return
     */
	public String delete() {
		//获取待删除对象的ID(被封装成了字符串数组str[])
		HttpServletRequest request = ServletActionContext.getRequest();
		String[] str = request.getParameterValues("str");
		//遍历字符串数组删除待删除的对象。
		for (int i = 0; i < str.length; i++) {
			ser.deleteStoById(Integer.valueOf(str[i]));
		}
		return Action.SUCCESS;
	}
    /**
     * 修改库房档案
     * @return
     */
	public String update() {
		ser.updateSto(sto);
		return Action.SUCCESS;
	}
	 public String showName(){
			HttpServletResponse response = ServletActionContext.getResponse();
	   	response.setCharacterEncoding("utf-8");
	   	List<Storeroom> list=ser.findAll();
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
	 * 查询库房档案
	 * @return
	 */
	public String show() {
		// response中文转码
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		// 获取请求参数
		HttpServletRequest request = ServletActionContext.getRequest();
		int currentPage = Integer.parseInt(request.getParameter("page"));
		int pageSize = Integer.parseInt(request.getParameter("rows"));
		List<Storeroom> stolist = ser.findAll();
		try {
			if (sto == null) {
				stos = ser.findAllBySplite(currentPage, pageSize);
				str = "{\"total\":" + stolist.size() + ",\"rows\":"
						+ List2json.obj2jsonArr(stos, "sto") + "}";
			} else {
				stos = ser.findAllBySpliteAndLike(sto,currentPage, pageSize);
				str = "{\"total\":" + stos.size() + ",\"rows\":"
						+ List2json.obj2jsonArr(stos, "sto") + "}";
			}
			PrintWriter write = response.getWriter();
			write.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
/*----------------------------------------构造器和get/set方法-------------------------------------------------*/

	public StoreroomAction() {
	}

	public StoreroomAction(StoreroomService ser) {
		this.ser = ser;
	}

	public void setSer(StoreroomService ser) {
		System.out.println("=====ser====");
		this.ser = ser;
	}

	public StoreroomService getSer() {
		return ser;
	}

	public Storeroom getSto() {
		return sto;
	}

	public void setSto(Storeroom sto) {
		this.sto = sto;
	}

}
