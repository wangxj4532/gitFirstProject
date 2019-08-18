package com.ydsn.tms.dao.imp;
import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.ComCusDAO;
import com.ydsn.tms.vo.ComCus;
/**
 * 库房数据访问层---（实现类）
 * 
 *@author  孙军
 *2015年6月2日 下午7:22:14
 */
public class ComCusDAOImp extends BaseDAO<ComCus> implements ComCusDAO{
	
	@Override
	public List<Object[]> findAll() {
		System.out.println("+++++++");
		String sql="select cus.cus_name,com.* from comFile com ,customer cus where com.cus_num=cus.cus_id";
		return  super.nativeFindAll(sql);
	}

	
	@Override
	public List<Object[]> findAllBySplite(int currentPage, int pageSize) {
		String sql="select cus.cus_name,com.* from comFile com ,customer cus where com.cus_num=cus.cus_id";
		return super.nativeFindBySplitePage(sql, currentPage, pageSize);
	}

	@Override
	public List<Object[]> findAllBySpliteAndLike(ComCus cc, int currentPage,
			int pageSize) {
		String sql="select cus.cus_name,com.* from comFile com ,customer cus where com.cus_num=cus.cus_id and cus.cus_name like ? and com.g_class like ? and com.g_name like ?";
		String[] params={cc.getCus_name(),cc.getG_class(),cc.getG_name()};
		return super.nativeFindBySplitePageAndLike(sql, currentPage, pageSize, params);
	}
	
	
	


}











