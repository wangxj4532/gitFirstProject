package com.ydsn.tms.service;
import java.util.List;
import com.ydsn.tms.po.Customer;
/**
 * �ⷿҵ���---���ӿڣ�
 * 
 *@author  ���
 *2015��6��2�� ����7:32:08
 */
public interface jcxx_CustomerService {
	  List<Customer> findAll();
	  List<Customer> findByLike(Customer cus);
	  void addCus(Customer cus);
	  void updateCus(Customer cus);
	  void deleteCusById(String cus_id);
	  List<Customer> findAllBySpliteAndLike(Customer cus,int currentPage,int pageSize);
	  List<Customer> findAllBySplite(int currentPage,int pageSize);
}


















