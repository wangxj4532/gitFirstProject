package com.ydsn.tms.dao.imp;
import java.util.List;

import org.apache.log4j.Logger;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.jcxx_ReceiveFileDAO;
import com.ydsn.tms.po.jcxx_ReceiveFile;

public class jcxx_ReceiveFileDAOImp extends BaseDAO<jcxx_ReceiveFile> implements jcxx_ReceiveFileDAO{
	Logger logger=Logger.getLogger(jcxx_ReceiveFileDAOImp.class);
	public void add(jcxx_ReceiveFile rec){
		logger.warn("=====addDAO excuted success!!=======");
		super.add(rec);
	}
	public void update(jcxx_ReceiveFile rec){
		super.update(rec);
	}
	public void deleteById(String rec_id){
		super.deleteById(jcxx_ReceiveFile.class,rec_id);
	}
	public List<jcxx_ReceiveFile> findAll(){
		String hql="from jcxx_ReceiveFile";
		return super.findAll(hql);
	}
	public List<jcxx_ReceiveFile> findAllBySplite(int currentPage,int pageSize){
		String hql="from jcxx_ReceiveFile";
		return super.findBySplitePage(hql, currentPage, pageSize);
	}
	public List<jcxx_ReceiveFile> findAllBySpliteAndLike(jcxx_ReceiveFile rec,int currentPage,int pageSize){
		String hql="from jcxx_ReceiveFile rec where  rec.rec_name like ? and  rec.rec_addr like ? and rec.rec_time like ?";
		String[] params={rec.getRec_name(),rec.getRec_addr(),rec.getRec_time()};
		return super.findBySplitePageAndLike(hql,currentPage,pageSize, params);
	}
	
	public List<Object[]> findBillById(String rec_id) {
		String sql="select *from receiveFile rec where rec.rec_id='"+rec_id+"'";
		return super.findById(sql);
	}
	public List<Object[]> findIdByBill(String rec_bill) {
		String sql="select *from receiveFile rec where rec.rec_bill='"+rec_bill+"'";
		return super.findByName(sql);
	}
}











