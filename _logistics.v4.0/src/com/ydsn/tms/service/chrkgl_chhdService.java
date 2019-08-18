package com.ydsn.tms.service;

import java.util.List;
import com.ydsn.tms.vo.chrkgl_chhdVO;

/**
 * 出入库管理模块——出货单业务层接口
 *@author  孙军
 *2015年6月16日 上午10:33:15
 */
public interface chrkgl_chhdService {
  void addCHD(chrkgl_chhdVO chdv);
  void updateCHD(chrkgl_chhdVO chdv);
  List<chrkgl_chhdVO> findAll();
  List<chrkgl_chhdVO> findByLike(chrkgl_chhdVO chdv);
  List<chrkgl_chhdVO> findBySplite(int currentPage,int pageSize);
  List<chrkgl_chhdVO> findBySpliteAndLike(chrkgl_chhdVO chdv,int currentPage,int pageSize);
}
