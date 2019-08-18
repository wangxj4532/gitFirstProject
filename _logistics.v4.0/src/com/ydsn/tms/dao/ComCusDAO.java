package com.ydsn.tms.dao;
import java.util.List;
import com.ydsn.tms.vo.ComCus;
/**
 * 基础信息-商品数据操作接口
 * 
 *@author  孙军
 *2015年6月5日 下午12:11:39
 */
public  interface ComCusDAO{
	List<Object[]> findAll();
	List<Object[]>  findAllBySplite(int currentPage,int pageSize);
	List<Object[]>  findAllBySpliteAndLike(ComCus cc,int currentPage,int pageSize);
	
}











