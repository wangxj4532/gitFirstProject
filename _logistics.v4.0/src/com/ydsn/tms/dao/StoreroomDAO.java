package com.ydsn.tms.dao;
import java.util.List;

import com.ydsn.tms.po.Storeroom;
/**
 *�ⷿ���ݷ��ʲ�ӿ� 
 * 
 *@author  ���
 *2015��6��2�� ����7:19:06
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











