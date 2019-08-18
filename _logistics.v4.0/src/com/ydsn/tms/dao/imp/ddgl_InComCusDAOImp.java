package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.ddgl_InComCusDAO;
import com.ydsn.tms.vo.ddgl_InComCus;

/**
 * ������Ϣģ��-��λ�Ϳⷿ��Ϣ���ݷ��ʣ�ʵ���ࣩ
 *@author  ���
 *2015��6��11�� ����5:34:44
 */
public class ddgl_InComCusDAOImp extends BaseDAO<ddgl_InComCus> implements ddgl_InComCusDAO{
    
	
	@Override
	public List<Object[]> findAll() {
		String sql="select inO.*��cus.cus_name,com.g_name from enterwarehouseOrder inO , customer cus,comFile com where inO.rkddshp_id=com.g_id and inO.rkddkh_id=cus.cus_id";
		return super.nativeFindAll(sql);
	}

	
	@Override
	public List<Object[]> findAllBySplite(int currentPage, int pageSize) {
		String sql="select inO.*��cus.cus_name,com.g_name from enterwarehouseOrder inO , customer cus,comFile com where inO.rkddshp_id=com.g_id and inO.rkddkh_id=cus.cus_id";
		return super.nativeFindBySplitePage(sql, currentPage, pageSize);
	}

	@Override
	public List<Object[]> findAllBySpliteAndLike(ddgl_InComCus icc, int currentPage,int pageSize) {
		String sql="select inO.*��cus.cus_name,com.g_name from enterwarehouseOrder inO , customer cus,comFile com where inO.rkddshp_id=com.g_id and inO.rkddkh_id=cus.cus_id"
				+ " and inO.khdd_bill like ? and inO.rk_amount like ? and inO.rkorfprk like ? and inO.rkdd_status like ? and inO.xd_date like ? and inO.yjrk_date like ?"
				+ " and inO.g_name like ? and inO.cus_name like ?";
		String [] params={icc.getKhdd_bill(),icc.getRk_amount(),icc.getRkorfprk(),icc.getRkdd_status(),icc.getXd_date(),icc.getG_name(),icc.getCus_name()};
		return super.nativeFindBySplitePageAndLike(sql, currentPage, pageSize, params);
	}


	
	@Override
	public List<Object[]> findAllByLike(ddgl_InComCus icc) {
		String sql="select inO.*��cus.cus_name,com.g_name from enterwarehouseOrder inO , customer cus,comFile com where inO.rkddshp_id=com.g_id and inO.rkddkh_id=cus.cus_id"
				+ " and inO.khdd_bill like ? and inO.rk_amount like ? and inO.rkorfprk like ? and inO.rkdd_status like ? and inO.xd_date like ? and inO.yjrk_date like ?"
				+ " and inO.g_name like ? and inO.cus_name like ?";
		String [] params={icc.getKhdd_bill(),icc.getRk_amount(),icc.getRkorfprk(),icc.getRkdd_status(),icc.getXd_date(),icc.getG_name(),icc.getCus_name()};
		return super.nativefindByLike(sql, params);
	}






}
