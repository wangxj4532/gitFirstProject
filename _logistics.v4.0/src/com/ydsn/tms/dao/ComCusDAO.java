package com.ydsn.tms.dao;
import java.util.List;
import com.ydsn.tms.vo.ComCus;
/**
 * ������Ϣ-��Ʒ���ݲ����ӿ�
 * 
 *@author  ���
 *2015��6��5�� ����12:11:39
 */
public  interface ComCusDAO{
	List<Object[]> findAll();
	List<Object[]>  findAllBySplite(int currentPage,int pageSize);
	List<Object[]>  findAllBySpliteAndLike(ComCus cc,int currentPage,int pageSize);
	
}











