package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.jcxx_ComFileDAO;
import com.ydsn.tms.po.ComFile;

/**
 * 基础信息 商品档案-实现类
 *@author  孙军
 *2015年6月9日 上午9:58:40
 */
public class jcxx_ComFileDAOImp extends BaseDAO<ComFile> implements jcxx_ComFileDAO{
   public void add(ComFile com){
		super.add(com);
	}
   public  void update(ComFile com){
    	super.update(com);
    }
   public void deleteById(String g_id){
    	super.deleteById(ComFile.class, g_id);
    }
   public List<Object[]> findByName(String g_name){
	   String sql="select *from comFile com where com.g_name='"+g_name+"'";
	   return super.findByName(sql);
   }

@Override
public List<ComFile> findCom() {
	String hql="from ComFile";
	return super.findAll(hql);
}
   
@Override
public List<Object[]> findById(String g_id) {
	String sql="select *from comFile com where com.g_id='"+g_id+"'";
	return super.findById(sql);
}
@Override
public  List<Object[]> findByName2(String g_name) {
	String sql="select *from comFile com where com.g_name='"+g_name+"'";
	return super.findByName2(sql);
}
}
