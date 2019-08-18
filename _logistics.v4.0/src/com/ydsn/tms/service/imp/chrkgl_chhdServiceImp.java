package com.ydsn.tms.service.imp;

import java.util.ArrayList;
import java.util.List;

import com.ydsn.tms.dao.chrkgl_chhdDAO;
import com.ydsn.tms.dao.ddgl_OutofwarehouseOrderDAO;
import com.ydsn.tms.dao.jcxx_CustomerDAO;
import com.ydsn.tms.dao.jcxx_ReceiveFileDAO;
import com.ydsn.tms.po.chrkgl_chhd;
import com.ydsn.tms.service.chrkgl_chhdService;
import com.ydsn.tms.util.IDFactory;
import com.ydsn.tms.vo.chrkgl_chhdVO;

/**
 * 出入库管理模块——出货单业务层实现类
 *@author  孙军
 *2015年6月16日 上午10:37:53
 */
public class chrkgl_chhdServiceImp implements chrkgl_chhdService{
    private chrkgl_chhdDAO chddao;
    private jcxx_CustomerDAO chd_cusdao;
    private jcxx_ReceiveFileDAO chd_recdao;
    private ddgl_OutofwarehouseOrderDAO chd_outdao;
    
	public void addCHD(chrkgl_chhdVO chdv) {
		chrkgl_chhd chd=new chrkgl_chhd();
		String chk_bm=chdv.getChk_bm();
        chd.setChk_bill(IDFactory.createChk_bill(chk_bm));//自动生成
        chd.setChk_bm(chk_bm);
        chd.setChk_date(chdv.getChk_date());
        chd.setChk_id(chd_outdao.findIdByBill(chdv.getChkdd_bill()).get(0)[3].toString());//
        chd.setChk_way(chdv.getChk_way());
        chd.setChkkf_id("10161");
        chd.setChkkh_id(chd_cusdao.findByName(chdv.getCus_name()).get(0)[2].toString());//
        chd.setChkorccpxh(chdv.getChkorccpxh());
        chd.setChkzhd_man("刘德华");
        chd.setSh_date(chdv.getSh_date());
        chd.setSh_way(chdv.getSh_way());
        chd.setShh_man(chdv.getShh_man());
        chd.setShh_tel(chdv.getShh_tel());
        chd.setShhdw_id(chd_recdao.findIdByBill(chdv.getRec_name()).get(0)[2].toString());
        chddao.add(chd);
		
		
	}

	public void updateCHD(chrkgl_chhdVO chdv) {
		chrkgl_chhd chd=new chrkgl_chhd();
        chd.setChk_bill(chdv.getChk_bill());
        chd.setChk_bm(chdv.getChk_bm());
        chd.setChk_date(chdv.getChk_date());
        chd.setChk_id(chdv.getChk_id());
        chd.setChk_way(chdv.getChk_way());
        chd.setChkkf_id(chdv.getChkkf_id());
        chd.setChkkh_id(chdv.getChkkh_id());
        chd.setChkorccpxh(chdv.getChkorccpxh());
        chd.setChkzhd_man(chdv.getChkzhd_man());
        chd.setSh_date(chdv.getSh_date());
        chd.setSh_way(chdv.getSh_way());
        chd.setShh_man(chdv.getShh_man());
        chd.setShh_tel(chdv.getShh_tel());
        chd.setShhdw_id(chdv.getShhdw_id());
        chddao.update(chd);
		
	}

