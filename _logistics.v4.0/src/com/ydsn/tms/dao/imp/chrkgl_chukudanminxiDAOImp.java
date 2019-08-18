package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.chrkgl_chukudanminxiDAO;
import com.ydsn.tms.po.chrkgl_chukudanminxi;

/**
 * ��������ģ�顪�����ⵥ��ϸ���ݷ��ʲ㣨ʵ���ࣩ
 *@author  ���
 *2015��6��17�� ����10:09:14
 */
public class chrkgl_chukudanminxiDAOImp extends BaseDAO<chrkgl_chukudanminxi> implements chrkgl_chukudanminxiDAO{
	public void add(chrkgl_chukudanminxi cmx){
		super.add(cmx);
	}
	public void deleteById(String chkmx_bill) {
		super.deleteById(chrkgl_chukudanminxi.class, chkmx_bill);
	}

	public List<chrkgl_chukudanminxi> findAll() {
		String hql="from chrkgl_chukudanminxi";
		return super.findAll(hql);
	}

	public List<chrkgl_chukudanminxi> findAllByLike(chrkgl_chukudanminxi cmx) {
		String hql="from chrkgl_chukudanminxi cmx where cmx.chkhw_num like ? and cmx.chkmxshp_id like ? and cmx.chkshch_date like ?";
		String [] params={cmx.getChkhw_num(),cmx.getChkmxshp_id(),cmx.getChkshch_date()};
		return super.findByLike(hql, params);
	}

	public List<chrkgl_chukudanminxi> findAllBySplite(int currentPage,
			int pageSize) {
		String hql="from chrkgl_chukudanminxi";
		return super.findBySplitePage(hql, currentPage, pageSize);
	}

	public List<chrkgl_chukudanminxi> findAllBySpliteAndLike(
			chrkgl_chukudanminxi cmx, int currentPage, int pageSize) {
		String hql="from chrkgl_chukudanminxi cmx where cmx.chkhw_num like ? and cmx.chkmxshp_id like ? and cmx.chkshch_date like ?";
		String [] params={cmx.getChkhw_num(),cmx.getChkmxshp_id(),cmx.getChkshch_date()};
		return super.findBySplitePageAndLike(hql, currentPage, pageSize, params);
	}

}
