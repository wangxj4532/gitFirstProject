package com.ydsn.tms.service;
import java.util.List;
import com.ydsn.tms.po.Storeroom;
/**
 * �ⷿҵ���---���ӿڣ�
 * 
 *@author  ���
 *2015��6��2�� ����7:32:08
 */
public interface StoreroomService {
  void addSto(Storeroom sto);
  void updateSto(Storeroom sto);
  void deleteStoById(int sto_id);
  List<Storeroom> findAllBySpliteAndLike(Storeroom sto,int currentPage,int pageSize);
  List<Storeroom> findAllBySplite(int currentPage,int pageSize);
  List<Storeroom> findAll();
}


















