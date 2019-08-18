package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.ddgl_OutComCusDAO;
import com.ydsn.tms.vo.ddgl_OutComCus;

/**
 * ������Ϣģ��-��λ�Ϳⷿ��Ϣ���ݷ��ʣ�ʵ���ࣩ
 *@author  ���
 *2015��6��11�� ����5:34:44
 */
public class ddgl_OutComCusDAOImp extends BaseDAO<ddgl_OutComCus> implements ddgl_OutComCusDAO{
    
	
	@Override
	public List<Object[]> findAll() {
		System.out.println("====1=======");
		String sql="select outO.*,cus.cus_name,com.g_name from outofwarehouseOrder outO , customer cus,comFile com where outO.chkddshp_id=com.g_id and outO.chkddkh_id=cus.cus_id";
		return super.nativeFindAll(sql);
	}

	
	@Override
	public List<Object[]> findAllBySplite(int currentPage, int pageSize) {
		String sql="select outO.*,cus.cus_name,com.g_name from outofwarehouseOrder outO , customer cus,comFile com where outO.chkddshp_id=com.g_id and outO.chkddkh_id=cus.cus_id";
		return super.nativeFindBySplitePage(sql, currentPage, pageSize);
	}

	@Override
	public List<Object[]> findAllBySpliteAndLike(ddgl_OutComCus occ, int currentPage,int pageSize) {
		String sql="select outO.*,cus.cus_name,com.g_name from outofwarehouseOrder outO , customer cus,comFile com where outO.chkddshp_id=com.g_id and outO.chkddkh_id=cus.cus_id"
				+ " and outO.chkorccphx like ? and outO.khchkdd_bill like ? and outO.khdd_amount like ? and outO.dd_date like ? and outO.chkddzht_status like ? and outO.yjchk_date like ?"
				+ " and outO.g_name like ? and outO.cus_name like ?";
		String [] params={occ.getChkorccphx(),occ.getKhchkdd_bill(),occ.getKhdd_amount(),occ.getDd_date(),occ.getChkddzht_status(),occ.getYjchk_date(),occ.getG_name(),occ.getCus_name()};
		return super.nativeFindBySplitePageAndLike(sql, currentPage, pageSize, params);
	}


	
	@Override
	public List<Object[]> findAllByLike(ddgl_OutComCus occ) {
		String sql="select outO.*,cus.cus_name,com.g_name from outofwarehouseOrder outO , customer cus,comFile com where outO.chkddshp_id=com.g_id and outO.chkddkh_id=cus.cus_id"
				+ " and outO.chkorccphx like ? and outO.khchkdd_bill like ? and outO.khdd_amount like ? and outO.dd_date like ? and outO.chkddzht_status like ? and outO.yjchk_date like ?"
				+ " and outO.g_name like ? and outO.cus_name like ?";
		String [] params={occ.getChkorccphx(),occ.getKhchkdd_bill(),occ.getKhdd_amount(),occ.getDd_date(),occ.getChkddzht_status(),occ.getYjchk_date(),occ.getG_name(),occ.getCus_name()};
		return super.nativefindByLike(sql, params);
	}









}
