package com.ydsn.tms.action;

import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.ydsn.tms.service.xtgl_UserStoreService;
import com.ydsn.tms.util.List2json;
import com.ydsn.tms.vo.xtgl_UserStore;

/**
 *系统管理模块——用户和库房信息 控制层
 *@author  孙军
 *2015年6月11日 下午7:03:20
 */
public class xtgl_UserStoreAction {
   private xtgl_UserStoreService userser;
   private xtgl_UserStore  us;
   
   public String addUser(){
	   userser.addUser(us);
	   return Action.SUCCESS;
   }
   public String updateUser(){
	   userser.updateUser(us);
	   return Action.SUCCESS;
   }
   public String showUser(){
	   
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("UTF-8");
	   HttpServletRequest request=ServletActionContext.getRequest();
	   int currentPage = Integer.parseInt(request.getParameter("page"));
	   int pageSize = Integer.parseInt(request.getParameter("rows"));
	   String str="";
	   try {
		   if(us==null){
			   List<xtgl_UserStore> uslist=userser.findAll();
			   List<xtgl_UserStore> list=userser.findAllBySplite(currentPage, pageSize);
			   str="{\"total\":" + uslist.size() + ",\"rows\":"+ List2json.obj2jsonArr(list, "us") + "}";
		   }else{
			   List<xtgl_UserStore> uslist1=userser.findAllByLike(us);
			   List<xtgl_UserStore> list1=userser.findAllBySpliteAndLike(us, currentPage, pageSize);
			   str="{\"total\":" + uslist1.size() + ",\"rows\":"+ List2json.obj2jsonArr(list1, "us") + "}";
		   }
		   PrintWriter out=response.getWriter();
		   System.out.println(str);
		   out.write(str);
	} catch (Exception e) {
      e.printStackTrace();
	}
	   return null;
   }

      
/**-------------------------get/set方法和构造器-------------------------------------------------------------**/
  
   public xtgl_UserStoreService getUserser() {
		return userser;
	}
	public void setUserser(xtgl_UserStoreService userser) {
		this.userser = userser;
	}
	public xtgl_UserStore getUs() {
		return us;
	}
	public void setUs(xtgl_UserStore us) {
		this.us = us;
	}
	public xtgl_UserStoreAction() {
	}
	public xtgl_UserStoreAction(xtgl_UserStoreService userser) {
		this.userser = userser;
	}
	public xtgl_UserStoreAction(xtgl_UserStore us) {
		super();
		this.us = us;
	}
   
   
}
