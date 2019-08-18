package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.chrkgl_rukudanDAO;
import com.ydsn.tms.po.chrkgl_rukudan;

/**
 *��������ģ�顪����ⵥ���ݷ��ʲ�ʵ���� 
 *@author  ���
 *2015��6��17�� ����8:32:39
 */
public class chrkgl_rukudanDAOImp extends BaseDAO<chrkgl_rukudan> implements chrkgl_rukudanDAO{
	public void add(chrkgl_rukudan rkd){
		System.out.println("=3=");
		super.add(rkd);
	}
	public void update(chrkgl_rukudan rkd){
		super.update(rkd);
	}
	public List<chrkgl_rukudan> findAll(){
		String hql="from chrkgl_rukudan";
		return super.findAll(hql);
	}
	public List<chrkgl_rukudan> findByLike(chrkgl_rukudan rkd){
		String hql="from chrkgl_rukudan rkd where rkd.kh_id like ? and rkd.rkdd_id like ? and rkd.rkorfprk like ?";
		String[] params={rkd.getKh_id(),rkd.getRkdd_id(),rkd.getRkorfprk()};
		return super.findByLike(hql, params);
	}
	public List<chrkgl_rukudan> findBySplite(int currentPage,int pageSize){
		String hql="from chrkgl_rukudan";
		return super.findBySplitePage(hql, currentPage, pageSize);
	}
	public List<chrkgl_rukudan> findBySpliteAndLike(chrkgl_rukudan rkd,int currentPage,int pageSize){
		String hql="from chrkgl_rukudan rkd where rkd.kh_id like ? and rkd.rkdd_id like ? and rkd.rkorfprk like ?";
		String[] params={rkd.getKh_id(),rkd.getRkdd_id(),rkd.getRkorfprk()};
		return super.findBySplitePageAndLike(hql, currentPage, pageSize, params);
	}
}
