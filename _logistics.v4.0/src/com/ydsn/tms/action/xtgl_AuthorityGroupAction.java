package com.ydsn.tms.action;

import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.ydsn.tms.po.xtgl_Authoritygroup;
import com.ydsn.tms.service.xtgl_AuthorityGroupService;
import com.ydsn.tms.util.List2json;

/**
 * 系统管理模块——权限组控制层
 *@author  孙军
 *2015年6月12日 上午9:04:31
 */
public class xtgl_AuthorityGroupAction {
   private xtgl_AuthorityGroupService authser;
   private xtgl_Authoritygroup auth;
   
   public String addAuth(){
	   authser.addAuth(auth);
	   return Action.SUCCESS;
   }
   public String updateAuth(){
	   authser.updateAuth(auth);
	   return Action.SUCCESS;
   }
   public String showAuth(){
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("UTF-8");
	   HttpServletRequest request=ServletActionContext.getRequest();
	   int currentPage=Integer.valueOf(request.getParameter("page"));
	   int pageSize=Integer.valueOf(request.getParameter("rows"));
	   String str="";
	   try {
		   if(auth==null){
			   List<xtgl_Authoritygroup> list=authser.findAll();
			   List<xtgl_Authoritygroup> auths=authser.findAllBySplite(currentPage, pageSize);
			   str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(auths, "auth")+"}";
		   }else{
			   List<xtgl_Authoritygroup> list1=authser.findByLike(auth);
			   List<xtgl_Authoritygroup> auths=authser.findAllBySpliteAndLike(auth, currentPage, pageSize);
			   str="{\"total\":"+list1.size()+",\"rows\":"+List2json.obj2jsonArr(auths, "auth")+"}";
		   }
		   PrintWriter out=response.getWriter();
		   System.out.println(str);
		   out.write(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return null;
   }
/**---------------------------get/set方法和构造器-----------------------------------------------------------**/	

public xtgl_AuthorityGroupService getAuthser() {
	return authser;
}
public void setAuthser(xtgl_AuthorityGroupService authser) {
	this.authser = authser;
}
public xtgl_Authoritygroup getAuth() {
	return auth;
}
public void setAuth(xtgl_Authoritygroup auth) {
	this.auth = auth;
}
public xtgl_AuthorityGroupAction() {
}
public xtgl_AuthorityGroupAction(xtgl_AuthorityGroupService authser,
		xtgl_Authoritygroup auth) {
	this.authser = authser;
	this.auth = auth;
}
  
}
