package com.ydsn.tms.service;
import java.util.List;

import com.ydsn.tms.po.ComFile;
import com.ydsn.tms.vo.ComCus;
/**
 * �ⷿҵ���---���ӿڣ�
 * 
 *@author  ���
 *2015��6��2�� ����7:32:08
 */
public interface jcxxComfileService {

  void addCom(ComCus cc);
  void updateCom(ComCus cc);
  void deleteComById(String g_id);
  List<ComCus> findAllBySpliteAndLike(ComCus cc,int currentPage,int pageSize);
  List<ComCus> findAllBySplite(int currentPage,int pageSize);
  List<ComCus> findAll();
  List<ComFile> findCom();
}


















