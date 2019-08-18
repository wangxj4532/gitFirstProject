package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.nbchrkgl_huowuyikuDAO;
import com.ydsn.tms.po.nbchrkgl_huowuyiku;

/**
 * �ڲ���������ģ��--�����ƿ����ݷ��ʲ�ʵ����
 * 
 * @author ��� 
 * 2015��6��14�� ����8:58:20
 */
public class nbchrkgl_huowuyikuDAOImp extends BaseDAO<nbchrkgl_huowuyiku>
		implements nbchrkgl_huowuyikuDAO {
	public void add(nbchrkgl_huowuyiku yk) {
		super.add(yk);
	}

	public void deleteById(String hwyk_bill) {
		super.deleteById(nbchrkgl_huowuyiku.class, hwyk_bill);
	}

	public void update(nbchrkgl_huowuyiku yk) {
		super.update(yk);
	}

	public List<nbchrkgl_huowuyiku> findAll() {
		String hql="from nbchrkgl_huowuyiku";
		return super.findAll(hql);
	}
	public List<nbchrkgl_huowuyiku> findByLike(nbchrkgl_huowuyiku yk) {
		String hql="from nbchrkgl_huowuyiku yk where yk.hwychk_bill like ? and yk.hwyrk_bill like ? and yk.hwyk_remark like ?";
		String []params={yk.getHwychk_bill(),yk.getHwyrk_bill(),yk.getHwyk_remark()};
		return super.findByLike(hql, params);
	}

	public List<nbchrkgl_huowuyiku> findBySplite(int currentPage, int pageSize) {
		String hql="from nbchrkgl_huowuyiku";
		return super.findBySplitePage(hql, currentPage, pageSize);
	}

	public List<nbchrkgl_huowuyiku> findBySpliteAndLike(nbchrkgl_huowuyiku yk,int currentPage, int pageSize) {
		String hql="from nbchrkgl_huowuyiku yk where yk.hwychk_bill like ? and yk.hwyrk_bill like ? and yk.hwyk_remark like ?";
		String []params={yk.getHwychk_bill(),yk.getHwyrk_bill(),yk.getHwyk_remark()};
		return super.findBySplitePageAndLike(hql, currentPage, pageSize, params);
	}


}
