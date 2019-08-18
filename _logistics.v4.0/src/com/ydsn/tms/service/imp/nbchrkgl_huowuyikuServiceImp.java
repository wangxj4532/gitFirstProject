package com.ydsn.tms.service.imp;

import java.util.ArrayList;
import java.util.List;

import com.ydsn.tms.dao.StoreroomDAO;
import com.ydsn.tms.dao.nbchrkgl_huowuyikuDAO;
import com.ydsn.tms.po.nbchrkgl_huowuyiku;
import com.ydsn.tms.service.nbchrkgl_huowuyikuService;
import com.ydsn.tms.util.DateTools;
import com.ydsn.tms.util.IDFactory;
import com.ydsn.tms.vo.nbchrkgl_YKSto;

/**
 * 
 *@author  孙军
 *2015年6月15日 上午8:35:01
 */
public class nbchrkgl_huowuyikuServiceImp implements nbchrkgl_huowuyikuService{
    private nbchrkgl_huowuyikuDAO ykdao;
    private StoreroomDAO stodao;
	public void addYK(nbchrkgl_YKSto yks) {
		nbchrkgl_huowuyiku yk=new nbchrkgl_huowuyiku();
		
		yk.setHwychk_bill(stodao.findByName2(yks.getHwychk_name()).get(0)[0].toString());
		yk.setHwyk_bill(IDFactory.createHwyk_bill());
		yk.setHwyk_remark(yks.getHwyk_remark());
		yk.setHwykzhd_man("刘德华");
		yk.setHwykzhd_time(DateTools.createRkddzhd_time());
		yk.setHwyrk_bill(stodao.findByName2(yks.getHwyrk_name()).get(0)[0].toString());
		ykdao.add(yk);

		
	}

	public void updateYK(nbchrkgl_YKSto yks) {
		nbchrkgl_huowuyiku yk=new nbchrkgl_huowuyiku();
		yk.setHwychk_bill(yks.getHwychk_bill());
		yk.setHwyk_bill(yks.getHwyk_bill());
		yk.setHwyk_remark(yks.getHwyk_remark());
		yk.setHwykzhd_man(yks.getHwykzhd_man());
		yk.setHwykzhd_time(yks.getHwykzhd_time());
		yk.setHwyrk_bill(yks.getHwyrk_bill());
		ykdao.update(yk);
		
	}

	public void deleteById(String hwyk_bill) {
		ykdao.deleteById(hwyk_bill);
		
	}

	public List<nbchrkgl_YKSto> findAll() {
		List<nbchrkgl_YKSto> list1=new ArrayList<nbchrkgl_YKSto>();
		List<nbchrkgl_huowuyiku> list=ykdao.findAll();
		
		for(int i=0;i<list.size();i++){
			nbchrkgl_YKSto yks=new nbchrkgl_YKSto();
			yks.setHwyk_bill(list.get(i).getHwyk_bill());
			yks.setHwychk_bill(list.get(i).getHwychk_bill());
			yks.setHwyrk_bill(list.get(i).getHwyrk_bill());
			yks.setHwykzhd_man(list.get(i).getHwykzhd_man());
			yks.setHwykzhd_time(list.get(i).getHwykzhd_time());
			yks.setHwyk_remark(list.get(i).getHwyk_remark());
			yks.setHwyrk_name(stodao.findById(Integer.valueOf(list.get(i).getHwyrk_bill())).get(0)[2].toString());
			yks.setHwychk_name(stodao.findById(Integer.valueOf(list.get(i).getHwychk_bill())).get(0)[2].toString());
			list1.add(yks);
		}
		return list1;
	}

	public List<nbchrkgl_YKSto> findByLike(nbchrkgl_YKSto yks) {
		List<nbchrkgl_YKSto> list1=new ArrayList<nbchrkgl_YKSto>();
		nbchrkgl_huowuyiku yk=new nbchrkgl_huowuyiku();
		if(yks.getHwychk_name().equals("")){
			yk.setHwychk_bill("");
		}else{
			yk.setHwychk_bill(stodao.findByName2(yks.getHwychk_name()).get(0)[0].toString());
		}
		if(yks.getHwyrk_name().equals("")){
			yk.setHwyrk_bill("");
		}else{
			yk.setHwyrk_bill(stodao.findByName2(yks.getHwyrk_name()).get(0)[0].toString());
		}
		yk.setHwyk_remark(yks.getHwyk_remark());
		List<nbchrkgl_huowuyiku> list=ykdao.findByLike(yk);
		for(int i=0;i<list.size();i++){
			nbchrkgl_YKSto yks1=new nbchrkgl_YKSto();
			yks1.setHwyk_bill(list.get(i).getHwyk_bill());
			yks1.setHwychk_bill(list.get(i).getHwychk_bill());
			yks1.setHwyrk_bill(list.get(i).getHwyrk_bill());
			yks1.setHwykzhd_man(list.get(i).getHwykzhd_man());
			yks1.setHwykzhd_time(list.get(i).getHwykzhd_time());
			yks1.setHwyk_remark(list.get(i).getHwyk_remark());
			yks.setHwyrk_name(stodao.findById(Integer.valueOf(list.get(i).getHwyrk_bill())).get(0)[2].toString());
			yks1.setHwychk_name(stodao.findById(Integer.valueOf(list.get(i).getHwychk_bill())).get(0)[2].toString());
			list1.add(yks1);
		}
		return list1;
	}

