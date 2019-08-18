package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.vo.nbchrkgl_YKSto;

/**
 * 内部出入库管理模块--货物移库数据访问层接口
 *@author  孙军
 *2015年6月14日 下午8:46:12
 */
public interface nbchrkgl_YKStoDAO {
   List<Object[]> findAll();
   List<Object[]> findByLike(nbchrkgl_YKSto yks);
   List<Object[]> findBySplite(int currentPage,int pageSize);
   List<Object[]> findBySpliteAndLike(nbchrkgl_YKSto yks,int currentPage,int pageSize);
 } 
