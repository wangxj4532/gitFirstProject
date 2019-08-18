package com.ydsn.tms.service.imp;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.ydsn.tms.dao.imp.StoreroomDAOImp;
import com.ydsn.tms.po.Storeroom;
import com.ydsn.tms.service.StoreroomService;
/**
 * 库房业务类---（实现类）
 * 
 *@author  孙军
 *2015年6月2日 下午7:33:45
 */


public class StoreroomServiceImp implements StoreroomService{
	Logger logger=Logger.getLogger(StoreroomServiceImp.class);
	private StoreroomDAOImp dao;

  public void addSto(Storeroom sto){
		logger.warn("=====addService excuted success!!=======");
		dao.add(sto);
	}
  public void updateSto(Storeroom sto){
	  dao.update(sto);
  }
  public void deleteStoById(int sto_id){
	  dao.deleteById(sto_id);
  }
  public List<Storeroom> findAll(){
	  List<Storeroom> list=new ArrayList<Storeroom>();
	  list=dao.findAll();
	  return list;
  }
  public List<Storeroom> findAllBySpliteAndLike(Storeroom sto,int currentPage,int pageSize){
	     List<Storeroom> list=new ArrayList<Storeroom>();
		 list=dao.findAllBySpliteAndLike(sto,currentPage, pageSize);
		 return list;
  }
  public List<Storeroom> findAllBySplite(int currentPage,int pageSize){
	  List<Storeroom> list=new ArrayList<Storeroom>();
	  list=dao.findAllBySplite(currentPage, pageSize);
	  return list;
  }
  
/*----------------------------------------构造器和get/set方法-------------------------------------------------*/
	public StoreroomServiceImp() {
		super();
	}
	public StoreroomServiceImp(StoreroomDAOImp dao) {
		super();
		this.dao = dao;
	}
	public StoreroomDAOImp getDao() {
		return dao;
	}
	public void setDao(StoreroomDAOImp dao) {
		this.dao = dao;
	}
}


















