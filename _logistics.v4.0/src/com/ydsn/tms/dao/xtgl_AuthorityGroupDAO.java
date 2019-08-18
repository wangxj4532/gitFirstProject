package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.xtgl_Authoritygroup;

/**
 * 系统管理模块——权限组数据访问层（接口类）
 *@author  孙军
 *2015年6月12日 上午8:28:51
 */
public interface xtgl_AuthorityGroupDAO {
   void add(xtgl_Authoritygroup auth);
   void update(xtgl_Authoritygroup auth);
   List<xtgl_Authoritygroup> findAll();
   List<xtgl_Authoritygroup> findByLike(xtgl_Authoritygroup auth);
   List<xtgl_Authoritygroup> findBySplitePage(int currentPage,int pageSize);
   List<xtgl_Authoritygroup> findBySplitePageAndLike(xtgl_Authoritygroup auth,int currentPage,int pageSize);
}
