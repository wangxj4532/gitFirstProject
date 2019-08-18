package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.jcxx_CargoSpaceDAO;
import com.ydsn.tms.po.jcxx_CargoSpace;

/**
 * 
 *@author  孙军
 *2015年6月11日 下午8:20:08
 */
public class jcxx_CargoSpaceImp extends BaseDAO<jcxx_CargoSpace> implements jcxx_CargoSpaceDAO{

	
	@Override
	public void add(jcxx_CargoSpace cargo) {
		super.add(cargo);
	}

	
	@Override
	public void update(jcxx_CargoSpace cargo) {
		super.update(cargo);
		
	}
	@Override
	public List<Object[]> findById(String car_id) {
		String sql="select *from cargoSpace cs where cs.car_id='"+car_id+"'";
		return super.findById(sql);
	}
	@Override
	public  List<Object[]> findByName2(String car_bill) {
		String sql="select *from cargoSpace cs where cs.car_bill='"+car_bill+"'";
		return super.findByName2(sql);
	}

	@Override
	public List<jcxx_CargoSpace> findCar() {
		String hql="from jcxx_CargoSpace";
		return super.findAll(hql);
	}


}
