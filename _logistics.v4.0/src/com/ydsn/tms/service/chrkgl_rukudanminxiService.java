package com.ydsn.tms.service;

import java.util.List;
import com.ydsn.tms.vo.chrkgl_rukudanminxiVO;

/**
 *  ��������ģ�顪����ⵥ��ϸҵ���ӿ�
 *@author  ���
 *2015��6��17�� ����9:01:58
 */
public interface chrkgl_rukudanminxiService {
	   void deleteById(String rkmx_bill);
	   void add(chrkgl_rukudanminxiVO rmxv);
	   List<chrkgl_rukudanminxiVO>  findAll();
	   List<chrkgl_rukudanminxiVO>  findAllByLike(chrkgl_rukudanminxiVO rmxv);
	   List<chrkgl_rukudanminxiVO>  findAllBySplite(int currentPage,int pageSize);
	   List<chrkgl_rukudanminxiVO>  findAllBySpliteAndLike(chrkgl_rukudanminxiVO rmxv,int currentPage,int pageSize);
}
