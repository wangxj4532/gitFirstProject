package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.po.chrkgl_chhd;

/**
 * 出入库管理模块——出货单数据访问层接口
 *@author  孙军
 *2015年6月16日 上午9:31:58
 */
public interface chrkgl_chhdDAO {
   void add(chrkgl_chhd chd);
   void update(chrkgl_chhd chd);
   List<chrkgl_chhd> findAll();
   List<chrkgl_chhd> findByLike(chrkgl_chhd chd);
   List<chrkgl_chhd> findBySplite(int currentPage,int pageSize);
   List<chrkgl_chhd> findBySpliteAndLike(chrkgl_chhd chd,int currentPage,int pageSize);
   
}
