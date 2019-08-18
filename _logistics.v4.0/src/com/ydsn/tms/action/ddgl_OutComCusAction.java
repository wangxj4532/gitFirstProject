package com.ydsn.tms.action;

import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.ydsn.tms.po.ddgl_outofwarehouseOrder;
import com.ydsn.tms.service.ddgl_OutComCusService;
import com.ydsn.tms.service.jcxx_CustomerService;
import com.ydsn.tms.util.List2json;
import com.ydsn.tms.vo.ddgl_OutComCus;

/**
 *订单管理模块——控制层出库订单CRUD
 *@author  孙军
 *2015年6月11日 下午7:03:20
 */
public class ddgl_OutComCusAction {
    private ddgl_OutComCusService outser;
    private ddgl_OutComCus occ;
    private jcxx_CustomerService cusser;

   public String addOut(){
	   outser.addOut(occ);
	   return Action.SUCCESS;
   }
   public String updateOut(){
	   outser.updateOut(occ);
	   return Action.SUCCESS;
   }
 public String findAllBill(){
	 
	 HttpServletResponse response = ServletActionContext.getResponse();
 	response.setCharacterEncoding("utf-8");
 	List<ddgl_outofwarehouseOrder> list=outser.findAllBill();
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
   public String showOut(){
	   HttpServletRequest request=ServletActionContext.getRequest();
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("utf-8");
	   int currentPage=Integer.valueOf(request.getParameter("page"));
	   int pageSize=Integer.valueOf(request.getParameter("rows"));
	   String str="";
	   try {
		  if(occ==null){
			  List<ddgl_OutComCus> list=outser.findAll();
			  List<ddgl_OutComCus> list1=outser.findAllBySplite(currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "occ")+"}";
		  }else{
			  List<ddgl_OutComCus> list=outser.findAllByLike(occ);
			  List<ddgl_OutComCus> list1=outser.findAllBySpliteAndLike(occ, currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "occ")+"}";
		  }
		  response.getWriter().write(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return null;
   }

   
/**-------------------------get/set方法和构造器-------------------------------------------------------------**/
	
   public ddgl_OutComCusService getOutser() {
		return outser;
	}
	public void setOutser(ddgl_OutComCusService outser) {
		this.outser = outser;
	}
	public ddgl_OutComCus getOcc() {
		return occ;
	}
	public void setOcc(ddgl_OutComCus occ) {
		this.occ = occ;
	}
	public jcxx_CustomerService getCusser() {
		return cusser;
	}
	public void setCusser(jcxx_CustomerService cusser) {
		this.cusser = cusser;
	}
	    
   
}
