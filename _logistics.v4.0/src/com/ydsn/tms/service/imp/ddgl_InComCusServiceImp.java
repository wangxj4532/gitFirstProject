package com.ydsn.tms.service.imp;

import java.util.List;

import com.ydsn.tms.dao.ddgl_InComCusDAO;
import com.ydsn.tms.dao.ddgl_enterwarehouseOrderDAO;
import com.ydsn.tms.dao.jcxx_ComFileDAO;
import com.ydsn.tms.dao.jcxx_CustomerDAO;
import com.ydsn.tms.po.ddgl_enterwarehouseOrder;
import com.ydsn.tms.service.ddgl_InComCusService;
import com.ydsn.tms.util.Array2object;
import com.ydsn.tms.util.DateTools;
import com.ydsn.tms.util.IDFactory;
import com.ydsn.tms.vo.ddgl_InComCus;

/**
 *订单管理模块——业务层入库订单CRUD（实现类） 
 *@author  孙军
 *2015年6月11日 下午5:59:13
 */
public class ddgl_InComCusServiceImp implements ddgl_InComCusService{
    private ddgl_InComCusDAO indao;
    private ddgl_enterwarehouseOrderDAO indao1;
	private jcxx_ComFileDAO comdao2;
	private jcxx_CustomerDAO cusdao2;
	@Override
	public void addIn(ddgl_InComCus icc) {
		ddgl_enterwarehouseOrder ent=new ddgl_enterwarehouseOrder();
		ent.setKhdd_bill(icc.getKhdd_bill());
		ent.setRk_amount(icc.getRk_amount());
		ent.setRkdd_bill(IDFactory.createRkdd_bill());
		ent.setRkdd_status(icc.getRkdd_status());
		ent.setRkddkh_id(cusdao2.findByName(icc.getCus_name()).get(0)[0].toString());
		ent.setRkddshp_id(comdao2.findByName(icc.getG_name()).get(0)[0].toString());
		ent.setRkddzhd_man("刘德华");
		ent.setRkddzhd_time(DateTools.createRkddzhd_time());
		ent.setRkorfprk(icc.getRkorfprk());
		ent.setXd_date(icc.getXd_date());
		ent.setYjrk_date(icc.getYjrk_date());
		indao1.add(ent);
	}

	
	@Override
	public void updateIn(ddgl_InComCus icc) {
		ddgl_enterwarehouseOrder ent=new ddgl_enterwarehouseOrder();
		ent.setKhdd_bill(icc.getKhdd_bill());
		ent.setRk_amount(icc.getRk_amount());
		ent.setRkdd_bill(icc.getRkdd_bill());
		ent.setRkdd_status(icc.getRkdd_status());
		ent.setRkddkh_id(icc.getRkddkh_id());
		ent.setRkddshp_id(icc.getRkddshp_id());
		ent.setRkddzhd_man(icc.getRkddzhd_man());
		ent.setRkddzhd_time(DateTools.createRkddzhd_time());
		ent.setRkorfprk(icc.getRkorfprk());
		ent.setXd_date(icc.getXd_date());
		ent.setYjrk_date(icc.getYjrk_date());
		indao1.update(ent);
		
	}

	
	@Override
	public void deleteById(ddgl_InComCus icc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ddgl_InComCus> findAllBySpliteAndLike(ddgl_InComCus icc,
			int currentPage, int pageSize) {
		List<Object[]> list=indao.findAllBySpliteAndLike(icc, currentPage, pageSize);
		return Array2object.Array2InComCus(list);
	}

	@Override
	public List<ddgl_InComCus> findAllBySplite(int currentPage, int pageSize) {
		List<Object[]> list=indao.findAllBySplite(currentPage, pageSize);
		return Array2object.Array2InComCus(list);
	}

	@Override
	public List<ddgl_InComCus> findAllByLike(ddgl_InComCus icc) {
		List<Object[]> list=indao.findAllByLike(icc);
		return Array2object.Array2InComCus(list);
	}

	@Override
	public List<ddgl_InComCus> findAll() {
		List<Object[]> list=indao.findAll();
		return Array2object.Array2InComCus(list);
	}

	
	@Override
	public List<ddgl_enterwarehouseOrder> findAllBill() {
		
		return indao1.findAllBill();
	}

//--------------------------get/set 构造器--------------------------------------------------------------------------------
	
	public ddgl_InComCusDAO getIndao() {
		return indao;
	}

	public void setIndao(ddgl_InComCusDAO indao) {
		this.indao = indao;
	}

	public ddgl_InComCusServiceImp() {
	}

	public ddgl_InComCusServiceImp(ddgl_InComCusDAO indao) {
		this.indao = indao;
	}


	public ddgl_enterwarehouseOrderDAO getIndao1() {
		return indao1;
	}


	public void setIndao1(ddgl_enterwarehouseOrderDAO indao1) {
		this.indao1 = indao1;
	}


	public ddgl_InComCusServiceImp(ddgl_enterwarehouseOrderDAO indao1) {
		super();
		this.indao1 = indao1;
	}


	public jcxx_ComFileDAO getComdao2() {
		return comdao2;
	}


	public void setComdao2(jcxx_ComFileDAO comdao2) {
		this.comdao2 = comdao2;
	}


	public jcxx_CustomerDAO getCusdao2() {
		return cusdao2;
	}


	public void setCusdao2(jcxx_CustomerDAO cusdao2) {
		this.cusdao2 = cusdao2;
	}


    





}
