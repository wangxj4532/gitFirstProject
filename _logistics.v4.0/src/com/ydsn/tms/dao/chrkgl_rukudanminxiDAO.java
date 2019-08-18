package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.po.chrkgl_rukudanminxi;

/**
 *  出入库管理模块——入库单明细数据访问层接口
 *@author  孙军
 *2015年6月17日 下午8:27:03
 */
public interface chrkgl_rukudanminxiDAO {
	   void deleteById(String rkmx_bill);
	   void add(chrkgl_rukudanminxi rmx);
	   List<chrkgl_rukudanminxi> findAll();
	   List<chrkgl_rukudanminxi>  findAllByLike(chrkgl_rukudanminxi rmx);
	   List<chrkgl_rukudanminxi>  findAllBySplite(int currentPage,int pageSize);
	   List<chrkgl_rukudanminxi>  findAllBySpliteAndLike(chrkgl_rukudanminxi rmx,int currentPage,int pageSize);
}
