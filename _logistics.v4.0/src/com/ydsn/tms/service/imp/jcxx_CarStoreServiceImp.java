package com.ydsn.tms.service.imp;

import java.util.List;

import com.ydsn.tms.dao.jcxx_CarStoreDAO;
import com.ydsn.tms.dao.jcxx_CargoSpaceDAO;
import com.ydsn.tms.po.jcxx_CargoSpace;
import com.ydsn.tms.service.jcxx_CarStoreService;
import com.ydsn.tms.util.Array2object;
import com.ydsn.tms.util.IDFactory;
import com.ydsn.tms.vo.jcxx_CarStore;

/**
 * 
 *@author  孙军
 *2015年6月11日 下午5:59:13
 */
public class jcxx_CarStoreServiceImp implements jcxx_CarStoreService{
    private jcxx_CarStoreDAO cardao;
    private jcxx_CargoSpaceDAO cardao1;
	

	@Override
	public void addCar(jcxx_CarStore car) {
		System.out.println("==测试2=");
		jcxx_CargoSpace cargo=new jcxx_CargoSpace();
		String car_bill=car.getCar_bill();
		cargo.setCar_bill(car_bill);
		cargo.setCar_desc(car.getCar_desc());
		cargo.setCar_id(IDFactory.createCar_id(car_bill));
		cargo.setCar_remark(car.getCar_remark());
		cargo.setSto_id("10161");
		cardao1.add(cargo);
	}

	
	@Override
	public void updateCar(jcxx_CarStore car) {
		jcxx_CargoSpace cargo=new jcxx_CargoSpace();
		cargo.setCar_bill(car.getCar_bill());
		cargo.setCar_desc(car.getCar_desc());
		cargo.setCar_id(car.getCar_id());
		cargo.setCar_remark(car.getCar_remark());
		cargo.setSto_id(car.getSto_id());
		cardao1.update(cargo);
	}

	
	@Override
	public List<jcxx_CarStore> findAllBySpliteAndLike(jcxx_CarStore car,int currentPage, int pageSize) {
		List<Object[]> list=cardao.findAllBySpliteAndLike(car, currentPage, pageSize);
		return Array2object.Array2CarStore(list);
	}

	
	@Override
	public List<jcxx_CarStore> findAllBySplite(int currentPage, int pageSize) {
		List<Object[]> list=cardao.findAllBySplite(currentPage, pageSize);
		return Array2object.Array2CarStore(list);
	}

	
	@Override
	public List<jcxx_CarStore> findAll() {
		List<Object[]> list=cardao.findAll();
		return Array2object.Array2CarStore(list);
	}
	
	@Override
	public List<jcxx_CarStore> findAllByLike(jcxx_CarStore car) {
		List<Object[]> list=cardao.findAllByLike(car);
		return Array2object.Array2CarStore(list);
	}
	
	@Override
	public List<jcxx_CargoSpace> findCar() {
		
		return cardao1.findCar();
	}
//--------------------------get/set 构造器--------------------------------------------------------------------------------
	
	public jcxx_CarStoreServiceImp(jcxx_CarStoreDAO cardao) {
		this.cardao = cardao;
	}


	public jcxx_CarStoreServiceImp() {
	}


	public jcxx_CarStoreDAO getCardao() {
		return cardao;
	}

	public void setCardao(jcxx_CarStoreDAO cardao) {
		this.cardao = cardao;
	}


	public jcxx_CargoSpaceDAO getCardao1() {
		return cardao1;
	}


	public void setCardao1(jcxx_CargoSpaceDAO cardao1) {
		this.cardao1 = cardao1;
	}







}