	public List<chrkgl_chhdVO> findAll() {
		List<chrkgl_chhdVO> list=new ArrayList<chrkgl_chhdVO>();
		List<chrkgl_chhd> list1=chddao.findAll();
		for(int i=0;i<list1.size();i++){
			chrkgl_chhdVO chdv=new chrkgl_chhdVO();
			String chk_id=list1.get(i).getChk_id();
			String chkkh_id=list1.get(i).getChkkh_id();
			String shhdw_id=list1.get(i).getShhdw_id();
			chdv.setChk_bill(list1.get(i).getChk_bill());
			chdv.setChk_bm(list1.get(i).getChk_bm());
			chdv.setChk_date(list1.get(i).getChk_date());
			chdv.setChk_id(chk_id);
			chdv.setChk_way(list1.get(i).getChk_way());
			chdv.setChkdd_bill(chd_outdao.findNameById(chk_id).get(i)[3].toString());
			chdv.setChkkf_id(list1.get(i).getChkkf_id());
			chdv.setChkkh_id(chkkh_id);
			chdv.setChkorccpxh(list1.get(i).getChkorccpxh());
			chdv.setChkzhd_man(list1.get(i).getChkzhd_man());
			chdv.setCus_name(chd_cusdao.findNameById(chkkh_id).get(i)[2].toString());
			chdv.setRec_name(chd_recdao.findBillById(shhdw_id).get(i)[2].toString());
			chdv.setSh_date(list1.get(i).getSh_date());
			chdv.setSh_way(list1.get(i).getSh_way());
			chdv.setShh_man(list1.get(i).getShh_man());
			chdv.setShh_tel(list1.get(i).getShh_tel());
			chdv.setShhdw_id(shhdw_id);
			list.add(chdv);
			
		}
		return list;
	}

	public List<chrkgl_chhdVO> findByLike(chrkgl_chhdVO chdv) {
		List<chrkgl_chhdVO> list=new ArrayList<chrkgl_chhdVO>();
		chrkgl_chhd chd=new chrkgl_chhd();
		chd.setChk_bm(chdv.getChk_bm());
		chd.setChk_date(chdv.getChk_date());
		chd.setShh_man(chdv.getShh_man());
		List<chrkgl_chhd> list1=chddao.findByLike(chd);
		for(int i=0;i<list1.size();i++){
			chrkgl_chhdVO chdv1=new chrkgl_chhdVO();
			String chk_id=list1.get(i).getChk_id();
			String chkkh_id=list1.get(i).getChkkh_id();
			String shhdw_id=list1.get(i).getShhdw_id();
			chdv1.setChk_bill(list1.get(i).getChk_bill());
			chdv1.setChk_bm(list1.get(i).getChk_bm());
			chdv1.setChk_date(list1.get(i).getChk_date());
			chdv1.setChk_id(chk_id);
			chdv1.setChk_way(list1.get(i).getChk_way());
			chdv1.setChkdd_bill(chd_outdao.findNameById(chk_id).get(i)[3].toString());
			chdv1.setChkkf_id(list1.get(i).getChkkf_id());
			chdv1.setChkkh_id(chkkh_id);
			chdv1.setChkorccpxh(list1.get(i).getChkorccpxh());
			chdv1.setChkzhd_man(list1.get(i).getChkzhd_man());
			chdv1.setCus_name(chd_cusdao.findNameById(chkkh_id).get(i)[2].toString());
			chdv1.setRec_name(chd_recdao.findBillById(shhdw_id).get(i)[2].toString());
			chdv1.setSh_date(list1.get(i).getSh_date());
			chdv1.setSh_way(list1.get(i).getSh_way());
			chdv1.setShh_man(list1.get(i).getShh_man());
			chdv1.setShh_tel(list1.get(i).getShh_tel());
			chdv1.setShhdw_id(shhdw_id);
			list.add(chdv1);
			
		}
		return list;
	}

	public List<chrkgl_chhdVO> findBySplite(int currentPage, int pageSize) {
		List<chrkgl_chhdVO> list=new ArrayList<chrkgl_chhdVO>();
		List<chrkgl_chhd> list1=chddao.findBySplite(currentPage, pageSize);
		for(int i=0;i<list1.size();i++){
			chrkgl_chhdVO chdv=new chrkgl_chhdVO();
			String chk_id=list1.get(i).getChk_id();
			String chkkh_id=list1.get(i).getChkkh_id();
			String shhdw_id=list1.get(i).getShhdw_id();
			chdv.setChk_bill(list1.get(i).getChk_bill());
			chdv.setChk_bm(list1.get(i).getChk_bm());
			chdv.setChk_date(list1.get(i).getChk_date());
			chdv.setChk_id(chk_id);
			chdv.setChk_way(list1.get(i).getChk_way());
			chdv.setChkdd_bill(chd_outdao.findNameById(chk_id).get(i)[3].toString());
			chdv.setChkkf_id(list1.get(i).getChkkf_id());
			chdv.setChkkh_id(chkkh_id);
			chdv.setChkorccpxh(list1.get(i).getChkorccpxh());
			chdv.setChkzhd_man(list1.get(i).getChkzhd_man());
			chdv.setCus_name(chd_cusdao.findNameById(chkkh_id).get(i)[2].toString());
			System.out.println("============================>");
			System.out.println(chd_recdao.findBillById(shhdw_id).get(i)[2].toString());
			System.out.println("============================>");
			chdv.setRec_name(chd_recdao.findBillById(shhdw_id).get(i)[2].toString());
			chdv.setSh_date(list1.get(i).getSh_date());
			chdv.setSh_way(list1.get(i).getSh_way());
			chdv.setShh_man(list1.get(i).getShh_man());
			chdv.setShh_tel(list1.get(i).getShh_tel());
			chdv.setShhdw_id(shhdw_id);
			list.add(chdv);
			
		}
		return list;
	}

