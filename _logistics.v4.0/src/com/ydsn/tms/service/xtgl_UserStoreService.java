package com.ydsn.tms.service;

import java.util.List;
import com.ydsn.tms.vo.xtgl_UserStore;

/**
 * ϵͳ����ģ�顪���û��Ϳⷿ��ϢCRUD���ӿڣ�
 *@author  ���
 *2015��6��11�� ����5:53:31
 */
public interface xtgl_UserStoreService {
   void addUser(xtgl_UserStore us);
   void updateUser(xtgl_UserStore us);
   List<xtgl_UserStore> findAllBySpliteAndLike(xtgl_UserStore us,int currentPage,int pageSize);
   List<xtgl_UserStore> findAllBySplite(int currentPage,int pageSize);
   List<xtgl_UserStore> findAllByLike(xtgl_UserStore us);
   List<xtgl_UserStore> findAll();
}
