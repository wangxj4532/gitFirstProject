package com.ydsn.tms.service.imp;

import java.util.List;
import com.ydsn.tms.dao.ComCusDAO;
import com.ydsn.tms.dao.jcxx_ComFileDAO;
import com.ydsn.tms.dao.jcxx_CustomerDAO;
import com.ydsn.tms.po.ComFile;
import com.ydsn.tms.service.jcxxComfileService;
import com.ydsn.tms.util.Array2object;
import com.ydsn.tms.util.IDFactory;
import com.ydsn.tms.vo.ComCus;

public class jcxxComFileServiceImp implements jcxxComfileService {
	private ComCusDAO comdao6;
	private jcxx_CustomerDAO cusdao1;
	private jcxx_ComFileDAO comdao1;
	private ComFile com=new ComFile();


	@Override
	public void addCom(ComCus cc) {
		String g_bill=cc.getG_bill().equals("")?"null":cc.getG_bill();
		com.setG_bill(g_bill);
		com.setG_class(cc.getG_class().equals("")?"null":cc.getG_class());
		com.setG_height(cc.getG_height().equals("")?"null":cc.getG_height());
		com.setG_id(IDFactory.createG_id(g_bill));
		com.setG_length(cc.getG_length().equals("")?"null":cc.getG_length());
		com.setG_name(cc.getG_name().equals("")?"null":cc.getG_name());
		com.setG_packamount(cc.getG_packamount().equals("")?"null":cc.getG_packamount());
		com.setG_packheight(cc.getG_packheight().equals("")?"null":cc.getG_packheight());
		com.setG_packlength(cc.getG_packlength().equals("")?"null":cc.getG_packlength());
		com.setG_packunit(cc.getG_packunit().equals("")?"null":cc.getG_packunit());
		com.setG_packweight(cc.getG_packweight().equals("")?"null":cc.getG_packweight());
		com.setG_packwidth(cc.getG_packwidth().equals("")?"null":cc.getG_packwidth());
		com.setG_price(cc.getG_price().equals("")?"null":cc.getG_price());
		com.setG_remarks(cc.getG_remarks().equals("")?"null":cc.getG_remarks());
		com.setG_serial(cc.getG_serial().equals("")?"null":cc.getG_serial());
		com.setG_standard(cc.getG_standard().equals("")?"null":cc.getG_standard());
		com.setG_time(cc.getG_time().equals("")?"null":cc.getG_time());
		com.setG_unit(cc.getG_unit().equals("")?"null":cc.getG_unit());
		com.setG_value(cc.getG_value().equals("")?"null":cc.getG_value());
		com.setG_weight(cc.getG_weight().equals("")?"null":cc.getG_weight());
		com.setG_width(cc.getG_width().equals("")?"null":cc.getG_width());
		String cus_num=cusdao1.findByName(cc.getCus_name().equals("请选择客户")?"null":cc.getCus_name()).get(0)[0].toString();
		com.setCus_num(cus_num);
		comdao1.add(com);
		
	}

	
	@Override
	public void updateCom(ComCus cc) {
		String g_bill=cc.getG_bill().equals("")?"null":cc.getG_bill();
		com.setG_bill(g_bill);
		com.setG_class(cc.getG_class().equals("")?"null":cc.getG_class());
		com.setG_height(cc.getG_height().equals("")?"null":cc.getG_height());
		com.setG_id(cc.getG_id());
		com.setG_length(cc.getG_length().equals("")?"null":cc.getG_length());
		com.setG_name(cc.getG_name().equals("")?"null":cc.getG_name());
		com.setG_packamount(cc.getG_packamount().equals("")?"null":cc.getG_packamount());
		com.setG_packheight(cc.getG_packheight().equals("")?"null":cc.getG_packheight());
		com.setG_packlength(cc.getG_packlength().equals("")?"null":cc.getG_packlength());
		com.setG_packunit(cc.getG_packunit().equals("")?"null":cc.getG_packunit());
		com.setG_packweight(cc.getG_packweight().equals("")?"null":cc.getG_packweight());
		com.setG_packwidth(cc.getG_packwidth().equals("")?"null":cc.getG_packwidth());
		com.setG_price(cc.getG_price().equals("")?"null":cc.getG_price());
		com.setG_remarks(cc.getG_remarks().equals("")?"null":cc.getG_remarks());
		com.setG_serial(cc.getG_serial().equals("")?"null":cc.getG_serial());
		com.setG_standard(cc.getG_standard().equals("")?"null":cc.getG_standard());
		com.setG_time(cc.getG_time().equals("")?"null":cc.getG_time());
		com.setG_unit(cc.getG_unit().equals("")?"null":cc.getG_unit());
		com.setG_value(cc.getG_value().equals("")?"null":cc.getG_value());
		com.setG_weight(cc.getG_weight().equals("")?"null":cc.getG_weight());
		com.setG_width(cc.getG_width().equals("")?"null":cc.getG_width());
		String cus_num=cusdao1.findByName(cc.getCus_name().equals("请选择客户")?"null":cc.getCus_name()).get(0)[0].toString();
		com.setCus_num(cus_num);
		comdao1.update(com);
		
	}

	
	@Override
	public void deleteComById(String g_id) {
		comdao1.deleteById(g_id);
		
	}
	public List<ComCus> findAll() {
		System.out.println("==2="+comdao6);
		List<Object[]> list  = comdao6.findAll();
		System.out.println(list.size());
		System.out.println("==3=");
		return Array2object.Array2ComCus(list);
	}

	public List<ComCus> findAllBySpliteAndLike(ComCus cc1, int currentPage,
			int pageSize) {
		List<Object[]> list = comdao6.findAllBySpliteAndLike(cc1, currentPage, pageSize);
		return Array2object.Array2ComCus(list);
	}

	public List<ComCus> findAllBySplite(int currentPage, int pageSize) {
		 List<Object[]> list = comdao6.findAllBySplite(currentPage, pageSize);
		return Array2object.Array2ComCus(list);
	}
	
	@Override
	public List<ComFile> findCom() {
		return comdao1.findCom();
	}


	
/*----------------------------------------构造器和get/set方法-------------------------------------------------*/

	
	
	
	public jcxx_CustomerDAO getCusdao1() {
		return cusdao1;
	}

	public ComCusDAO getComdao6() {
		System.out.println("----------getdao-----------");
		return comdao6;
	}


	public void setComdao6(ComCusDAO comdao6) {
		System.out.println("----------setdao-----------");
		this.comdao6 = comdao6;
	}


	public void setCusdao1(jcxx_CustomerDAO cusdao1) {
		this.cusdao1 = cusdao1;
	}


	public jcxx_ComFileDAO getComdao1() {
		return comdao1;
	}


	public void setComdao1(jcxx_ComFileDAO comdao1) {
		this.comdao1 = comdao1;
	}


	public ComFile getCom() {
		return com;
	}


	public void setCom(ComFile com) {
		this.com = com;
	}
public static void main(String[] args) {
	 List<ComCus>  list  = new jcxxComFileServiceImp().findAll();
	 System.out.println("------------------>"+list.size());
}



}
