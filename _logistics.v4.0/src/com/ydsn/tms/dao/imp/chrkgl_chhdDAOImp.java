package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.chrkgl_chhdDAO;
import com.ydsn.tms.po.chrkgl_chhd;

/**
 * 出入库管理模块——出货单数据访问层实现类
 *@author  孙军
 *2015年6月16日 上午9:38:00
 */
public class chrkgl_chhdDAOImp extends BaseDAO<chrkgl_chhd> implements chrkgl_chhdDAO{

	public void add(chrkgl_chhd chd){
		super.add(chd);
	}
	public void update(chrkgl_chhd chd){
		super.update(chd);
	}
	public List<chrkgl_chhd> findAll() {
		String hql="from chrkgl_chhd";
		return super.findAll(hql);
	}

	public List<chrkgl_chhd> findByLike(chrkgl_chhd chd) {
		String hql="from chrkgl_chhd chd where chd.chk_bm like ? and chd.chk_date like ? and chd.shh_man like ?";
		String [] params={chd.getChk_bm(),chd.getChk_date(),chd.getShh_man()};
		return super.findByLike(hql, params);
	}

	public List<chrkgl_chhd> findBySplite(int currentPage, int pageSize) {
		String hql="from chrkgl_chhd";
		return super.findBySplitePage(hql, currentPage, pageSize);
	}

	public List<chrkgl_chhd> findBySpliteAndLike(chrkgl_chhd chd,
			int currentPage, int pageSize) {
		String hql="from chrkgl_chhd chd where chd.chk_bm like ? and chd.chk_date like ? and chd.shh_man like ?";
		String [] params={chd.getChk_bm(),chd.getChk_date(),chd.getShh_man()};
		return super.findBySplitePageAndLike(hql, currentPage, pageSize, params);
	}

}
