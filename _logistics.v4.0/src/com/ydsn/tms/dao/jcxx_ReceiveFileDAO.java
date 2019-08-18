package com.ydsn.tms.dao;
import java.util.List;

import com.ydsn.tms.po.jcxx_ReceiveFile;
public  interface jcxx_ReceiveFileDAO{
	void add(jcxx_ReceiveFile rec);
	void update(jcxx_ReceiveFile rec);
	void deleteById(String  rec_id);
	List<Object[]> findBillById(String rec_id);
	List<Object[]> findIdByBill(String rec_bill);
	List<jcxx_ReceiveFile> findAll();
	List<jcxx_ReceiveFile> findAllBySplite(int currentPage,int pageSize);
	List<jcxx_ReceiveFile> findAllBySpliteAndLike(jcxx_ReceiveFile rec,int currentPage,int pageSize);
}











