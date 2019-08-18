package com.ydsn.tms.service.imp;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.ydsn.tms.dao.jcxx_ReceiveFileDAO;
import com.ydsn.tms.po.jcxx_ReceiveFile;
import com.ydsn.tms.service.jcxx_ReceiveFileService;
/**
 * �ⷿҵ����---��ʵ���ࣩ
 * 
 *@author  ���
 *2015��6��2�� ����7:33:45
 */


public class jcxx_ReceiveFileServiceImp implements jcxx_ReceiveFileService{
	Logger logger=Logger.getLogger(jcxx_ReceiveFileServiceImp.class);
	private jcxx_ReceiveFileDAO dao;


  
public jcxx_ReceiveFileDAO getDao() {
	System.out.println("==get===");
		return dao;
	}
	public void setDao(jcxx_ReceiveFileDAO dao) {
		System.out.println("==set===");
		this.dao = dao;
	}
public void addRec(jcxx_ReceiveFile rec){
		logger.warn("=====addService excuted success!!=======");
		dao.add(rec);
	}
  public void updateRec(jcxx_ReceiveFile rec){
	  dao.update(rec);
  }
  public void deleteRecById(String rec_id){
	  dao.deleteById(rec_id);
  }
  public List<jcxx_ReceiveFile> findAll(){
	  List<jcxx_ReceiveFile> list=new ArrayList<jcxx_ReceiveFile>();
	  System.out.println("===ceshi ====="+dao);
	  list=dao.findAll();
	  return list;
  }
  public List<jcxx_ReceiveFile> findAllBySpliteAndLike(jcxx_ReceiveFile rec,int currentPage,int pageSize){
	     List<jcxx_ReceiveFile> list=new ArrayList<jcxx_ReceiveFile>();
		 list=dao.findAllBySpliteAndLike(rec,currentPage, pageSize);
		 return list;
  }
  public List<jcxx_ReceiveFile> findAllBySplite(int currentPage,int pageSize){
	  List<jcxx_ReceiveFile> list=new ArrayList<jcxx_ReceiveFile>();
	  list=dao.findAllBySplite(currentPage, pageSize);
	  return list;
  }
public jcxx_ReceiveFileServiceImp() {
	super();
	// TODO Auto-generated constructor stub
}
public jcxx_ReceiveFileServiceImp(jcxx_ReceiveFileDAO dao) {
	super();
	this.dao = dao;
}
  
/*----------------------------------------��������get/set����-------------------------------------------------*/
  
  

	
}


















