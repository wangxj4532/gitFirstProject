package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.xtgl_Authoritygroup;

/**
 * ϵͳ����ģ�顪��Ȩ�������ݷ��ʲ㣨�ӿ��ࣩ
 *@author  ���
 *2015��6��12�� ����8:28:51
 */
public interface xtgl_AuthorityGroupDAO {
   void add(xtgl_Authoritygroup auth);
   void update(xtgl_Authoritygroup auth);
   List<xtgl_Authoritygroup> findAll();
   List<xtgl_Authoritygroup> findByLike(xtgl_Authoritygroup auth);
   List<xtgl_Authoritygroup> findBySplitePage(int currentPage,int pageSize);
   List<xtgl_Authoritygroup> findBySplitePageAndLike(xtgl_Authoritygroup auth,int currentPage,int pageSize);
}
