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
 * ���Ʋ�-����Ʒ������Ϣ��crud��
 * 
 *@author  ���
 *2015��6��8�� ����10:41:41
 */
//ΪʲôҪ�̳�ActionSupport�����
@SuppressWarnings("serial")
public class jcxxComfileAction extends ActionSupport{
	//��־�ඨ��
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
     * ������Ϣ��ѯ
     * @return
     */
	public String showCom() {
		
		//response����ת��
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		//��ȡ�������
		HttpServletRequest request = ServletActionContext.getRequest();
		int currentPage = Integer.parseInt(request.getParameter("page"));
		int pageSize = Integer.parseInt(request.getParameter("rows"));
		System.out.println("===========begin execute====1`=====>");
		List<ComCus> cclist = comser.findAll();
		try {
			//cc��ģ����ѯ��װ�ɵ�һ�����������ж�cc�Ƿ�Ϊnull�����Ϊnull������ģ����ѯ���������null������ģ����ѯ��
			if (cc == null) {
				ccs = comser.findAllBySplite(currentPage, pageSize);
				//cclist.size()��ѯ��¼����������������Ҫ��ͨ���Լ�д��һ�������ཫ��ѯ���ļ���ת����json��ʽ���ַ��������ظ����档
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
	
/*----------------------------------------��������get/set����-------------------------------------------------*/
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
