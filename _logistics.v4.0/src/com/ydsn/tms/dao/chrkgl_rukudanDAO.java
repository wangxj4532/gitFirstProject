package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.po.chrkgl_rukudan;

/**
 *出入库管理模块——入库单数据访问层（接口类）
 *@author  孙军
 *2015年6月17日 下午8:23:39
 */
public interface chrkgl_rukudanDAO {
      void add(chrkgl_rukudan rkd);
      void update(chrkgl_rukudan rkd);
      List<chrkgl_rukudan> findAll();
      List<chrkgl_rukudan> findByLike(chrkgl_rukudan rkd);
      List<chrkgl_rukudan> findBySplite(int currentPage,int pageSize);
      List<chrkgl_rukudan> findBySpliteAndLike(chrkgl_rukudan rkd,int currentPage,int pageSize);
}
