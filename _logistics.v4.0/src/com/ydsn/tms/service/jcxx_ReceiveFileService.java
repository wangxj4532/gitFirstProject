package com.ydsn.tms.service;
import java.util.List;
import com.ydsn.tms.po.jcxx_ReceiveFile;
public interface jcxx_ReceiveFileService {
  void addRec(jcxx_ReceiveFile rec);
  void updateRec(jcxx_ReceiveFile rec);
  void deleteRecById(String rec_id);
  List<jcxx_ReceiveFile> findAllBySpliteAndLike(jcxx_ReceiveFile rec,int currentPage,int pageSize);
  List<jcxx_ReceiveFile> findAllBySplite(int currentPage,int pageSize);
  List<jcxx_ReceiveFile> findAll();
}


















