package com.ydsn.tms.service.imp;

import java.util.ArrayList;
import java.util.List;

import com.ydsn.tms.dao.StoreroomDAO;
import com.ydsn.tms.dao.chrkgl_rukudanDAO;
import com.ydsn.tms.dao.ddgl_enterwarehouseOrderDAO;
import com.ydsn.tms.dao.jcxx_CustomerDAO;
import com.ydsn.tms.po.chrkgl_rukudan;
import com.ydsn.tms.service.chrkgl_rukudanService;
import com.ydsn.tms.util.IDFactory;
import com.ydsn.tms.vo.chrkgl_rukudanVO;

/**
 * 
 *@author  孙军
 *2015年6月17日 下午9:06:37
 */
public class chrkgl_rukudanServiceImp implements chrkgl_rukudanService{
    private chrkgl_rukudanDAO rkddao;
    private ddgl_enterwarehouseOrderDAO rkd_entdao;
    private jcxx_CustomerDAO rkd_cusdao;
    private StoreroomDAO rkd_stodao;
	public void add(chrkgl_rukudanVO rkdv) {
		System.out.println("=2=");
		chrkgl_rukudan rkd=new chrkgl_rukudan();
		String kh_name=rkdv.getKh_name();
		String khrkdd_bill=rkdv.getKhrkdd_bill();
		System.out.println("=3="+khrkdd_bill);
		rkd.setDj_date(rkdv.getDj_date());
		rkd.setJy_man(rkdv.getJy_man());
		rkd.setKf_id("10161");
		rkd.setKh_id(rkd_cusdao.findByName(kh_name).get(0)[0].toString());
		rkd.setRemark(rkdv.getRemark());
		rkd.setRk_bill(IDFactory.createRk_bill());
		rkd.setRk_date(rkdv.getRk_date());
		System.out.println("=3="+rkd_entdao.findIdByBill(khrkdd_bill).size());
		rkd.setRkdd_id(rkd_entdao.findIdByBill(khrkdd_bill).get(0)[2].toString());
		System.out.println("=4=");
		rkd.setRkorfprk(rkdv.getRkorfprk());
		rkd.setSh_driver(rkdv.getSh_driver());
		rkd.setZhd_man("刘德华");
		rkddao.add(rkd);
	}

	public void update(chrkgl_rukudanVO rkdv) {
		chrkgl_rukudan rkd=new chrkgl_rukudan();
		String kh_name=rkdv.getKh_name();
		String khrkdd_bill=rkdv.getKhrkdd_bill();
		rkd.setDj_date(rkdv.getDj_date());
		rkd.setJy_man(rkdv.getJy_man());
		rkd.setKf_id("10161");
		rkd.setKh_id(rkd_cusdao.findByName(kh_name).get(0)[0].toString());
		rkd.setRemark(rkdv.getRemark());
		rkd.setRk_bill(rkdv.getRk_bill());
		rkd.setRk_date(rkdv.getRk_date());
		rkd.setRkdd_id(rkd_entdao.findIdByBill(khrkdd_bill).get(0)[2].toString());
		rkd.setRkorfprk(rkdv.getRkorfprk());
		rkd.setSh_driver(rkdv.getSh_driver());
		rkd.setZhd_man(rkdv.getZhd_man());
		rkddao.update(rkd);;
	}

	public List<chrkgl_rukudanVO> findAll() {
		List<chrkgl_rukudanVO> list=new ArrayList<chrkgl_rukudanVO>();
		List<chrkgl_rukudan> list1=rkddao.findAll();
		for(int i=0;i<list1.size();i++){
			chrkgl_rukudanVO rkdv=new chrkgl_rukudanVO();
			String kf_id=list1.get(i).getKf_id();
			String kh_id=list1.get(i).getKh_id();
			String rkdd_id=list1.get(i).getRkdd_id();
			  rkdv.setRk_bill(list1.get(i).getRk_bill());
			  rkdv.setKf_id(kf_id);
			  rkdv.setRk_date(list1.get(i).getRk_date());
			  rkdv.setDj_date(list1.get(i).getDj_date());
			  rkdv.setKh_id(kh_id);
			  rkdv.setRkdd_id(rkdd_id);
			  rkdv.setJy_man(list1.get(i).getJy_man());
			  rkdv.setZhd_man(list1.get(i).getZhd_man());
			  rkdv.setSh_driver(list1.get(i).getSh_driver());
			  rkdv.setRkorfprk(list1.get(i).getRkorfprk());
			  rkdv.setRemark(list1.get(i).getRemark());
			  rkdv.setKf_name(rkd_stodao.findById(Integer.valueOf(kf_id)).get(0)[2].toString());
			  rkdv.setKh_name(rkd_cusdao.findNameById(kh_id).get(0)[2].toString());
			  rkdv.setKhrkdd_bill(rkd_entdao.findNameById(rkdd_id).get(0)[3].toString());
			  list.add(rkdv);
			  
			
		}
		return list;
	}

