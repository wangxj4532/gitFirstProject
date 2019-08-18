package com.ydsn.tms.dao.imp;
import java.util.List;

import org.apache.log4j.Logger;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.StoreroomDAO;
import com.ydsn.tms.po.Storeroom;
/**
 * 库房数据访问层---（实现类）
 * 
 *@author  孙军
 *2015年6月2日 下午7:22:14
 */
public class StoreroomDAOImp extends BaseDAO<Storeroom> implements StoreroomDAO{
	Logger logger=Logger.getLogger(StoreroomDAOImp.class);
	public void add(Storeroom sto){
		logger.warn("=====addDAO excuted success!!=======");
		super.add(sto);
	}
	public void update(Storeroom sto){
		super.update(sto);
	}
	public void deleteById(int sto_id){
		super.deleteById(Storeroom.class,sto_id);
	}
	public List<Storeroom> findAll(){
		String hql="from Storeroom";
		return super.findAll(hql);
	}
	public List<Storeroom> findAllBySplite(int currentPage,int pageSize){
		String hql="from Storeroom";
		return super.findBySplitePage(hql, currentPage, pageSize);
	}
	public List<Storeroom> findAllBySpliteAndLike(Storeroom sto,int currentPage,int pageSize){
		String hql="from Storeroom sto where  sto.sto_bill like ? and sto.sto_name like ? and sto.sto_phone like ? and sto.sto_addr like ? and sto.sto_man like ?";
		String[] params={sto.getSto_bill(),sto.getSto_name(),sto.getSto_phone(),sto.getSto_addr(),sto.getSto_man()};
		return super.findBySplitePageAndLike(hql, currentPage, pageSize,params);
	}
	
	@Override
	public List<Storeroom> findByLike(Storeroom sto) {
		String hql="from Storeroom sto where  sto.sto_bill like ? and sto.sto_name like ? and sto.sto_phone like ? and sto.sto_addr like ? and sto.sto_man like ?";
		String[] params={sto.getSto_bill(),sto.getSto_name(),sto.getSto_phone(),sto.getSto_addr(),sto.getSto_man()};
		return super.findByLike(hql, params);
	}
	
	@Override
	public List<Object[]> findById(int sto_id) {
		String sql="select *from storeroom sto where sto.sto_id='"+sto_id+"'";
		return super.findById(sql);
	}
	@Override
	public  List<Object[]> findByName2(String sto_name) {
		String sql="select *from storeroom sto where sto.sto_name='"+sto_name+"'";
		return super.findByName2(sql);
	}
}











