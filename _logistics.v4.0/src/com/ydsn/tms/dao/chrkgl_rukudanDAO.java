package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.po.chrkgl_rukudan;

/**
 *��������ģ�顪����ⵥ���ݷ��ʲ㣨�ӿ��ࣩ
 *@author  ���
 *2015��6��17�� ����8:23:39
 */
public interface chrkgl_rukudanDAO {
      void add(chrkgl_rukudan rkd);
      void update(chrkgl_rukudan rkd);
      List<chrkgl_rukudan> findAll();
      List<chrkgl_rukudan> findByLike(chrkgl_rukudan rkd);
      List<chrkgl_rukudan> findBySplite(int currentPage,int pageSize);
      List<chrkgl_rukudan> findBySpliteAndLike(chrkgl_rukudan rkd,int currentPage,int pageSize);
}
