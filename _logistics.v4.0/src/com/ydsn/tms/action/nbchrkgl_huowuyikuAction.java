package com.ydsn.tms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.ydsn.tms.po.Storeroom;
import com.ydsn.tms.service.StoreroomService;
import com.ydsn.tms.service.nbchrkgl_huowuyikuService;
import com.ydsn.tms.util.List2json;
import com.ydsn.tms.vo.nbchrkgl_YKSto;

/**
 *内部出入库管理模块--货物移库控制层 
 *@author  孙军
 *2015年6月15日 上午9:58:45
 */
public class nbchrkgl_huowuyikuAction {
   private nbchrkgl_huowuyikuService ykser;
   private nbchrkgl_YKSto yks;
   private String str;
   private StoreroomService stoser;
   public String addYKS(){
	   ykser.addYK(yks);
	   return Action.SUCCESS;
   }
   public String showStoYKS(){
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("utf-8");
	   List<Storeroom> list=stoser.findAll();
	   String str=JSONArray.fromObject(list).toString();
	   try {
		   System.out.println(str);
		   response.getWriter().write(str);
	} catch (Exception e) {
       e.printStackTrace();
	}
	   return null;
   }
   public String updateYKS(){
	   ykser.updateYK(yks);
	   return Action.SUCCESS;
   }
   public String deleteYKS(){
	   HttpServletRequest request=ServletActionContext.getRequest();
	   String[] str=request.getParameterValues("str");
	   for(int i=0;i<str.length;i++){
		   ykser.deleteById(str[i]);
	   }
	   return Action.SUCCESS;
   }
   public String showYKS(){
	   HttpServletRequest request=ServletActionContext.getRequest();
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("utf-8");
	   int currentPage=Integer.parseInt(request.getParameter("page"));
	   int pageSize=Integer.parseInt(request.getParameter("rows"));
	   try {
		   String str="";
		if(yks==null){
			List<nbchrkgl_YKSto> list=ykser.findAll();
			List<nbchrkgl_YKSto> list1=ykser.findBySplite(currentPage, pageSize);
			str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "yks")+"}";
		}else{
			List<nbchrkgl_YKSto> list=ykser.findByLike(yks);
			List<nbchrkgl_YKSto> list1=ykser.findBySpliteAndLike(yks, currentPage, pageSize);
			str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "yks")+"}";
		}
		System.out.println(str);
		response.getWriter().write(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return null;
   }
/**------------------------------get/set方法和构造器------------------------------------------------------**/
public nbchrkgl_huowuyikuService getYkser() {
	return ykser;
}
public void setYkser(nbchrkgl_huowuyikuService ykser) {
	this.ykser = ykser;
}
public nbchrkgl_YKSto getYks() {
	return yks;
}
public void setYks(nbchrkgl_YKSto yks) {
	this.yks = yks;
}
public nbchrkgl_huowuyikuAction() {
}
public nbchrkgl_huowuyikuAction(nbchrkgl_huowuyikuService ykser,
		nbchrkgl_YKSto yks) {
	this.ykser = ykser;
	this.yks = yks;
}
public String getStr() {
	return str;
}
public void setStr(String str) {
	this.str = str;
}
public StoreroomService getStoser() {
	return stoser;
}
public void setStoser(StoreroomService stoser) {
	this.stoser = stoser;
}
   
}