	public List<chrkgl_rukudanVO> findByLike(chrkgl_rukudanVO rkdv) {
		List<chrkgl_rukudanVO> list=new ArrayList<chrkgl_rukudanVO>();
		chrkgl_rukudan rkd=new chrkgl_rukudan();
		if(rkdv.getKh_name().equals("")){
			rkd.setKh_id("");
		}else{
			rkd.setKh_id(rkd_cusdao.findByName(rkdv.getKh_name()).get(0)[0].toString());
		}
		if(rkdv.getKhrkdd_bill().equals("")){
			rkd.setRkdd_id("");
		}else{
			rkd.setRkdd_id(rkd_entdao.findIdByBill(rkdv.getKhrkdd_bill()).get(0)[2].toString());
		}
		rkdv.setRkorfprk(rkdv.getRkorfprk());
		List<chrkgl_rukudan> list1=rkddao.findByLike(rkd);
		for(int i=0;i<list1.size();i++){
			chrkgl_rukudanVO rkdv1=new chrkgl_rukudanVO();
			String kf_id=list1.get(i).getKf_id();
			String kh_id=list1.get(i).getKh_id();
			String rkdd_id=list1.get(i).getRkdd_id();
			  rkdv1.setRk_bill(list1.get(i).getRk_bill());
			  rkdv1.setKf_id(kf_id);
			  rkdv1.setRk_date(list1.get(i).getRk_date());
			  rkdv1.setDj_date(list1.get(i).getDj_date());
			  rkdv1.setKh_id(kh_id);
			  rkdv1.setRkdd_id(rkdd_id);
			  rkdv1.setJy_man(list1.get(i).getJy_man());
			  rkdv1.setZhd_man(list1.get(i).getZhd_man());
			  rkdv1.setSh_driver(list1.get(i).getSh_driver());
			  rkdv1.setRkorfprk(list1.get(i).getRkorfprk());
			  rkdv1.setRemark(list1.get(i).getRemark());
			  rkdv1.setKf_name(rkd_stodao.findById(Integer.valueOf(kf_id)).get(0)[2].toString());
			  rkdv1.setKh_name(rkd_cusdao.findNameById(kh_id).get(0)[2].toString());
			  rkdv1.setKhrkdd_bill(rkd_entdao.findNameById(rkdd_id).get(0)[3].toString());
			  list.add(rkdv1);
		}
		return list;
	}

	public List<chrkgl_rukudanVO> findBySplite(int currentPage, int pageSize) {
		List<chrkgl_rukudanVO> list=new ArrayList<chrkgl_rukudanVO>();
		List<chrkgl_rukudan> list1=rkddao.findBySplite(currentPage, pageSize);
		for(int i=0;i<list1.size();i++){
			chrkgl_rukudanVO rkdv=new chrkgl_rukudanVO();
			String kf_id=list1.get(i).getKf_id();
			String kh_id=list1.get(i).getKh_id();
			String rkdd_id=list1.get(i).getRkdd_id();
			  rkdv.setRk_bill(list1.get(i).getRk_bill());
			  rkdv.setKf_id(kf_id);
			  rkdv.setRk_date(list1.get(i).getRk_date());
			  rkdv.setDj_date(list1.get(i).getDj_date());
			  rkdv.setKh_id(kh_id);
			  rkdv.setRkdd_id(rkdd_id);
			  rkdv.setJy_man(list1.get(i).getJy_man());
			  rkdv.setZhd_man(list1.get(i).getZhd_man());
			  rkdv.setSh_driver(list1.get(i).getSh_driver());
			  rkdv.setRkorfprk(list1.get(i).getRkorfprk());
			  rkdv.setRemark(list1.get(i).getRemark());
			  rkdv.setKf_name(rkd_stodao.findById(Integer.valueOf(kf_id)).get(0)[2].toString());
			  rkdv.setKh_name(rkd_cusdao.findNameById(kh_id).get(0)[2].toString());
			  rkdv.setKhrkdd_bill(rkd_entdao.findNameById(rkdd_id).get(0)[3].toString());
			  list.add(rkdv);
			  
			
		}
		return list;
	}

