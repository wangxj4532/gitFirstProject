package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.xtgl_UserStoreDAO;
import com.ydsn.tms.vo.xtgl_UserStore;

/**
 * ϵͳ����ģ��-�û��Ϳⷿ��Ϣ���ݷ��ʣ�ʵ���ࣩ 
 *@author  ���
 *2015��6��12�� ����10:36:02
 */
public class xtgl_UserStoreDAOImp extends BaseDAO<xtgl_UserStore> implements xtgl_UserStoreDAO{

	@Override
	public List<Object[]> findAll() {
		/**ע�������userInfo�ı�������ȡ�ؼ���user**/
		String sql="select us.*,sto.sto_name from userInfo us,storeroom sto where us.stm_id=sto.sto_id";
		return super.nativeFindAll(sql);
	}

	@Override
	public List<Object[]> findAllByLike(xtgl_UserStore us) {
		String sql="select us.*,sto.sto_name from userInfo us,storeroom sto where us.stm_id=sto.sto_id and user.user_mch like ? and user.user_mch like ?";
		String [] params={us.getUser_mch(),us.getUser_name()};
		return super.nativefindByLike(sql, params);
	}

	@Override
	public List<Object[]> findAllBySplite(int currentPage, int pageSize) {
		String sql="select us.*,sto.sto_name from userInfo us,storeroom sto where us.stm_id=sto.sto_id";
		return super.nativeFindBySplitePage(sql, currentPage, pageSize);
	}

	@Override
	public List<Object[]> findAllBySpliteAndLike(xtgl_UserStore us,
			int currentPage, int pageSize) {
		String sql="select us.*,sto.sto_name from userInfo us,storeroom sto where us.stm_id=sto.sto_id and user.user_mch like ? and user.user_mch like ?";
		String [] params={us.getUser_mch(),us.getUser_name()};
		return super.nativeFindBySplitePageAndLike(sql, currentPage, pageSize, params);
	}

}
