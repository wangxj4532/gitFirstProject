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
 * ���Ʋ�-���ⷿ����crud��
 * 
 *@author  ���
 *2015��6��8�� ����10:57:56
 */
@SuppressWarnings("serial")
public class StoreroomAction extends ActionSupport {
	Logger logger = Logger.getLogger(StoreroomAction.class);
	private StoreroomService ser;
	private Storeroom sto;
	private List<Storeroom> stos;
	private String str;
	/**
	 * ��ӿⷿ����
	 * @return
	 */
	public String add() {
		ser.addSto(sto);
		return Action.SUCCESS;
	}
    /**]
     * ɾ���ⷿ����
     * @return
     */
	public String delete() {
		//��ȡ��ɾ�������ID(����װ�����ַ�������str[])
		HttpServletRequest request = ServletActionContext.getRequest();
		String[] str = request.getParameterValues("str");
		//�����ַ�������ɾ����ɾ���Ķ���
		for (int i = 0; i < str.length; i++) {
			ser.deleteStoById(Integer.valueOf(str[i]));
		}
		return Action.SUCCESS;
	}
    /**
     * �޸Ŀⷿ����
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
	 * ��ѯ�ⷿ����
	 * @return
	 */
	public String show() {
		// response����ת��
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		// ��ȡ�������
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
	
	
/*----------------------------------------��������get/set����-------------------------------------------------*/

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
