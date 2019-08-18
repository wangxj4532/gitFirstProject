package com.ydsn.tms.service;

import java.util.List;

import com.ydsn.tms.po.xtgl_Authoritygroup;

/**
 * 系统管理模块——权限组业务层（接口类）
 *@author  孙军
 *2015年6月12日 上午8:53:41
 */
public interface xtgl_AuthorityGroupService {
	void addAuth(xtgl_Authoritygroup auth);
	  void updateAuth(xtgl_Authoritygroup auth);
	  List<xtgl_Authoritygroup> findAllBySpliteAndLike(xtgl_Authoritygroup auth,int currentPage,int pageSize);
	  List<xtgl_Authoritygroup> findAllBySplite(int currentPage,int pageSize);
	  List<xtgl_Authoritygroup> findAll();
	  List<xtgl_Authoritygroup> findByLike(xtgl_Authoritygroup auth);
}
