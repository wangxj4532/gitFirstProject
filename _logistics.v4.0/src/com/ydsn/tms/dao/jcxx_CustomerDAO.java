package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.po.Customer;

/**
 * ������Ϣ- �ͻ�������(�ӿ�)
 *@author  ���
 *2015��6��9�� ����10:54:04
 */
public interface jcxx_CustomerDAO {

	List<Object[]>  findByName(String cus_name);
	List<Object[]>  findNameById(String cus_id);
	List<Customer> findAll();
	void add(Customer cus);
	void update(Customer cus);
	void deleteById(String cus_id);
	List<Customer> findByLike(Customer cus);
	List<Customer> findAllBySplite(int currentPage,int pageSize);
	List<Customer> findAllBySpliteAndLike(Customer cus,int currentPage,int pageSize);
}
