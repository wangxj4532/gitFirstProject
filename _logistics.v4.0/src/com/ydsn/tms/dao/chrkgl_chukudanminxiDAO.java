package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.po.chrkgl_chukudanminxi;

/**
 * ��������ģ�顪�����ⵥ��ϸ���ݷ��ʲ㣨�ӿڣ�
 *@author  ���
 *2015��6��17�� ����10:05:03
 */
public interface chrkgl_chukudanminxiDAO {
   void deleteById(String chkmx_bill);
   void add(chrkgl_chukudanminxi cmx);
   List<chrkgl_chukudanminxi> findAll();
   List<chrkgl_chukudanminxi>  findAllByLike(chrkgl_chukudanminxi cmx);
   List<chrkgl_chukudanminxi>  findAllBySplite(int currentPage,int pageSize);
   List<chrkgl_chukudanminxi>  findAllBySpliteAndLike(chrkgl_chukudanminxi cmx,int currentPage,int pageSize);
   
}