	public List<chrkgl_rukudanVO> findBySpliteAndLike(chrkgl_rukudanVO rkdv,
			int currentPage, int pageSize) {
		List<chrkgl_rukudanVO> list=new ArrayList<chrkgl_rukudanVO>();
		chrkgl_rukudan rkd=new chrkgl_rukudan();
		if(rkdv.getKh_name().equals("")){
			rkd.setKh_id("");
		}else{
			rkd.setKh_id(rkd_cusdao.findByName(rkdv.getKh_name()).get(0)[0].toString());
		}
		if(rkdv.getKhrkdd_bill().equals("")){
			rkd.setRkdd_id("");
		}else{
			rkd.setRkdd_id(rkd_entdao.findIdByBill(rkdv.getKhrkdd_bill()).get(0)[2].toString());
		}
		rkdv.setRkorfprk(rkdv.getRkorfprk());
		List<chrkgl_rukudan> list1=rkddao.findByLike(rkd);
		for(int i=0;i<list1.size();i++){
			chrkgl_rukudanVO rkdv1=new chrkgl_rukudanVO();
			String kf_id=list1.get(i).getKf_id();
			String kh_id=list1.get(i).getKh_id();
			String rkdd_id=list1.get(i).getRkdd_id();
			  rkdv1.setRk_bill(list1.get(i).getRk_bill());
			  rkdv1.setKf_id(kf_id);
			  rkdv1.setRk_date(list1.get(i).getRk_date());
			  rkdv1.setDj_date(list1.get(i).getDj_date());
			  rkdv1.setKh_id(kh_id);
			  rkdv1.setRkdd_id(rkdd_id);
			  rkdv1.setJy_man(list1.get(i).getJy_man());
			  rkdv1.setZhd_man(list1.get(i).getZhd_man());
			  rkdv1.setSh_driver(list1.get(i).getSh_driver());
			  rkdv1.setRkorfprk(list1.get(i).getRkorfprk());
			  rkdv1.setRemark(list1.get(i).getRemark());
			  rkdv1.setKf_name(rkd_stodao.findById(Integer.valueOf(kf_id)).get(0)[2].toString());
			  rkdv1.setKh_name(rkd_cusdao.findNameById(kh_id).get(0)[2].toString());
			  rkdv1.setKhrkdd_bill(rkd_entdao.findNameById(rkdd_id).get(0)[3].toString());
			  list.add(rkdv1);
		}
		return list;
	}
/**---------------------------------get/set方法---------------------------------------------------**/
	public chrkgl_rukudanDAO getRkddao() {
		return rkddao;
	}

	public void setRkddao(chrkgl_rukudanDAO rkddao) {
		this.rkddao = rkddao;
	}

	public ddgl_enterwarehouseOrderDAO getRkd_entdao() {
		return rkd_entdao;
	}

	public void setRkd_entdao(ddgl_enterwarehouseOrderDAO rkd_entdao) {
		this.rkd_entdao = rkd_entdao;
	}

	public jcxx_CustomerDAO getRkd_cusdao() {
		return rkd_cusdao;
	}

	public void setRkd_cusdao(jcxx_CustomerDAO rkd_cusdao) {
		this.rkd_cusdao = rkd_cusdao;
	}

	public StoreroomDAO getRkd_stodao() {
		return rkd_stodao;
	}

	public void setRkd_stodao(StoreroomDAO rkd_stodao) {
		this.rkd_stodao = rkd_stodao;
	}

    
    
	
	
}
