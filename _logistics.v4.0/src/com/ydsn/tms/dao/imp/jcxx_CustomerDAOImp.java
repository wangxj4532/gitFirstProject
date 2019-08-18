package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.jcxx_CustomerDAO;
import com.ydsn.tms.po.Customer;

/**
 * 
 *@author  孙军
 *2015年6月9日 上午10:59:14
 */
public class jcxx_CustomerDAOImp extends BaseDAO<Customer> implements jcxx_CustomerDAO{
	public List<Object[]> findByName(String cus_name){
		String sql="select * from customer cu where cu.cus_name='"+cus_name+"'";
		return super.findByName(sql);
	}

	public List<Customer> findAll() {
		String hql="from Customer";
		return super.findAll(hql);
	}
	public void add(Customer cus){
		super.add(cus);
	}
	public void update(Customer cus){
		super.update(cus);
	}
	public void deleteById(String cus_id){
		super.deleteById(Customer.class, cus_id);
	}
	public List<Customer> findByLike(Customer cus){
		String hql="from Customer cus where  cus.cus_name like ? and cus.cus_linkman like ? and cus.cus_addr like ?";
		String[] params={cus.getCus_name(),cus.getCus_linkman(),cus.getCus_addr()};
		return super.findByLike(hql, params);
	}
	public List<Customer> findAllBySplite(int currentPage,int pageSize){
		String hql="from Customer";
		return super.findBySplitePage(hql, currentPage, pageSize);
	}
	public List<Customer> findAllBySpliteAndLike(Customer cus,int currentPage,int pageSize){
		String hql="from Customer cus where  cus.cus_name like ? and cus.cus_linkman like ? and cus.cus_addr like ?";
		String[] params={cus.getCus_name(),cus.getCus_linkman(),cus.getCus_addr()};
		return super.findBySplitePageAndLike(hql, currentPage, pageSize,params);
	}

	public List<Object[]> findNameById(String cus_id) {
		String sql="select * from customer cu where cu.cus_id='"+cus_id+"'";
		return super.findById(sql);
	}
}
