package com.ydsn.tms.service;

import java.util.List;
import com.ydsn.tms.vo.chrkgl_chukudanminxiVO;

/**
 *  ��������ģ�顪�����ⵥ��ϸҵ��㣨�ӿڣ�
 *@author  ���
 *2015��6��17�� ����10:16:31
 */
public interface chrkgl_chukudanminxiService {
	  void addCMX(chrkgl_chukudanminxiVO cmxv);
	  void deleteById(String chkmx_bill);
	   List<chrkgl_chukudanminxiVO> findAll();
	   List<chrkgl_chukudanminxiVO>  findAllByLike(chrkgl_chukudanminxiVO cmxv);
	   List<chrkgl_chukudanminxiVO>  findAllBySplite(int currentPage,int pageSize);
	   List<chrkgl_chukudanminxiVO>  findAllBySpliteAndLike(chrkgl_chukudanminxiVO cmxv,int currentPage,int pageSize);
}
