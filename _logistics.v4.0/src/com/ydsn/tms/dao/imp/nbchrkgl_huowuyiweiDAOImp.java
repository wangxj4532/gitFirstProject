package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.nbchrkgl_huowuyiweiDAO;
import com.ydsn.tms.po.nbchrkgl_huowuyiwei;

/**
 *内部出入库管理模块——货物移位数据访问层（实现类） 
 *@author  孙军
 *2015年6月15日 下午2:32:26
 */
public class nbchrkgl_huowuyiweiDAOImp extends BaseDAO<nbchrkgl_huowuyiwei> implements nbchrkgl_huowuyiweiDAO{
    
	public void add(nbchrkgl_huowuyiwei yw){
		super.add(yw);
	}
	public void update(nbchrkgl_huowuyiwei yw){
		super.update(yw);
	}
	public void deleteById(String hwyw_bill) {
		super.deleteById(nbchrkgl_huowuyiwei.class, hwyw_bill);
	}

	public List<nbchrkgl_huowuyiwei> findAll() {
		String hql="from nbchrkgl_huowuyiwei";
		return super.findAll(hql);
	}

	public List<nbchrkgl_huowuyiwei> findByLike(nbchrkgl_huowuyiwei yw) {
		String hql="from nbchrkgl_huowuyiwei yw where yw.hwychhw_id like ? and yw.hwyrhw_id like ? and yw.hwywshp_id like ? "
				+ "and yw.hwywck_id like ? and yw.hwyw_num like ? and yw.hwywbzhgg like ? and "
				+ "yw.hwyw_amount like ? and yw.hwyw_reason like ?";
		String[] params={yw.getHwychhw_id(),yw.getHwyrhw_id(),yw.getHwywshp_id(),yw.getHwywck_id(),yw.getHwyw_num(),yw.getHwywbzhgg(),yw.getHwyw_amount(),yw.getHwyw_reason()};
		return super.findByLike(hql, params);
	}

	public List<nbchrkgl_huowuyiwei> findBySplite(int currentPage, int pageSize) {
		String hql="from nbchrkgl_huowuyiwei";
		return super.findBySplitePage(hql, currentPage, pageSize);
	}

	public List<nbchrkgl_huowuyiwei> findBySpliteAndLike(
			nbchrkgl_huowuyiwei yw, int currentPage, int pageSize) {
		String hql="from nbchrkgl_huowuyiwei yw where yw.hwychhw_id like ? and yw.hwyrhw_id like ? and yw.hwywshp_id like ? "
				+ "and yw.hwywck_id like ? and yw.hwyw_num like ? and yw.hwywbzhgg like ? and "
				+ "yw.hwyw_amount like ? and yw.hwyw_reason like ?";
		String[] params={yw.getHwychhw_id(),yw.getHwyrhw_id(),yw.getHwywshp_id(),yw.getHwywck_id(),yw.getHwyw_num(),yw.getHwywbzhgg(),yw.getHwyw_amount(),yw.getHwyw_reason()};
		return super.findBySplitePageAndLike(hql, currentPage, pageSize, params);
	}

}
