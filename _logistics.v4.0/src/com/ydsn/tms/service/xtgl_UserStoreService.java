package com.ydsn.tms.service;

import java.util.List;
import com.ydsn.tms.vo.xtgl_UserStore;

/**
 * 系统管理模块——用户和库房信息CRUD（接口）
 *@author  孙军
 *2015年6月11日 下午5:53:31
 */
public interface xtgl_UserStoreService {
   void addUser(xtgl_UserStore us);
   void updateUser(xtgl_UserStore us);
   List<xtgl_UserStore> findAllBySpliteAndLike(xtgl_UserStore us,int currentPage,int pageSize);
   List<xtgl_UserStore> findAllBySplite(int currentPage,int pageSize);
   List<xtgl_UserStore> findAllByLike(xtgl_UserStore us);
   List<xtgl_UserStore> findAll();
}
