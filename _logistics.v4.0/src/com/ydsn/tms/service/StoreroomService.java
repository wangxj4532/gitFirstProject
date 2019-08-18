package com.ydsn.tms.service;
import java.util.List;
import com.ydsn.tms.po.Storeroom;
/**
 * 库房业务层---（接口）
 * 
 *@author  孙军
 *2015年6月2日 下午7:32:08
 */
public interface StoreroomService {
  void addSto(Storeroom sto);
  void updateSto(Storeroom sto);
  void deleteStoById(int sto_id);
  List<Storeroom> findAllBySpliteAndLike(Storeroom sto,int currentPage,int pageSize);
  List<Storeroom> findAllBySplite(int currentPage,int pageSize);
  List<Storeroom> findAll();
}


















