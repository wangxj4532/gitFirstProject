package com.ydsn.tms.service;

import java.util.List;
import com.ydsn.tms.vo.chrkgl_rukudanVO;

/**
 * 出入库管理模块——入库单业务层接口 
 *@author  孙军
 *2015年6月17日 下午9:04:29
 */
public interface chrkgl_rukudanService {
    void add(chrkgl_rukudanVO rkdv);
    void update(chrkgl_rukudanVO rkdv);
    List<chrkgl_rukudanVO> findAll();
    List<chrkgl_rukudanVO> findByLike(chrkgl_rukudanVO rkdv);
    List<chrkgl_rukudanVO> findBySplite(int currentPage,int pageSize);
    List<chrkgl_rukudanVO> findBySpliteAndLike(chrkgl_rukudanVO rkdv,int currentPage,int pageSize);
}
