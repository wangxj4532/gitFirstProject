package com.ydsn.tms.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.ydsn.tms.service.nbchrkgl_huowuyiweiService;
import com.ydsn.tms.util.List2json;
import com.ydsn.tms.vo.nbchrkgl_YWVO;

/**
 * 内部出入库管理模块--货物移库控制层
 *@author  孙军
 *2015年6月15日 下午7:01:01
 */
public class nbchrkgl_huowuyiweiAction {
  private  nbchrkgl_huowuyiweiService ywser;
  private nbchrkgl_YWVO ywvo;
  private String str;
  
  public String addYW(){
	  ywser.add(ywvo);
	  return Action.SUCCESS;
  }
  public String updateYW(){
	  ywser.update(ywvo);
	  return Action.SUCCESS;
  }
  public String deleteYW(){
	  HttpServletRequest request=ServletActionContext.getRequest();
	  String []str=request.getParameterValues("str");
	  for(int i=0;i<str.length;i++){
		  ywser.deleteById(str[i]);
	  }
	  return Action.SUCCESS;
  }
  public String showYW(){
	  HttpServletRequest request=ServletActionContext.getRequest();
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("utf-8");
	   int currentPage=Integer.parseInt(request.getParameter("page"));
	   int pageSize=Integer.parseInt(request.getParameter("rows"));
	   try {
		   String str="";
		if(ywvo==null){
			List<nbchrkgl_YWVO> list=ywser.findAll();
			List<nbchrkgl_YWVO> list1=ywser.findBySplite(currentPage, pageSize);
			str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "ywvo")+"}";
		}else{
			List<nbchrkgl_YWVO> list=ywser.findByLike(ywvo);
			List<nbchrkgl_YWVO> list1=ywser.findBySpliteAndLike(ywvo, currentPage, pageSize);
			str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "ywvo")+"}";
		}
		response.getWriter().write(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return null;
       
  }
/**-----------------------get/set方法-------------------------------------------------------**/  
public nbchrkgl_huowuyiweiService getYwser() {
	return ywser;
}
public void setYwser(nbchrkgl_huowuyiweiService ywser) {
	this.ywser = ywser;
}
public nbchrkgl_YWVO getYwvo() {
	return ywvo;
}
public void setYwvo(nbchrkgl_YWVO ywvo) {
	this.ywvo = ywvo;
}
public String getStr() {
	return str;
}
public void setStr(String str) {
	this.str = str;
}
  
}
