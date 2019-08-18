package com.ydsn.tms.util;

import java.util.ArrayList;
import java.util.List;

import com.ydsn.tms.vo.ComCus;
import com.ydsn.tms.vo.ddgl_InComCus;
import com.ydsn.tms.vo.ddgl_OutComCus;
import com.ydsn.tms.vo.jcxx_CarStore;
import com.ydsn.tms.vo.xtgl_UserStore;

/**
 * 将对象数组集合转成对象集合
 *@author  孙军
 *2015年6月8日 下午11:20:25
 */
public class Array2object {
  public static List<ComCus> Array2ComCus(List<Object[]> list){
	  List<ComCus> list1=new ArrayList<ComCus>();
	  for(int i=0;i<list.size();i++){
		  ComCus cc=new ComCus();
		  cc.setCus_name(list.get(i)[0].equals("null")?"":list.get(i)[0].toString());
		  cc.setG_id(list.get(i)[1].toString());
		  cc.setCus_num(list.get(i)[2].equals("null")?"":list.get(i)[2].toString());
		  cc.setG_class(list.get(i)[3].equals("null")?"":list.get(i)[3].toString());
		  cc.setG_bill(list.get(i)[4].equals("null")?"":list.get(i)[4].toString());
		  cc.setG_name(list.get(i)[5].equals("null")?"":list.get(i)[5].toString());
		  cc.setG_unit(list.get(i)[6].equals("null")?"":list.get(i)[6].toString());
		  cc.setG_weight(list.get(i)[7].equals("null")?"":list.get(i)[7].toString());
		  cc.setG_length(list.get(i)[8].equals("null")?"":list.get(i)[8].toString());
		  cc.setG_width(list.get(i)[9].equals("null")?"":list.get(i)[9].toString());
		  cc.setG_height(list.get(i)[10].equals("null")?"":list.get(i)[10].toString());
		  cc.setG_packamount(list.get(i)[11].equals("null")?"":list.get(i)[11].toString());
		  cc.setG_standard(list.get(i)[12].equals("null")?"":list.get(i)[12].toString());
		  cc.setG_price(list.get(i)[13].equals("null")?"":list.get(i)[13].toString());
		  cc.setG_packunit(list.get(i)[14].equals("null")?"":list.get(i)[14].toString());
		  cc.setG_packweight(list.get(i)[15].equals("null")?"":list.get(i)[15].toString());
		  cc.setG_packlength(list.get(i)[16].equals("null")?"":list.get(i)[16].toString());
		  cc.setG_packwidth(list.get(i)[17].equals("null")?"":list.get(i)[17].toString());
		  cc.setG_packheight(list.get(i)[18].equals("null")?"":list.get(i)[18].toString());
		  cc.setG_serial(list.get(i)[19].equals("null")?"":list.get(i)[19].toString());
		  cc.setG_remarks(list.get(i)[20].equals("null")?"":list.get(i)[20].toString());
		  cc.setG_time(list.get(i)[21].equals("null")?"":list.get(i)[21].toString());
		  cc.setG_value(list.get(i)[22].equals("null")?"":list.get(i)[22].toString());
		  list1.add(cc);
		  }
	  return list1;
  }
  
  public static List<jcxx_CarStore> Array2CarStore(List<Object[]> list){
	     List<jcxx_CarStore> list1=new ArrayList<jcxx_CarStore>();
	     for(int i=0;i<list.size();i++){
	    	 jcxx_CarStore car=new jcxx_CarStore();
	    	 car.setSto_id(list.get(i)[0].toString());
	    	 car.setCar_id(list.get(i)[1].toString());
	    	 car.setCar_bill(list.get(i)[2].toString());
	    	 car.setCar_desc(list.get(i)[3].toString());
	    	 car.setCar_remark(list.get(i)[4].toString());
	    	 car.setSto_name(list.get(i)[5].toString());
	    	 list1.add(car);
	     }
	     return list1;
  }
  public static List<xtgl_UserStore> Array2UserStore(List<Object[]> list){
	  List<xtgl_UserStore> list1=new ArrayList<xtgl_UserStore>();
	  for(int i=0;i<list.size();i++){
	    	 xtgl_UserStore us=new xtgl_UserStore();
	    	 us.setUser_id(list.get(i)[0].toString());
	    	 us.setUser_mch(list.get(i)[1].toString());
	    	 us.setUser_name(list.get(i)[2].toString());
	    	 us.setUser_pwd(list.get(i)[3].toString());
	    	 us.setStm_id(list.get(i)[4].toString());
	    	 us.setSto_name(list.get(i)[5].toString());
	    	list1.add(us);
	     }
	     return list1;
  }
  public static List<ddgl_InComCus> Array2InComCus(List<Object[]> list){
	  List<ddgl_InComCus> list1=new ArrayList<ddgl_InComCus>();
	  for(int i=0;i<list.size();i++){
		  ddgl_InComCus icc=new ddgl_InComCus();
		  icc.setRkddshp_id(list.get(i)[0].toString());
		  icc.setRkddkh_id(list.get(i)[1].toString());
		  icc.setRkdd_bill(list.get(i)[2].toString());
		  icc.setKhdd_bill(list.get(i)[3].toString());
		  icc.setRk_amount(list.get(i)[4].toString());
		  icc.setRkorfprk(list.get(i)[5].toString());
		  icc.setRkdd_status(list.get(i)[6].toString());
		  icc.setXd_date(list.get(i)[7].toString());
		  icc.setYjrk_date(list.get(i)[8].toString());
		  icc.setRkddzhd_man(list.get(i)[9].toString());
		  icc.setRkddzhd_time(list.get(i)[10].toString());
		  icc.setG_name(list.get(i)[11].toString());
		  icc.setCus_name(list.get(i)[12].toString());
		  list1.add(icc);
	  }
	  return list1;
  }
  public static List<ddgl_OutComCus> Array2OutComCus(List<Object[]> list){
	  List<ddgl_OutComCus> list1=new ArrayList<ddgl_OutComCus>();
	  for(int i=0;i<list.size();i++){
		  ddgl_OutComCus out=new ddgl_OutComCus();
		  out.setChkddshp_id(list.get(i)[0].toString());
		  out.setChkddkh_id(list.get(i)[1].toString());
		  out.setChkdd_bill(list.get(i)[2].toString());
		  out.setKhchkdd_bill(list.get(i)[3].toString());
		  out.setKhdd_amount(list.get(i)[4].toString());
		  out.setDd_date(list.get(i)[5].toString());
		  out.setYjchk_date(list.get(i)[6].toString());
		  out.setChkorccphx(list.get(i)[7].toString());
		  out.setChkddzht_status(list.get(i)[8].toString());
		  out.setChkdd_man(list.get(i)[9].toString());
		  out.setChkddzhd_time(list.get(i)[10].toString());
		  out.setG_name(list.get(i)[11].toString());
		  out.setCus_name(list.get(i)[12].toString());
		  list1.add(out);
	  }
	  return list1;
  }
}














