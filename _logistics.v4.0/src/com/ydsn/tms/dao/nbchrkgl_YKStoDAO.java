package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.vo.nbchrkgl_YKSto;

/**
 * �ڲ���������ģ��--�����ƿ����ݷ��ʲ�ӿ�
 *@author  ���
 *2015��6��14�� ����8:46:12
 */
public interface nbchrkgl_YKStoDAO {
   List<Object[]> findAll();
   List<Object[]> findByLike(nbchrkgl_YKSto yks);
   List<Object[]> findBySplite(int currentPage,int pageSize);
   List<Object[]> findBySpliteAndLike(nbchrkgl_YKSto yks,int currentPage,int pageSize);
 } 
