package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.nbchrkgl_YKStoDAO;
import com.ydsn.tms.vo.nbchrkgl_YKSto;

/**
 * �ڲ���������ģ��--�����ƿ����ݷ��ʲ�ʵ����
 *@author  ���
 *2015��6��14�� ����9:03:03
 */
public class nbchrkgl_YKStoDAOImp extends BaseDAO<nbchrkgl_YKSto> implements nbchrkgl_YKStoDAO{

	public List<Object[]> findAll() {
		String sql="select hwyk.*,sto.sto_name,sto.sto_name hwychk_name from huowuyiku hwyk , storeroom sto where hwyk.hwychk_bill=sto.sto_id and hwyk.hwyrk_bill=sto.sto_id";
		super.nativeFindAll(sql);
		return null;
	}

	public List<Object[]> findByLike(nbchrkgl_YKSto yks) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object[]> findBySplite(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object[]> findBySpliteAndLike(nbchrkgl_YKSto yks,
			int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
  
}
