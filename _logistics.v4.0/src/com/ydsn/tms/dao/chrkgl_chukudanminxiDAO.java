package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.po.chrkgl_chukudanminxi;

/**
 * 出入库管理模块——出库单明细数据访问层（接口）
 *@author  孙军
 *2015年6月17日 上午10:05:03
 */
public interface chrkgl_chukudanminxiDAO {
   void deleteById(String chkmx_bill);
   void add(chrkgl_chukudanminxi cmx);
   List<chrkgl_chukudanminxi> findAll();
   List<chrkgl_chukudanminxi>  findAllByLike(chrkgl_chukudanminxi cmx);
   List<chrkgl_chukudanminxi>  findAllBySplite(int currentPage,int pageSize);
   List<chrkgl_chukudanminxi>  findAllBySpliteAndLike(chrkgl_chukudanminxi cmx,int currentPage,int pageSize);
   
}