	public List<chrkgl_chhdVO> findBySpliteAndLike(chrkgl_chhdVO chdv,
			int currentPage, int pageSize) {
		List<chrkgl_chhdVO> list=new ArrayList<chrkgl_chhdVO>();
		chrkgl_chhd chd=new chrkgl_chhd();
		chd.setChk_bm(chdv.getChk_bm());
		chd.setChk_date(chdv.getChk_date());
		chd.setShh_man(chdv.getShh_man());
		List<chrkgl_chhd> list1=chddao.findBySpliteAndLike(chd, currentPage, pageSize);
		for(int i=0;i<list1.size();i++){
			chrkgl_chhdVO chdv1=new chrkgl_chhdVO();
			String chk_id=list1.get(i).getChk_id();
			String chkkh_id=list1.get(i).getChkkh_id();
			String shhdw_id=list1.get(i).getShhdw_id();
			chdv1.setChk_bill(list1.get(i).getChk_bill());
			chdv1.setChk_bm(list1.get(i).getChk_bm());
			chdv1.setChk_date(list1.get(i).getChk_date());
			chdv1.setChk_id(chk_id);
			chdv1.setChk_way(list1.get(i).getChk_way());
			chdv1.setChkdd_bill(chd_outdao.findNameById(chk_id).get(i)[3].toString());
			chdv1.setChkkf_id(list1.get(i).getChkkf_id());
			chdv1.setChkkh_id(chkkh_id);
			chdv1.setChkorccpxh(list1.get(i).getChkorccpxh());
			chdv1.setChkzhd_man(list1.get(i).getChkzhd_man());
			chdv1.setCus_name(chd_cusdao.findNameById(chkkh_id).get(i)[2].toString());
			chdv1.setRec_name(chd_recdao.findBillById(shhdw_id).get(i)[2].toString());
			chdv1.setSh_date(list1.get(i).getSh_date());
			chdv1.setSh_way(list1.get(i).getSh_way());
			chdv1.setShh_man(list1.get(i).getShh_man());
			chdv1.setShh_tel(list1.get(i).getShh_tel());
			chdv1.setShhdw_id(shhdw_id);
			list.add(chdv1);
			
		}
		return list;
	}
/**---------------------get/set方法------------------------------------------------------------**/

	public chrkgl_chhdDAO getChddao() {
		return chddao;
	}

	public void setChddao(chrkgl_chhdDAO chddao) {
		this.chddao = chddao;
	}

	public jcxx_CustomerDAO getChd_cusdao() {
		return chd_cusdao;
	}

	public void setChd_cusdao(jcxx_CustomerDAO chd_cusdao) {
		this.chd_cusdao = chd_cusdao;
	}

	public jcxx_ReceiveFileDAO getChd_recdao() {
		return chd_recdao;
	}

	public void setChd_recdao(jcxx_ReceiveFileDAO chd_recdao) {
		this.chd_recdao = chd_recdao;
	}

	public ddgl_OutofwarehouseOrderDAO getChd_outdao() {
		return chd_outdao;
	}

	public void setChd_outdao(ddgl_OutofwarehouseOrderDAO chd_outdao) {
		this.chd_outdao = chd_outdao;
	}
    
}
