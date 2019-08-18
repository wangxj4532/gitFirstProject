package com.ydsn.tms.service.imp;

import java.util.List;

import com.ydsn.tms.dao.xtgl_AuthorityGroupDAO;
import com.ydsn.tms.po.xtgl_Authoritygroup;
import com.ydsn.tms.service.xtgl_AuthorityGroupService;

/**
 * 系统管理模块——权限组业务层（实现类）
 *@author  孙军
 *2015年6月12日 上午8:56:39
 */
public class xtgl_AuthorityGroupServiceImp implements xtgl_AuthorityGroupService{
    private xtgl_AuthorityGroupDAO authdao;
    
	@Override
	public void addAuth(xtgl_Authoritygroup auth) {
		authdao.add(auth);
		
	}

	@Override
	public void updateAuth(xtgl_Authoritygroup auth) {
		authdao.update(auth);
		
	}

	@Override
	public List<xtgl_Authoritygroup> findAllBySpliteAndLike(
			xtgl_Authoritygroup auth, int currentPage, int pageSize) {
		List<xtgl_Authoritygroup> list=authdao.findBySplitePageAndLike(auth, currentPage, pageSize);
		return list;
	}

	@Override
	public List<xtgl_Authoritygroup> findAllBySplite(int currentPage,
			int pageSize) {
		List<xtgl_Authoritygroup> list=authdao.findBySplitePage(currentPage, pageSize);
		return list;
	}

	@Override
	public List<xtgl_Authoritygroup> findAll() {
		List<xtgl_Authoritygroup> list=authdao.findAll();
		return list;
	}
	@Override
	public List<xtgl_Authoritygroup> findByLike(xtgl_Authoritygroup auth) {
		List<xtgl_Authoritygroup> list=authdao.findByLike(auth);
		return list;
	}
/**---------------------------get/set方法和构造器-----------------------------------------------------------**/	
	
	public xtgl_AuthorityGroupServiceImp(xtgl_AuthorityGroupDAO authdao) {
		this.authdao = authdao;
	}

	public xtgl_AuthorityGroupServiceImp() {
	}

	public xtgl_AuthorityGroupDAO getAuthdao() {
		return authdao;
	}

	public void setAuthdao(xtgl_AuthorityGroupDAO authdao) {
		this.authdao = authdao;
	}

	

}
