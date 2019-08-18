package com.ydsn.tms.action;

import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.ydsn.tms.po.ddgl_enterwarehouseOrder;
import com.ydsn.tms.service.ddgl_InComCusService;
import com.ydsn.tms.service.jcxx_CustomerService;
import com.ydsn.tms.util.List2json;
import com.ydsn.tms.vo.ddgl_InComCus;

/**
 *订单管理模块——控制层入库订单CRUD
 *@author  孙军
 *2015年6月11日 下午7:03:20
 */
public class ddgl_InComCusAction {
    private ddgl_InComCusService inser;
    private ddgl_InComCus icc;
    private jcxx_CustomerService cusser;

   public String addIn(){
	   inser.addIn(icc);
	   return Action.SUCCESS;
   }
   public String updateIn(){
	   inser.updateIn(icc);
	   return Action.SUCCESS;
   }
   public String findAllBill2(){
		 
		 HttpServletResponse response = ServletActionContext.getResponse();
	 	response.setCharacterEncoding("utf-8");
	 	List<ddgl_enterwarehouseOrder> list=inser.findAllBill();
	 	String str=JSONArray.fromObject(list).toString();
	 	System.out.println(str);
	 	try {
				PrintWriter out=response.getWriter();
				out.write(str);
			} catch (Exception e) {
	        e.printStackTrace();
			}
			return null;
	   }
  
   public String showIn(){
	   System.out.println("====");
	   HttpServletRequest request=ServletActionContext.getRequest();
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("utf-8");
	   int currentPage=Integer.valueOf(request.getParameter("page"));
	   int pageSize=Integer.valueOf(request.getParameter("rows"));
	   String str="";
	   try {
		  if(icc==null){
			  List<ddgl_InComCus> list=inser.findAll();
			  List<ddgl_InComCus> list1=inser.findAllBySplite(currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "icc")+"}";
		  }else{
			  List<ddgl_InComCus> list=inser.findAllByLike(icc);
			  List<ddgl_InComCus> list1=inser.findAllBySpliteAndLike(icc, currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "icc")+"}";
		  }
		  response.getWriter().write(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return null;
   }
   
   
   
   
   
   
   
   
   
/**-------------------------get/set方法和构造器-------------------------------------------------------------**/
	public ddgl_InComCusService getInser() {
		return inser;
	}
	public void setInser(ddgl_InComCusService inser) {
		this.inser = inser;
	}
	public ddgl_InComCus getIcc() {
		return icc;
	}
	public void setIcc(ddgl_InComCus icc) {
		this.icc = icc;
	}
	

	public jcxx_CustomerService getCusser() {
		return cusser;
	}
	public void setCusser(jcxx_CustomerService cusser) {
		this.cusser = cusser;
	}
	public ddgl_InComCusAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	

    
   
}
