package com.ydsn.tms.service.imp;

import java.util.ArrayList;
import java.util.List;

import com.ydsn.tms.dao.chrkgl_rukudanminxiDAO;
import com.ydsn.tms.dao.jcxx_ComFileDAO;
import com.ydsn.tms.po.chrkgl_rukudanminxi;
import com.ydsn.tms.service.chrkgl_rukudanminxiService;
import com.ydsn.tms.util.IDFactory;
import com.ydsn.tms.vo.chrkgl_rukudanminxiVO;

/**
 * 出入库管理模块——入库订单明细业务层（实现类）
 *@author  孙军
 *2015年6月17日 下午10:30:24
 */
public class chrkgl_rukudanminxiServiceImp implements chrkgl_rukudanminxiService{
    private chrkgl_rukudanminxiDAO rmxdao;
    private jcxx_ComFileDAO rmx_comdao;
	public void deleteById(String rkmx_bill) {
		rmxdao.deleteById(rkmx_bill);		
	}

	public void add(chrkgl_rukudanminxiVO rmxv) {
		chrkgl_rukudanminxi rmx=new chrkgl_rukudanminxi();
		String rkd_id=rmxv.getRkd_id();
		String shp_name=rmxv.getShp_name();
		rmx.setRkd_id(rkd_id);
		rmx.setRkhw(rmxv.getRkhw());
		rmx.setRkhw_num(rmxv.getRkhw_num());
		rmx.setRkmx_amount(rmxv.getRkmx_amount());
		rmx.setRkmx_bill(IDFactory.createRkmx_bill(rkd_id));
		rmx.setRkshch_date(rmxv.getRkshch_date());
		rmx.setRkyxq(rmxv.getRkyxq());
		rmx.setShp_id(rmx_comdao.findByName2(shp_name).get(0)[0].toString());
		rmxdao.add(rmx);
		
	}

	public List<chrkgl_rukudanminxiVO> findAll() {
		List<chrkgl_rukudanminxiVO>  list=new ArrayList<chrkgl_rukudanminxiVO>();
		List<chrkgl_rukudanminxi>  list1=rmxdao.findAll();
		for(int i=0;i<list1.size();i++){
			chrkgl_rukudanminxiVO rmxv=new chrkgl_rukudanminxiVO();
			String shp_name=rmx_comdao.findById(list1.get(i).getShp_id()).get(0)[4].toString();
			rmxv.setRkd_id(list1.get(i).getRkd_id());
			rmxv.setRkhw(list1.get(i).getRkhw());
			rmxv.setRkhw_num(list1.get(i).getRkhw_num());
			rmxv.setRkmx_amount(list1.get(i).getRkmx_amount());
			rmxv.setRkmx_bill(list1.get(i).getRkmx_bill());
			rmxv.setRkshch_date(list1.get(i).getRkshch_date());
			rmxv.setRkyxq(list1.get(i).getRkyxq());
			rmxv.setShp_id(list1.get(i).getShp_id());
			rmxv.setShp_name(shp_name);
			list.add(rmxv);
		}
		return list;
	}

	public List<chrkgl_rukudanminxiVO> findAllByLike(chrkgl_rukudanminxiVO rmxv) {
		List<chrkgl_rukudanminxiVO>  list=new ArrayList<chrkgl_rukudanminxiVO>();
		chrkgl_rukudanminxi rmx=new chrkgl_rukudanminxi();
		if(rmxv.getShp_name().equals("")){
			rmx.setShp_id("");
		}else{
			rmx.setShp_id(rmx_comdao.findByName(rmxv.getShp_name()).get(0)[0].toString());
		}
		rmx.setRkhw_num(rmxv.getRkhw_num());
		rmx.setRkhw(rmxv.getRkhw());
		List<chrkgl_rukudanminxi>  list1=rmxdao.findAllByLike(rmx);
		for(int i=0;i<list1.size();i++){
			chrkgl_rukudanminxiVO rmxv1=new chrkgl_rukudanminxiVO();
			String shp_name=rmx_comdao.findById(list1.get(i).getShp_id()).get(0)[4].toString();
			rmxv1.setRkd_id(list1.get(i).getRkd_id());
			rmxv1.setRkhw(list1.get(i).getRkhw());
			rmxv1.setRkhw_num(list1.get(i).getRkhw_num());
			rmxv1.setRkmx_amount(list1.get(i).getRkmx_amount());
			rmxv1.setRkmx_bill(list1.get(i).getRkmx_bill());
			rmxv1.setRkshch_date(list1.get(i).getRkshch_date());
			rmxv1.setRkyxq(list1.get(i).getRkyxq());
			rmxv1.setShp_id(list1.get(i).getShp_id());
			rmxv1.setShp_name(shp_name);
			list.add(rmxv1);
		}
		return list;
	}

