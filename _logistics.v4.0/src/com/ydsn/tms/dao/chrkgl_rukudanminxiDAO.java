package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.po.chrkgl_rukudanminxi;

/**
 *  ��������ģ�顪����ⵥ��ϸ���ݷ��ʲ�ӿ�
 *@author  ���
 *2015��6��17�� ����8:27:03
 */
public interface chrkgl_rukudanminxiDAO {
	   void deleteById(String rkmx_bill);
	   void add(chrkgl_rukudanminxi rmx);
	   List<chrkgl_rukudanminxi> findAll();
	   List<chrkgl_rukudanminxi>  findAllByLike(chrkgl_rukudanminxi rmx);
	   List<chrkgl_rukudanminxi>  findAllBySplite(int currentPage,int pageSize);
	   List<chrkgl_rukudanminxi>  findAllBySpliteAndLike(chrkgl_rukudanminxi rmx,int currentPage,int pageSize);
}
