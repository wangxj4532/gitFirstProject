package com.ydsn.tms.service;

import java.util.List;
import com.ydsn.tms.vo.chrkgl_chhdVO;

/**
 * ��������ģ�顪��������ҵ���ӿ�
 *@author  ���
 *2015��6��16�� ����10:33:15
 */
public interface chrkgl_chhdService {
  void addCHD(chrkgl_chhdVO chdv);
  void updateCHD(chrkgl_chhdVO chdv);
  List<chrkgl_chhdVO> findAll();
  List<chrkgl_chhdVO> findByLike(chrkgl_chhdVO chdv);
  List<chrkgl_chhdVO> findBySplite(int currentPage,int pageSize);
  List<chrkgl_chhdVO> findBySpliteAndLike(chrkgl_chhdVO chdv,int currentPage,int pageSize);
}