	public List<chrkgl_rukudanminxiVO> findAllBySplite(int currentPage,
			int pageSize) {
		List<chrkgl_rukudanminxiVO>  list=new ArrayList<chrkgl_rukudanminxiVO>();
		List<chrkgl_rukudanminxi>  list1=rmxdao.findAllBySplite(currentPage, pageSize);
		for(int i=0;i<list1.size();i++){
			chrkgl_rukudanminxiVO rmxv=new chrkgl_rukudanminxiVO();
			String shp_name=rmx_comdao.findById(list1.get(i).getShp_id()).get(0)[4].toString();
			rmxv.setRkd_id(list1.get(i).getRkd_id());
			rmxv.setRkhw(list1.get(i).getRkhw());
			rmxv.setRkhw_num(list1.get(i).getRkhw_num());
			rmxv.setRkmx_amount(list1.get(i).getRkmx_amount());
			rmxv.setRkmx_bill(list1.get(i).getRkmx_bill());
			rmxv.setRkshch_date(list1.get(i).getRkshch_date());
			rmxv.setRkyxq(list1.get(i).getRkyxq());
			rmxv.setShp_id(list1.get(i).getShp_id());
			rmxv.setShp_name(shp_name);
			list.add(rmxv);
		}
		return list;
	}

	public List<chrkgl_rukudanminxiVO> findAllBySpliteAndLike(
			chrkgl_rukudanminxiVO rmxv, int currentPage, int pageSize) {
		List<chrkgl_rukudanminxiVO>  list=new ArrayList<chrkgl_rukudanminxiVO>();
		chrkgl_rukudanminxi rmx=new chrkgl_rukudanminxi();
		if(rmxv.getShp_name().equals("")){
			rmx.setShp_id("");
		}else{
			rmx.setShp_id(rmx_comdao.findByName(rmxv.getShp_name()).get(0)[0].toString());
		}
		rmx.setRkhw_num(rmxv.getRkhw_num());
		rmx.setRkhw(rmxv.getRkhw());
		List<chrkgl_rukudanminxi>  list1=rmxdao.findAllBySpliteAndLike(rmx, currentPage, pageSize);
		for(int i=0;i<list1.size();i++){
			chrkgl_rukudanminxiVO rmxv1=new chrkgl_rukudanminxiVO();
			String shp_name=rmx_comdao.findById(list1.get(i).getShp_id()).get(0)[4].toString();
			rmxv1.setRkd_id(list1.get(i).getRkd_id());
			rmxv1.setRkhw(list1.get(i).getRkhw());
			rmxv1.setRkhw_num(list1.get(i).getRkhw_num());
			rmxv1.setRkmx_amount(list1.get(i).getRkmx_amount());
			rmxv1.setRkmx_bill(list1.get(i).getRkmx_bill());
			rmxv1.setRkshch_date(list1.get(i).getRkshch_date());
			rmxv1.setRkyxq(list1.get(i).getRkyxq());
			rmxv1.setShp_id(list1.get(i).getShp_id());
			rmxv1.setShp_name(shp_name);
			list.add(rmxv1);
		}
		return list;
	}
/**-------------------get/set方法------------------------------------------------------------------**/

	public chrkgl_rukudanminxiDAO getRmxdao() {
		return rmxdao;
	}

	public void setRmxdao(chrkgl_rukudanminxiDAO rmxdao) {
		this.rmxdao = rmxdao;
	}

	public jcxx_ComFileDAO getRmx_comdao() {
		return rmx_comdao;
	}

	public void setRmx_comdao(jcxx_ComFileDAO rmx_comdao) {
		this.rmx_comdao = rmx_comdao;
	}  
    
}
