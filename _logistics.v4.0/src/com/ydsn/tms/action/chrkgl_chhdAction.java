package com.ydsn.tms.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.ydsn.tms.service.chrkgl_chhdService;
import com.ydsn.tms.util.List2json;
import com.ydsn.tms.vo.chrkgl_chhdVO;

/**
 * 出入库管理模块——出货单控制层 
 *@author  孙军
 *2015年6月16日 下午3:51:50
 */
public class chrkgl_chhdAction {
   private chrkgl_chhdService chdser;
   private chrkgl_chhdVO chdv;
   public String addCHD(){
	   chdser.addCHD(chdv);
	   return Action.SUCCESS;
   }
   
   public String updateCHD(){
	   chdser.updateCHD(chdv);
	   return Action.SUCCESS;
   }
   public String showCHD(){
	   HttpServletRequest request=ServletActionContext.getRequest();
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("utf-8");
	   int currentPage=Integer.valueOf(request.getParameter("page"));
	   int pageSize=Integer.valueOf(request.getParameter("rows"));
	   String str="";
	   try {
		  if(chdv==null){
			  List<chrkgl_chhdVO> list=chdser.findAll();
			  List<chrkgl_chhdVO> list1=chdser.findBySplite(currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "chdv")+"}";
		  }else{
			  List<chrkgl_chhdVO> list=chdser.findByLike(chdv);
			  List<chrkgl_chhdVO> list1=chdser.findBySpliteAndLike(chdv, currentPage, pageSize);
			  str="{\"total\":"+list.size()+",\"rows\":"+List2json.obj2jsonArr(list1, "chdv")+"}";
		  }
		  System.out.println(str);
		  response.getWriter().write(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return null;
   }
   
/**-------------------------------get/set方法---------------------------------------------------------**/
public chrkgl_chhdService getChdser() {
	return chdser;
}

public void setChdser(chrkgl_chhdService chdser) {
	this.chdser = chdser;
}

public chrkgl_chhdVO getChdv() {
	return chdv;
}

public void setChdv(chrkgl_chhdVO chdv) {
	this.chdv = chdv;
}
   
}
