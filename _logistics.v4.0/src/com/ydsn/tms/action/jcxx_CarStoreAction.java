package com.ydsn.tms.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.ydsn.tms.po.jcxx_CargoSpace;
import com.ydsn.tms.service.jcxx_CarStoreService;
import com.ydsn.tms.util.List2json;
import com.ydsn.tms.vo.jcxx_CarStore;

/**
 *基础信息模块——控制层货位和库房信息 
 *@author  孙军
 *2015年6月11日 下午7:03:20
 */
public class jcxx_CarStoreAction {
   private jcxx_CarStoreService carser;
   private jcxx_CarStore  car;
   
   public String addCar(){
	   carser.addCar(car);
	   return Action.SUCCESS;
   }
   public String updateCar(){
	   carser.updateCar(car);
	   return Action.SUCCESS;
   }
   public String showNameById(){
		HttpServletResponse response = ServletActionContext.getResponse();
   	response.setCharacterEncoding("utf-8");
   	List<jcxx_CargoSpace> list=carser.findCar();
   	String str=JSONArray.fromObject(list).toString();
   	try {
			PrintWriter out=response.getWriter();
			out.write(str);
		} catch (Exception e) {
          e.printStackTrace();
		}
		return null;
	}
   
   public String showCar(){
	   
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setCharacterEncoding("UTF-8");
	   HttpServletRequest request=ServletActionContext.getRequest();
	   int currentPage = Integer.parseInt(request.getParameter("page"));
	   int pageSize = Integer.parseInt(request.getParameter("rows"));
	   String str="";
	   try {
		   if(car==null){
			   List<jcxx_CarStore> carlist=carser.findAll();
			   List<jcxx_CarStore> list=carser.findAllBySplite(currentPage, pageSize);
			   str="{\"total\":" + carlist.size() + ",\"rows\":"+ List2json.obj2jsonArr(list, "car") + "}";
			   System.out.println(str);
		   }else{
			   List<jcxx_CarStore> carlist1=carser.findAllByLike(car);
			   List<jcxx_CarStore> list1=carser.findAllBySpliteAndLike(car, currentPage, pageSize);
			   str="{\"total\":" + carlist1.size() + ",\"rows\":"+ List2json.obj2jsonArr(list1, "car") + "}";
		   }
		   PrintWriter out=response.getWriter();
		   out.write(str);
	} catch (Exception e) {
      e.printStackTrace();
	}
	   return null;
   }
   

   
   
   
   
   
   
   
   
   
   
/**-------------------------get/set方法和构造器-------------------------------------------------------------**/
public jcxx_CarStoreService getCarser() {
	return carser;
}

public void setCarser(jcxx_CarStoreService carser) {
	this.carser = carser;
}

public jcxx_CarStoreAction() {
}

public jcxx_CarStoreAction(jcxx_CarStoreService carser) {
	this.carser = carser;
}

public jcxx_CarStore getCar() {
	return car;
}
public void setCar(jcxx_CarStore car) {
	this.car = car;
}
   
}
