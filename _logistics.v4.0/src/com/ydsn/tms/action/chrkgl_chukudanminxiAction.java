package com.ydsn.tms.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.ydsn.tms.service.chrkgl_chukudanminxiService;
import com.ydsn.tms.util.List2json;
import com.ydsn.tms.vo.chrkgl_chukudanminxiVO;

/**
 *  出入库管理模块——出库单明细控制层
 *@author  孙军
 *2015年6月17日 上午10:46:09
 */
public class chrkgl_chukudanminxiAction {
   private chrkgl_chukudanminxiService cmxser;
   private chrkgl_chukudanminxiVO cmxv;
   private String[] str;
   
   public String addCMX(){
	   cmxser.addCMX(cmxv);
	   return Action.SUCCESS;
   }
   public String deleteCMX(){
	   for(int i=0;i<str.length;i++){
		   cmxser.deleteById(str[i]);
	   }
	   return Action.SUCCESS;
   }
   public String showCMX(){
	   HttpServletRequest request=ServletActionContext.getRequest();
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("utf-8");
	   int currentPage=Integer.valueOf(request.getParameter("page"));
	   int pageSize=Integer.valueOf(request.getParameter("rows"));
	   String str="";
	   try {
		  if(cmxv==null){
			  List<chrkgl_chukudanminxiVO> list=cmxser.findAll();
			  List<chrkgl_chukudanminxiVO> list1=cmxser.findAllBySplite(currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "cmxv")+"}";
		  }else{
			  List<chrkgl_chukudanminxiVO> list=cmxser.findAllByLike(cmxv);
			  List<chrkgl_chukudanminxiVO> list1=cmxser.findAllBySpliteAndLike(cmxv, currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "cmxv")+"}";
		  }
		  System.out.println(str);
		  response.getWriter().write(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return null;
   }
   
   /**------------------------get/set方法-----------------------------------------------------------**/
public chrkgl_chukudanminxiService getCmxser() {
	return cmxser;
}
public void setCmxser(chrkgl_chukudanminxiService cmxser) {
	this.cmxser = cmxser;
}
public chrkgl_chukudanminxiVO getCmxv() {
	return cmxv;
}
public void setCmxv(chrkgl_chukudanminxiVO cmxv) {
	this.cmxv = cmxv;
}

public String[] getStr() {
	return str;
}

public void setStr(String[] str) {
	this.str = str;
}

   
}
