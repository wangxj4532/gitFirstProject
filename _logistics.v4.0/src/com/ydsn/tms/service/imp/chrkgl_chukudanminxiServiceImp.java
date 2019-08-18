package com.ydsn.tms.service.imp;

import java.util.ArrayList;
import java.util.List;

import com.ydsn.tms.dao.chrkgl_chukudanminxiDAO;
import com.ydsn.tms.dao.jcxx_ComFileDAO;
import com.ydsn.tms.po.chrkgl_chukudanminxi;
import com.ydsn.tms.service.chrkgl_chukudanminxiService;
import com.ydsn.tms.util.IDFactory;
import com.ydsn.tms.vo.chrkgl_chukudanminxiVO;

/**
 *  出入库管理模块——出库单明细业务层（实现类）
 *@author  孙军
 *2015年6月17日 上午10:21:18
 */
public class chrkgl_chukudanminxiServiceImp implements chrkgl_chukudanminxiService{
    private chrkgl_chukudanminxiDAO cmxdao;
    private jcxx_ComFileDAO cmx_comdao;
    
	
	public void addCMX(chrkgl_chukudanminxiVO cmxv) {
		chrkgl_chukudanminxi cmx=new chrkgl_chukudanminxi();
		String chkhw_num=cmxv.getChkhw_num();
		cmx.setChkhw(cmxv.getChkhw());
		cmx.setChkhw_num(chkhw_num);		
		cmx.setChkmx_amount(cmxv.getChkmx_amount());
		cmx.setChkmx_bill(IDFactory.createChkmx_bill(chkhw_num));
		cmx.setChkmxchkd_id(cmxv.getChkmxchkd_id());
		cmx.setChkmxshp_id(cmx_comdao.findByName2(cmxv.getChkmxshp_name()).get(0)[0].toString());
		cmx.setChkshch_date(cmxv.getChkshch_date());
		cmx.setChkyxq(cmxv.getChkyxq());
		cmxdao.add(cmx);
	}
	public void deleteById(String chkmx_bill) {
		cmxdao.deleteById(chkmx_bill);
	}

	public List<chrkgl_chukudanminxiVO> findAll() {
		 List<chrkgl_chukudanminxiVO> list1=new ArrayList<chrkgl_chukudanminxiVO>();
		List<chrkgl_chukudanminxi> list =cmxdao.findAll();
		for(int i=0;i<list.size();i++){
			chrkgl_chukudanminxiVO cmxv=new chrkgl_chukudanminxiVO();
			String chkmxshp_id=list.get(i).getChkmxshp_id();
			cmxv.setChkhw(list.get(i).getChkhw());
			cmxv.setChkhw_num(list.get(i).getChkhw_num());
			cmxv.setChkmx_amount(list.get(i).getChkmx_amount());
			cmxv.setChkmx_bill(list.get(i).getChkmx_bill());
			cmxv.setChkmxchkd_id(list.get(i).getChkmxchkd_id());
			cmxv.setChkmxshp_id(chkmxshp_id);
			cmxv.setChkmxshp_name(cmx_comdao.findById(chkmxshp_id).get(0)[4].toString());
			cmxv.setChkshch_date(list.get(i).getChkshch_date());
			cmxv.setChkyxq(list.get(i).getChkyxq());
			list1.add(cmxv);
		}
		return list1;
	}

	public List<chrkgl_chukudanminxiVO> findAllByLike(
			chrkgl_chukudanminxiVO cmxv) {
		 List<chrkgl_chukudanminxiVO> list1=new ArrayList<chrkgl_chukudanminxiVO>();
		 chrkgl_chukudanminxi cmx=new chrkgl_chukudanminxi();
		 cmx.setChkhw_num(cmxv.getChkhw_num());
		 if(cmxv.getChkmxshp_name().equals("")){
				cmx.setChkmxshp_id("");
			}else{
				cmx.setChkmxshp_id(cmx_comdao.findByName2(cmxv.getChkmxshp_name()).get(0)[0].toString());			
				}
		 cmx.setChkshch_date(cmxv.getChkshch_date());
			List<chrkgl_chukudanminxi> list =cmxdao.findAllByLike(cmx);
			for(int i=0;i<list.size();i++){
				chrkgl_chukudanminxiVO cmxv1=new chrkgl_chukudanminxiVO();
				String chkmxshp_id=list.get(i).getChkmxshp_id();
				cmxv1.setChkhw(list.get(i).getChkhw());
				cmxv1.setChkhw_num(list.get(i).getChkhw_num());
				cmxv1.setChkmx_amount(list.get(i).getChkmx_amount());
				cmxv1.setChkmx_bill(list.get(i).getChkmx_bill());
				cmxv1.setChkmxchkd_id(list.get(i).getChkmxchkd_id());
				cmxv1.setChkmxshp_id(chkmxshp_id);
				cmxv1.setChkmxshp_name(cmx_comdao.findById(chkmxshp_id).get(0)[4].toString());
				cmxv1.setChkshch_date(list.get(i).getChkshch_date());
				cmxv1.setChkyxq(list.get(i).getChkyxq());
				list1.add(cmxv1);
			}
			return list1;
	}

