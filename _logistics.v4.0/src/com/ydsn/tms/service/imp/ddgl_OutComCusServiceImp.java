package com.ydsn.tms.service.imp;

import java.util.List;

import com.ydsn.tms.dao.ddgl_OutComCusDAO;
import com.ydsn.tms.dao.ddgl_OutofwarehouseOrderDAO;
import com.ydsn.tms.dao.jcxx_ComFileDAO;
import com.ydsn.tms.dao.jcxx_CustomerDAO;
import com.ydsn.tms.po.ddgl_outofwarehouseOrder;
import com.ydsn.tms.service.ddgl_OutComCusService;
import com.ydsn.tms.util.Array2object;
import com.ydsn.tms.util.DateTools;
import com.ydsn.tms.util.IDFactory;
import com.ydsn.tms.vo.ddgl_OutComCus;

/**
 *订单管理模块——业务层出库订单CRUD（实现类） 
 *@author  孙军
 *2015年6月11日 下午5:59:13
 */
public class ddgl_OutComCusServiceImp implements ddgl_OutComCusService{
    private ddgl_OutComCusDAO outdao;
    private ddgl_OutofwarehouseOrderDAO outdao1;
	private jcxx_ComFileDAO comdao3;
	private jcxx_CustomerDAO cusdao3;
	@Override
	public void addOut(ddgl_OutComCus occ) {
		ddgl_outofwarehouseOrder out=new ddgl_outofwarehouseOrder();
		out.setChkdd_bill(IDFactory.createChkdd_bill());
		out.setChkdd_man("刘德华");
		out.setChkddkh_id(cusdao3.findByName(occ.getCus_name()).get(0)[0].toString());
		out.setChkddshp_id(comdao3.findByName(occ.getG_name()).get(0)[0].toString());
		out.setChkddzhd_time(DateTools.createRkddzhd_time());
		out.setChkddzht_status(occ.getChkddzht_status());
		out.setChkorccphx(occ.getChkorccphx());
		out.setDd_date(occ.getDd_date());
		out.setKhchkdd_bill(occ.getKhchkdd_bill());
		out.setKhdd_amount(occ.getKhdd_amount());
		out.setYjchk_date(occ.getYjchk_date());
		outdao1.add(out);
		
	}
	@Override
	public void updateOut(ddgl_OutComCus occ) {
		ddgl_outofwarehouseOrder out=new ddgl_outofwarehouseOrder();
		out.setChkdd_bill(occ.getChkdd_bill());
		out.setChkdd_man(occ.getChkdd_man());
		out.setChkddkh_id(occ.getChkddkh_id());
		out.setChkddshp_id(occ.getChkddshp_id());
		out.setChkddzhd_time(DateTools.createRkddzhd_time());
		out.setChkddzht_status(occ.getChkddzht_status());
		out.setChkorccphx(occ.getChkorccphx());
		out.setDd_date(occ.getDd_date());
		out.setKhchkdd_bill(occ.getKhchkdd_bill());
		out.setKhdd_amount(occ.getKhdd_amount());
		out.setYjchk_date(occ.getYjchk_date());
		outdao1.update(out);
		
	}
	
	@Override
	public void deleteById(ddgl_OutComCus occ) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<ddgl_OutComCus> findAllBySpliteAndLike(ddgl_OutComCus occ,
			int currentPage, int pageSize) {
		List<Object[]> list=outdao.findAllBySpliteAndLike(occ, currentPage, pageSize);
		return Array2object.Array2OutComCus(list);
	}
	@Override
	public List<ddgl_OutComCus> findAllBySplite(int currentPage, int pageSize) {
		List<Object[]> list=outdao.findAllBySplite(currentPage, pageSize);
		return Array2object.Array2OutComCus(list);
	}
	@Override
	public List<ddgl_OutComCus> findAllByLike(ddgl_OutComCus occ) {
		List<Object[]> list=outdao.findAllByLike(occ);
		return Array2object.Array2OutComCus(list);
	}
	@Override
	public List<ddgl_OutComCus> findAll() {
		List<Object[]> list=outdao.findAll();
		return Array2object.Array2OutComCus(list);
	}

	
	public List<ddgl_outofwarehouseOrder> findAllBill() {
		return outdao1.findAllBill();
	}


//--------------------------get/set 构造器--------------------------------------------------------------------------------
	
	public ddgl_OutComCusDAO getOutdao() {
		return outdao;
	}
	public void setOutdao(ddgl_OutComCusDAO outdao) {
		this.outdao = outdao;
	}
	public ddgl_OutofwarehouseOrderDAO getOutdao1() {
		return outdao1;
	}
	public void setOutdao1(ddgl_OutofwarehouseOrderDAO outdao1) {
		this.outdao1 = outdao1;
	}
	public jcxx_ComFileDAO getComdao3() {
		return comdao3;
	}
	public void setComdao3(jcxx_ComFileDAO comdao3) {
		this.comdao3 = comdao3;
	}
	public jcxx_CustomerDAO getCusdao3() {
		return cusdao3;
	}
	public void setCusdao3(jcxx_CustomerDAO cusdao3) {
		this.cusdao3 = cusdao3;
	}







}
