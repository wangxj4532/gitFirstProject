package com.ydsn.tms.service.imp;

import java.util.ArrayList;
import java.util.List;

import com.ydsn.tms.dao.StoreroomDAO;
import com.ydsn.tms.dao.jcxx_CargoSpaceDAO;
import com.ydsn.tms.dao.jcxx_ComFileDAO;
import com.ydsn.tms.dao.nbchrkgl_huowuyiweiDAO;
import com.ydsn.tms.po.nbchrkgl_huowuyiwei;
import com.ydsn.tms.service.nbchrkgl_huowuyiweiService;
import com.ydsn.tms.util.IDFactory;
import com.ydsn.tms.vo.nbchrkgl_YWVO;

/**
 * 内部出入库管理模块--货物移库业务层实现类
 *@author  孙军
 *2015年6月15日 下午2:59:54
 */
public class nbchrkgl_huowuyiweiServiceImp implements nbchrkgl_huowuyiweiService{
    private nbchrkgl_huowuyiweiDAO ywdao;
    private jcxx_CargoSpaceDAO cardao3;
    private StoreroomDAO stodao;
    private jcxx_ComFileDAO yw_comdao;
	public void add(nbchrkgl_YWVO ywvo) {
		nbchrkgl_huowuyiwei yw=new nbchrkgl_huowuyiwei();
		yw.setHwychhw_id(cardao3.findByName2(ywvo.getHwychhw_bill()).get(0)[1].toString());
		yw.setHwyrhw_id(cardao3.findByName2(ywvo.getHwyrhw_bill()).get(0)[1].toString());
		yw.setHwyw_amount(ywvo.getHwyw_amount());
		yw.setHwyw_bill(IDFactory.createHwyw_bill());
		yw.setHwyw_num(ywvo.getHwyw_num());
		yw.setHwyw_reason(ywvo.getHwyw_reason());
		yw.setHwywbzhgg(ywvo.getHwywbzhgg());
		yw.setHwywck_id(stodao.findByName2(ywvo.getHwywck_name()).get(0)[0].toString());
		yw.setHwywshp_id(yw_comdao.findByName2(ywvo.getHwywshp_name()).get(0)[0].toString());
		ywdao.add(yw);
		
	}

	public void update(nbchrkgl_YWVO ywvo) {
		nbchrkgl_huowuyiwei yw=new nbchrkgl_huowuyiwei();
		yw.setHwychhw_id(ywvo.getHwychhw_id());
		yw.setHwyrhw_id(ywvo.getHwyrhw_id());
		yw.setHwyw_amount(ywvo.getHwyw_amount());
		yw.setHwyw_bill(ywvo.getHwyw_bill());
		yw.setHwyw_num(ywvo.getHwyw_num());
		yw.setHwyw_reason(ywvo.getHwyw_reason());
		yw.setHwywbzhgg(ywvo.getHwywbzhgg());
		yw.setHwywck_id(ywvo.getHwywck_id());
		yw.setHwywshp_id(ywvo.getHwywshp_id());
		ywdao.update(yw);
		
	}

	public void deleteById(String hwyw_bill) {
		ywdao.deleteById(hwyw_bill);
		
	}

	public List<nbchrkgl_YWVO> findAll() {
		
		List<nbchrkgl_YWVO> list=new ArrayList<nbchrkgl_YWVO>();
		List<nbchrkgl_huowuyiwei> list1=ywdao.findAll();
		for(int i=0;i<list1.size();i++){
			nbchrkgl_YWVO ywvo=new nbchrkgl_YWVO();
			ywvo.setHwyw_bill(list1.get(i).getHwyw_bill());
			ywvo.setHwychhw_id(list1.get(i).getHwychhw_id());
			ywvo.setHwyrhw_id(list1.get(i).getHwyrhw_id());
			ywvo.setHwywshp_id(list1.get(i).getHwywshp_id());
			ywvo.setHwywck_id(list1.get(i).getHwywck_id());
			ywvo.setHwyw_num(list1.get(i).getHwyw_num());
			ywvo.setHwywbzhgg(list1.get(i).getHwywbzhgg());
			ywvo.setHwyw_amount(list1.get(i).getHwyw_amount());
			ywvo.setHwyw_reason(list1.get(i).getHwyw_reason());
			ywvo.setHwychhw_bill(cardao3.findById(list1.get(i).getHwychhw_id()).get(0)[2].toString());
			ywvo.setHwyrhw_bill(cardao3.findById(list1.get(i).getHwyrhw_id()).get(0)[2].toString());
			ywvo.setHwywshp_name(yw_comdao.findById(list1.get(i).getHwywshp_id()).get(0)[4].toString());
			ywvo.setHwywck_name(stodao.findById(Integer.valueOf(list1.get(i).getHwywck_id())).get(0)[2].toString());
			list.add(ywvo);
		}
		return list;
	}