	public List<chrkgl_chukudanminxiVO> findAllBySplite(int currentPage,
			int pageSize) {
		 List<chrkgl_chukudanminxiVO> list1=new ArrayList<chrkgl_chukudanminxiVO>();
			List<chrkgl_chukudanminxi> list =cmxdao.findAllBySplite(currentPage, pageSize);
			for(int i=0;i<list.size();i++){
				chrkgl_chukudanminxiVO cmxv=new chrkgl_chukudanminxiVO();
				String chkmxshp_id=list.get(i).getChkmxshp_id();
				cmxv.setChkhw(list.get(i).getChkhw());
				cmxv.setChkhw_num(list.get(i).getChkhw_num());
				cmxv.setChkmx_amount(list.get(i).getChkmx_amount());
				cmxv.setChkmx_bill(list.get(i).getChkmx_bill());
				cmxv.setChkmxchkd_id(list.get(i).getChkmxchkd_id());
				cmxv.setChkmxshp_id(chkmxshp_id);
				cmxv.setChkmxshp_name(cmx_comdao.findById(chkmxshp_id).get(0)[4].toString());
				cmxv.setChkshch_date(list.get(i).getChkshch_date());
				cmxv.setChkyxq(list.get(i).getChkyxq());
				list1.add(cmxv);
			}
			return list1;
	}

	public List<chrkgl_chukudanminxiVO> findAllBySpliteAndLike(
			chrkgl_chukudanminxiVO cmxv, int currentPage, int pageSize) {
		 List<chrkgl_chukudanminxiVO> list1=new ArrayList<chrkgl_chukudanminxiVO>();
		 chrkgl_chukudanminxi cmx=new chrkgl_chukudanminxi();
		 cmx.setChkhw_num(cmxv.getChkhw_num());
		 if(cmxv.getChkmxshp_name().equals("")){
				cmx.setChkmxshp_id("");
			}else{
				cmx.setChkmxshp_id(cmx_comdao.findByName2(cmxv.getChkmxshp_name()).get(0)[0].toString());			
				}
		 cmx.setChkshch_date(cmxv.getChkshch_date());
			List<chrkgl_chukudanminxi> list =cmxdao.findAllBySpliteAndLike(cmx, currentPage, pageSize);
			for(int i=0;i<list.size();i++){
				chrkgl_chukudanminxiVO cmxv1=new chrkgl_chukudanminxiVO();
				String chkmxshp_id=list.get(i).getChkmxshp_id();
				cmxv1.setChkhw(list.get(i).getChkhw());
				cmxv1.setChkhw_num(list.get(i).getChkhw_num());
				cmxv1.setChkmx_amount(list.get(i).getChkmx_amount());
				cmxv1.setChkmx_bill(list.get(i).getChkmx_bill());
				cmxv1.setChkmxchkd_id(list.get(i).getChkmxchkd_id());
				cmxv1.setChkmxshp_id(chkmxshp_id);
				cmxv1.setChkmxshp_name(cmx_comdao.findById(chkmxshp_id).get(0)[4].toString());
				cmxv1.setChkshch_date(list.get(i).getChkshch_date());
				cmxv1.setChkyxq(list.get(i).getChkyxq());
				list1.add(cmxv1);
			}
			return list1;
	}
/**-------------------------get/set方法----------------------------------------------------------**/
	public chrkgl_chukudanminxiDAO getCmxdao() {
		return cmxdao;
	}

	public void setCmxdao(chrkgl_chukudanminxiDAO cmxdao) {
		this.cmxdao = cmxdao;
	}

	public jcxx_ComFileDAO getCmx_comdao() {
		return cmx_comdao;
	}

	public void setCmx_comdao(jcxx_ComFileDAO cmx_comdao) {
		this.cmx_comdao = cmx_comdao;
	}


	
	
   
}
