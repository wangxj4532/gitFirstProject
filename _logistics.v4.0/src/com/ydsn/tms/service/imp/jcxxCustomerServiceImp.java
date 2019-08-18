package com.ydsn.tms.service.imp;

import java.util.List;

import org.apache.log4j.Logger;

import com.ydsn.tms.dao.jcxx_CustomerDAO;
import com.ydsn.tms.po.Customer;
import com.ydsn.tms.service.jcxx_CustomerService;
import com.ydsn.tms.util.IDFactory;

/**
 * 库房业务类---（实现类）
 * 
 * @author 孙军 2015年6月2日 下午7:33:45
 */

public class jcxxCustomerServiceImp implements jcxx_CustomerService {
	Logger logger = Logger.getLogger(jcxxCustomerServiceImp.class);
	private jcxx_CustomerDAO cusdao;

	public List<Customer> findAll() {
		return cusdao.findAll();
	}
	@Override
	public List<Customer> findByLike(Customer cus) {
		List<Customer> list=cusdao.findByLike(cus);
		return list;
	}

	@Override
	public void addCus(Customer cus) {
		cus.setCus_id(IDFactory.createCus_id(cus.getCus_bill()));
		cusdao.add(cus);
	}

	@Override
	public void updateCus(Customer cus) {
		cusdao.update(cus);
	}
	
	@Override
	public void deleteCusById(String cus_id) {
		cusdao.deleteById(cus_id);
	}

	@Override
	public List<Customer> findAllBySpliteAndLike(Customer cus, int currentPage,
			int pageSize) {
		List<Customer> list=cusdao.findAllBySpliteAndLike(cus, currentPage, pageSize);
		return list;
	}

	@Override
	public List<Customer> findAllBySplite(int currentPage, int pageSize) {
		List<Customer> list=cusdao.findAllBySplite(currentPage, pageSize);
		return list;
	}
/*----------------------------------------构造器和get/set方法-------------------------------------------------*/

	public jcxx_CustomerDAO getCusdao() {
		return cusdao;
	}

	public void setCusdao(jcxx_CustomerDAO cusdao) {
		this.cusdao = cusdao;
	}

	public jcxxCustomerServiceImp() {
		super();
	}

	public jcxxCustomerServiceImp(jcxx_CustomerDAO cusdao) {
		super();
		this.cusdao = cusdao;
	}

	


    

}
