package com.ydsn.tms.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.ydsn.tms.service.chrkgl_rukudanService;
import com.ydsn.tms.util.List2json;
import com.ydsn.tms.vo.chrkgl_rukudanVO;

/**
 * 出入库管理模块——入库单控制层
 *@author  孙军
 *2015年6月17日 下午11:05:27
 */
public class chrkgl_rukudanAction {
   private chrkgl_rukudanService rkdser;
   private chrkgl_rukudanVO rkdv;
   
   public String addRKD(){
	   System.out.println("==1=");
	   rkdser.add(rkdv);
	   return Action.SUCCESS;
   }
   public String updateRKD(){
	   rkdser.update(rkdv);
	   return Action.SUCCESS;
   }
   public String showRKD(){
	   HttpServletRequest request=ServletActionContext.getRequest();
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("utf-8");
	   int currentPage=Integer.valueOf(request.getParameter("page"));
	   int pageSize=Integer.valueOf(request.getParameter("rows"));
	   String str="";
	   try {
		  if(rkdv==null){
			  List<chrkgl_rukudanVO> list=rkdser.findAll();
			  List<chrkgl_rukudanVO> list1=rkdser.findBySplite(currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "rkdv")+"}";
		  }else{
			  List<chrkgl_rukudanVO> list=rkdser.findByLike(rkdv);
			  List<chrkgl_rukudanVO> list1=rkdser.findBySpliteAndLike(rkdv, currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "rkdv")+"}";
		  }
		  System.out.println(str);
		  response.getWriter().write(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return null;
   }
   
/**-------------get/set方法-------------------------------------------------------------------------**/
public chrkgl_rukudanService getRkdser() {
	return rkdser;
}
public void setRkdser(chrkgl_rukudanService rkdser) {
	this.rkdser = rkdser;
}
public chrkgl_rukudanVO getRkdv() {
	return rkdv;
}
public void setRkdv(chrkgl_rukudanVO rkdv) {
	this.rkdv = rkdv;
}
   
}