	public List<nbchrkgl_YWVO> findByLike(nbchrkgl_YWVO ywvo) {
		List<nbchrkgl_YWVO> list=new ArrayList<nbchrkgl_YWVO>();
		nbchrkgl_huowuyiwei yw=new nbchrkgl_huowuyiwei();
		if(ywvo.getHwychhw_bill().equals("")){
			yw.setHwychhw_id("");
		}else{
			yw.setHwychhw_id(cardao3.findByName2(ywvo.getHwychhw_bill()).get(0)[1].toString());
		}
		if(ywvo.getHwyrhw_bill().equals("")){
			yw.setHwyrhw_id("");
		}else{
			yw.setHwyrhw_id(cardao3.findByName2(ywvo.getHwyrhw_bill()).get(0)[1].toString());
		}
		yw.setHwyw_amount(ywvo.getHwyw_amount());
		yw.setHwyw_num(ywvo.getHwyw_num());
		yw.setHwyw_reason(ywvo.getHwyw_reason());
		yw.setHwywbzhgg(ywvo.getHwywbzhgg());
		if(ywvo.getHwywck_name().equals("")){
			yw.setHwywck_id("");
		}else{
			yw.setHwywck_id(stodao.findByName2(ywvo.getHwywck_name()).get(0)[0].toString());
		}
		if(ywvo.getHwywshp_name().equals("")){
			yw.setHwywshp_id("");
		}else{
			yw.setHwywshp_id(yw_comdao.findByName2(ywvo.getHwywshp_name()).get(0)[0].toString());
		}
		List<nbchrkgl_huowuyiwei> list1=ywdao.findByLike(yw);
		for(int i=0;i<list1.size();i++){
			nbchrkgl_YWVO ywvo1=new nbchrkgl_YWVO();
			ywvo1.setHwyw_bill(list1.get(i).getHwyw_bill());
			ywvo1.setHwychhw_id(list1.get(i).getHwychhw_id());
			ywvo1.setHwyrhw_id(list1.get(i).getHwyrhw_id());
			ywvo1.setHwywshp_id(list1.get(i).getHwywshp_id());
			ywvo1.setHwywck_id(list1.get(i).getHwywck_id());
			ywvo1.setHwyw_num(list1.get(i).getHwyw_num());
			ywvo1.setHwywbzhgg(list1.get(i).getHwywbzhgg());
			ywvo1.setHwyw_amount(list1.get(i).getHwyw_amount());
			ywvo1.setHwyw_reason(list1.get(i).getHwyw_reason());
			ywvo1.setHwychhw_bill(cardao3.findById(list1.get(i).getHwychhw_id()).get(0)[2].toString());
			ywvo1.setHwyrhw_bill(cardao3.findById(list1.get(i).getHwyrhw_id()).get(0)[2].toString());
			ywvo1.setHwywshp_name(yw_comdao.findById(list1.get(i).getHwywshp_id()).get(0)[4].toString());
			ywvo1.setHwywck_name(stodao.findById(Integer.valueOf(list1.get(i).getHwywck_id())).get(0)[2].toString());
			list.add(ywvo1);
		}
		return list;
	}

	public List<nbchrkgl_YWVO> findBySplite(int currentPage, int pageSize) {
		List<nbchrkgl_YWVO> list=new ArrayList<nbchrkgl_YWVO>();
		List<nbchrkgl_huowuyiwei> list1=ywdao.findBySplite(currentPage, pageSize);
		for(int i=0;i<list1.size();i++){
			nbchrkgl_YWVO ywvo=new nbchrkgl_YWVO();
			ywvo.setHwyw_bill(list1.get(i).getHwyw_bill());
			ywvo.setHwychhw_id(list1.get(i).getHwychhw_id());
			ywvo.setHwyrhw_id(list1.get(i).getHwyrhw_id());
			ywvo.setHwywshp_id(list1.get(i).getHwywshp_id());
			ywvo.setHwywck_id(list1.get(i).getHwywck_id());
			ywvo.setHwyw_num(list1.get(i).getHwyw_num());
			ywvo.setHwywbzhgg(list1.get(i).getHwywbzhgg());
			ywvo.setHwyw_amount(list1.get(i).getHwyw_amount());
			ywvo.setHwyw_reason(list1.get(i).getHwyw_reason());
			ywvo.setHwychhw_bill(cardao3.findById(list1.get(i).getHwychhw_id()).get(0)[2].toString());
			ywvo.setHwyrhw_bill(cardao3.findById(list1.get(i).getHwyrhw_id()).get(0)[2].toString());
			ywvo.setHwywshp_name(yw_comdao.findById(list1.get(i).getHwywshp_id()).get(0)[4].toString());
			ywvo.setHwywck_name(stodao.findById(Integer.valueOf(list1.get(i).getHwywck_id())).get(0)[2].toString());
			list.add(ywvo);
		}
		return list;
	}

