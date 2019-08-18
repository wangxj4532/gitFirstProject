package com.ydsn.tms.service;

import java.util.List;
import com.ydsn.tms.vo.chrkgl_rukudanminxiVO;

/**
 *  出入库管理模块——入库单明细业务层接口
 *@author  孙军
 *2015年6月17日 下午9:01:58
 */
public interface chrkgl_rukudanminxiService {
	   void deleteById(String rkmx_bill);
	   void add(chrkgl_rukudanminxiVO rmxv);
	   List<chrkgl_rukudanminxiVO>  findAll();
	   List<chrkgl_rukudanminxiVO>  findAllByLike(chrkgl_rukudanminxiVO rmxv);
	   List<chrkgl_rukudanminxiVO>  findAllBySplite(int currentPage,int pageSize);
	   List<chrkgl_rukudanminxiVO>  findAllBySpliteAndLike(chrkgl_rukudanminxiVO rmxv,int currentPage,int pageSize);
}
