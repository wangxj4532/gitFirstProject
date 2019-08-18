package com.ydsn.tms.dao;
import java.util.List;

import com.ydsn.tms.po.Storeroom;
/**
 *库房数据访问层接口 
 * 
 *@author  孙军
 *2015年6月2日 下午7:19:06
 */
public  interface StoreroomDAO{
	void add(Storeroom sto);
	void update(Storeroom sto);
	void deleteById(int sto_id);
	List<Object[]> findById(int sto_id);
	List<Object[]> findByName2(String sto_name);
	List<Storeroom> findAll();
	List<Storeroom> findByLike(Storeroom sto);
	List<Storeroom> findAllBySplite(int currentPage,int pageSize);
	List<Storeroom> findAllBySpliteAndLike(Storeroom sto,int currentPage,int pageSize);
}











