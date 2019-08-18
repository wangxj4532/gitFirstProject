package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.xtgl_AuthorityGroupDAO;
import com.ydsn.tms.po.xtgl_Authoritygroup;

/**
 * 
 *@author  孙军
 *2015年6月12日 上午8:34:09
 */
public class xtgl_AuthorityGroupDAOImp extends BaseDAO<xtgl_Authoritygroup> implements xtgl_AuthorityGroupDAO{
	   public void add(xtgl_Authoritygroup auth){
		   super.add(auth);
	   }
	   public void update(xtgl_Authoritygroup auth){
		   super.update(auth);
	   }
	   public List<xtgl_Authoritygroup> findAll(){
		   String hql="from xtgl_Authoritygroup";
		   return super.findAll(hql);
	   }
	   public List<xtgl_Authoritygroup> findByLike(xtgl_Authoritygroup auth){
		   String hql="from xtgl_Authoritygroup auth where auth.auth_name like ? and auth.auth_level like ?";
		   String[] params={auth.getAuth_name(),auth.getAuth_level()};
		   return super.findByLike(hql, params);
	   }
	   public List<xtgl_Authoritygroup> findBySplitePage(int currentPage,int pageSize){
		   String hql="from xtgl_Authoritygroup";
		   return super.findBySplitePage(hql, currentPage, pageSize);
	   }
	   public List<xtgl_Authoritygroup> findBySplitePageAndLike(xtgl_Authoritygroup auth,int currentPage,int pageSize){
		   String hql="from xtgl_Authoritygroup auth where auth.auth_name like ? and auth.auth_level like ?";
		   String[] params={auth.getAuth_name(),auth.getAuth_level()};
		   return super.findBySplitePageAndLike(hql, currentPage, pageSize, params);
	   }
}