	public List<nbchrkgl_YKSto> findBySplite(int currentPage, int pageSize) {
		List<nbchrkgl_YKSto> list1=new ArrayList<nbchrkgl_YKSto>();
		List<nbchrkgl_huowuyiku> list=ykdao.findBySplite(currentPage, pageSize);
		for(int i=0;i<list.size();i++){
			nbchrkgl_YKSto yks=new nbchrkgl_YKSto();
			yks.setHwyk_bill(list.get(i).getHwyk_bill());
			yks.setHwychk_bill(list.get(i).getHwychk_bill());
			yks.setHwyrk_bill(list.get(i).getHwyrk_bill());
			yks.setHwykzhd_man(list.get(i).getHwykzhd_man());
			yks.setHwykzhd_time(list.get(i).getHwykzhd_time());
			yks.setHwyk_remark(list.get(i).getHwyk_remark());
			yks.setHwyrk_name(stodao.findById(Integer.valueOf(list.get(i).getHwyrk_bill())).get(0)[2].toString());
			yks.setHwychk_name(stodao.findById(Integer.valueOf(list.get(i).getHwychk_bill())).get(0)[2].toString());
			list1.add(yks);
		}
		return list1;
	}

	public List<nbchrkgl_YKSto> findBySpliteAndLike(nbchrkgl_YKSto yks,
			int currentPage, int pageSize) {
		List<nbchrkgl_YKSto> list1=new ArrayList<nbchrkgl_YKSto>();
		nbchrkgl_huowuyiku yk=new nbchrkgl_huowuyiku();
		if(yks.getHwychk_name().equals("")){
			yk.setHwychk_bill("");
		}else{
			yk.setHwychk_bill(stodao.findByName2(yks.getHwychk_name()).get(0)[0].toString());
		}
		if(yks.getHwyrk_name().equals("")){
			yk.setHwyrk_bill("");
		}else{
			yk.setHwyrk_bill(stodao.findByName2(yks.getHwyrk_name()).get(0)[0].toString());
		}
		yk.setHwyk_remark(yks.getHwyk_remark());
		List<nbchrkgl_huowuyiku> list=ykdao.findBySpliteAndLike(yk, currentPage, pageSize);
		for(int i=0;i<list.size();i++){
			nbchrkgl_YKSto yks1=new nbchrkgl_YKSto();
			yks1.setHwyk_bill(list.get(i).getHwyk_bill());
			yks1.setHwychk_bill(list.get(i).getHwychk_bill());
			yks1.setHwyrk_bill(list.get(i).getHwyrk_bill());
			yks1.setHwykzhd_man(list.get(i).getHwykzhd_man());
			yks1.setHwykzhd_time(list.get(i).getHwykzhd_time());
			yks1.setHwyk_remark(list.get(i).getHwyk_remark());
			yks1.setHwyrk_name(stodao.findById(Integer.valueOf(list.get(i).getHwyrk_bill())).get(0)[2].toString());
			yks1.setHwychk_name(stodao.findById(Integer.valueOf(list.get(i).getHwychk_bill())).get(0)[2].toString());
			list1.add(yks1);
		}
		return list1;
	}
/**--------------------------------get/set和构造器-------------------------------------------------------**/

	public nbchrkgl_huowuyikuDAO getYkdao() {
		return ykdao;
	}

	public void setYkdao(nbchrkgl_huowuyikuDAO ykdao) {
		this.ykdao = ykdao;
	}

	public nbchrkgl_huowuyikuServiceImp() {
	}

	public nbchrkgl_huowuyikuServiceImp(nbchrkgl_huowuyikuDAO ykdao) {
		this.ykdao = ykdao;
	}

	public StoreroomDAO getStodao() {
		return stodao;
	}

	public void setStodao(StoreroomDAO stodao) {
		this.stodao = stodao;
	}
    
 
}
