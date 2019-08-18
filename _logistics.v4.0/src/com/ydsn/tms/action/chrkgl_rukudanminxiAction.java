package com.ydsn.tms.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.ydsn.tms.service.chrkgl_rukudanminxiService;
import com.ydsn.tms.util.List2json;
import com.ydsn.tms.vo.chrkgl_rukudanminxiVO;

/**
 * 出入库管理模块——入库单明细控制层
 *@author  孙军
 *2015年6月18日 上午7:57:08
 */
public class chrkgl_rukudanminxiAction {
   private chrkgl_rukudanminxiService rmxser; 
   private chrkgl_rukudanminxiVO rmxv;
   private String str;
   
   public String addRMX(){
	   System.out.println("=========我走了===========");
	   rmxser.add(rmxv);
	   return Action.SUCCESS;
   }
   public String deleteRMX(){
	   HttpServletRequest request=ServletActionContext.getRequest();
	   String[] str=request.getParameterValues("str");
	   for(int i=0;i<str.length;i++){
		   rmxser.deleteById(str[i]);
	   }
	   return Action.SUCCESS;
	   
   }
   public String showRMX(){
	   HttpServletRequest request=ServletActionContext.getRequest();
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("utf-8");
	   int currentPage=Integer.valueOf(request.getParameter("page"));
	   int pageSize=Integer.valueOf(request.getParameter("rows"));
	   String str="";
	   try {
		  if(rmxv==null){
			  List<chrkgl_rukudanminxiVO> list=rmxser.findAll();
			  List<chrkgl_rukudanminxiVO> list1=rmxser.findAllBySplite(currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "rmxv")+"}";
		  }else{
			  List<chrkgl_rukudanminxiVO> list=rmxser.findAllByLike(rmxv);
			  List<chrkgl_rukudanminxiVO> list1=rmxser.findAllBySpliteAndLike(rmxv, currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "rmxv")+"}";
		  }
		  System.out.println(str);
		  response.getWriter().write(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return null;
   }
/**------------------get/set方法------------------------------------------------------------**/
public chrkgl_rukudanminxiService getRmxser() {
	return rmxser;
}
public void setRmxser(chrkgl_rukudanminxiService rmxser) {
	this.rmxser = rmxser;
}
public chrkgl_rukudanminxiVO getRmxv() {
	return rmxv;
}
public void setRmxv(chrkgl_rukudanminxiVO rmxv) {
	this.rmxv = rmxv;
}
public String getStr() {
	return str;
}
public void setStr(String str) {
	this.str = str;
}
   
}