	public List<nbchrkgl_YWVO> findBySpliteAndLike(nbchrkgl_YWVO ywvo,
			int currentPage, int pageSize) {
		List<nbchrkgl_YWVO> list=new ArrayList<nbchrkgl_YWVO>();
		nbchrkgl_huowuyiwei yw=new nbchrkgl_huowuyiwei();
		if(ywvo.getHwychhw_bill().equals("")){
			yw.setHwychhw_id("");
		}else{
			yw.setHwychhw_id(cardao3.findByName2(ywvo.getHwychhw_bill()).get(0)[1].toString());
		}
		if(ywvo.getHwyrhw_bill().equals("")){
			yw.setHwyrhw_id("");
		}else{
			yw.setHwyrhw_id(cardao3.findByName2(ywvo.getHwyrhw_bill()).get(0)[1].toString());
		}
		yw.setHwyw_amount(ywvo.getHwyw_amount());
		yw.setHwyw_num(ywvo.getHwyw_num());
		yw.setHwyw_reason(ywvo.getHwyw_reason());
		yw.setHwywbzhgg(ywvo.getHwywbzhgg());
		if(ywvo.getHwywck_name().equals("")){
			yw.setHwywck_id("");
		}else{
			yw.setHwywck_id(stodao.findByName2(ywvo.getHwywck_name()).get(0)[0].toString());
		}
		if(ywvo.getHwywshp_name().equals("")){
			yw.setHwywshp_id("");
		}else{
			yw.setHwywshp_id(yw_comdao.findByName2(ywvo.getHwywshp_name()).get(0)[0].toString());
		}
		List<nbchrkgl_huowuyiwei> list1=ywdao.findBySpliteAndLike(yw, currentPage, pageSize);
		for(int i=0;i<list1.size();i++){
			nbchrkgl_YWVO ywvo1=new nbchrkgl_YWVO();
			ywvo1.setHwyw_bill(list1.get(i).getHwyw_bill());
			ywvo1.setHwychhw_id(list1.get(i).getHwychhw_id());
			ywvo1.setHwyrhw_id(list1.get(i).getHwyrhw_id());
			ywvo1.setHwywshp_id(list1.get(i).getHwywshp_id());
			ywvo1.setHwywck_id(list1.get(i).getHwywck_id());
			ywvo1.setHwyw_num(list1.get(i).getHwyw_num());
			ywvo1.setHwywbzhgg(list1.get(i).getHwywbzhgg());
			ywvo1.setHwyw_amount(list1.get(i).getHwyw_amount());
			ywvo1.setHwyw_reason(list1.get(i).getHwyw_reason());
			ywvo1.setHwychhw_bill(cardao3.findById(list1.get(i).getHwychhw_id()).get(0)[2].toString());
			ywvo1.setHwyrhw_bill(cardao3.findById(list1.get(i).getHwyrhw_id()).get(0)[2].toString());
			ywvo1.setHwywshp_name(yw_comdao.findById(list1.get(i).getHwywshp_id()).get(0)[4].toString());
			ywvo1.setHwywck_name(stodao.findById(Integer.valueOf(list1.get(i).getHwywck_id())).get(0)[2].toString());
			list.add(ywvo1);
		}
		return list;
	}
/**---------------------------------------get/set方法和构造器----------------------------------------------**/

	public nbchrkgl_huowuyiweiDAO getYwdao() {
		return ywdao;
	}

	public void setYwdao(nbchrkgl_huowuyiweiDAO ywdao) {
		this.ywdao = ywdao;
	}

	public jcxx_CargoSpaceDAO getCardao3() {
		return cardao3;
	}

	public void setCardao3(jcxx_CargoSpaceDAO cardao3) {
		this.cardao3 = cardao3;
	}

	public StoreroomDAO getStodao() {
		return stodao;
	}

	public void setStodao(StoreroomDAO stodao) {
		this.stodao = stodao;
	}



	public jcxx_ComFileDAO getYw_comdao() {
		return yw_comdao;
	}

	public void setYw_comdao(jcxx_ComFileDAO yw_comdao) {
		this.yw_comdao = yw_comdao;
	}

	public nbchrkgl_huowuyiweiServiceImp() {
	}

	public nbchrkgl_huowuyiweiServiceImp(nbchrkgl_huowuyiweiDAO ywdao) {
		this.ywdao = ywdao;
	}
    
}
