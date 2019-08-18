package com.ydsn.tms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.ydsn.tms.po.Customer;
import com.ydsn.tms.service.jcxx_CustomerService;
import com.ydsn.tms.util.List2json;

/**
 * 基础信息类-控制层-客户档案
 *@author  孙军
 *2015年6月9日 上午11:17:24
 */
public class jcxx_CustomerAction {
	private jcxx_CustomerService cusser;
	private Customer cus;
	
	public String addCus(){
		cusser.addCus(cus);
		return Action.SUCCESS;
	}
	public String updateCus(){
		cusser.updateCus(cus);
		return Action.SUCCESS;
	}
	public String deleteCus(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String [] str=request.getParameterValues("str");
		for(int i=0;i<str.length;i++){
			cusser.deleteCusById(str[i]);
		}
		return Action.SUCCESS;
	}
	public String showComCus(){
		HttpServletResponse response = ServletActionContext.getResponse();
    	response.setCharacterEncoding("utf-8");
    	List<Customer> list=cusser.findAll();
    	String str=JSONArray.fromObject(list).toString();
    	try {
			PrintWriter out=response.getWriter();
			out.write(str);
		} catch (Exception e) {
           e.printStackTrace();
		}
		return null;
	}
    public String showCus(){
    	HttpServletResponse response = ServletActionContext.getResponse();
    	response.setCharacterEncoding("utf-8");
    	HttpServletRequest request = ServletActionContext.getRequest();
		int currentPage = Integer.parseInt(request.getParameter("page"));
		int pageSize = Integer.parseInt(request.getParameter("rows"));
    	PrintWriter write;
    	String str="";
		try {
			if(cus==null){
				List<Customer> list=cusser.findAll();
				List<Customer> cuss=cusser.findAllBySplite(currentPage, pageSize);
				str="{\"total\":" + list.size() + ",\"rows\":"+ List2json.obj2jsonArr(cuss, "cus") + "}";
			}else{
				List<Customer> list1=cusser.findByLike(cus);
				List<Customer> cuss=cusser.findAllBySpliteAndLike(cus, currentPage, pageSize);
				str="{\"total\":" + list1.size() + ",\"rows\":"+ List2json.obj2jsonArr(cuss, "cus") + "}";
			}
			write = response.getWriter();
			System.out.println(str);
			write.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return null;
    	
    }
 /*****************************************get/set方法和构造器**************************************************/   
	public jcxx_CustomerService getCusser() {
		return cusser;
	}
	public void setCusser(jcxx_CustomerService cusser) {
		this.cusser = cusser;
	}
	public jcxx_CustomerAction() {
		super();
	}
	public jcxx_CustomerAction(jcxx_CustomerService cusser) {
		super();
		this.cusser = cusser;
	}
	public Customer getCus() {
		return cus;
	}
	public void setCus(Customer cus) {
		this.cus = cus;
	}
    
}
