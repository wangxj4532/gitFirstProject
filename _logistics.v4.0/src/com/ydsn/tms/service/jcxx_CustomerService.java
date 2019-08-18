package com.ydsn.tms.service;
import java.util.List;
import com.ydsn.tms.po.Customer;
/**
 * 库房业务层---（接口）
 * 
 *@author  孙军
 *2015年6月2日 下午7:32:08
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


















