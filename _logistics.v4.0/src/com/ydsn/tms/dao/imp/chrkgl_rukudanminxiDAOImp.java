package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.chrkgl_rukudanminxiDAO;
import com.ydsn.tms.po.chrkgl_rukudanminxi;

/**
 *   ��������ģ�顪����ⵥ��ϸ���ݷ��ʲ�ʵ����
 *@author  ���
 *2015��6��17�� ����8:31:14
 */
public class chrkgl_rukudanminxiDAOImp extends BaseDAO<chrkgl_rukudanminxi> implements chrkgl_rukudanminxiDAO{

	public void add(chrkgl_rukudanminxi rmx){
		super.add(rmx);
	}
	public void deleteById(String rkmx_bill) {
		super.deleteById(chrkgl_rukudanminxi.class, rkmx_bill);
	}
	
	public List<chrkgl_rukudanminxi> findAll() {
		String hql="from chrkgl_rukudanminxi";
		return super.findAll(hql);
	}

	
	public List<chrkgl_rukudanminxi> findAllByLike(chrkgl_rukudanminxi rmx) {
		  String hql="from chrkgl_rukudanminxi rmx where rmx.shp_id like ? and rmx.rkhw like ? and rmx.rkhw_num like ?";
		  String[] params={rmx.getShp_id(),rmx.getRkhw(),rmx.getRkhw_num()};
		return super.findByLike(hql, params);
	}

	
	public List<chrkgl_rukudanminxi> findAllBySplite(int currentPage,
			int pageSize) {
		String hql="from chrkgl_rukudanminxi";
		return super.findBySplitePage(hql, currentPage, pageSize);
	}
	
	public List<chrkgl_rukudanminxi> findAllBySpliteAndLike(
			chrkgl_rukudanminxi rmx, int currentPage, int pageSize) {
		 String hql="from chrkgl_rukudanminxi rmx where rmx.shp_id like ? and rmx.rkhw like ? and rmx.rkhw_num like ?";
		  String[] params={rmx.getShp_id(),rmx.getRkhw(),rmx.getRkhw_num()};
		return super.findBySplitePageAndLike(hql, currentPage, pageSize, params);
	}

}
