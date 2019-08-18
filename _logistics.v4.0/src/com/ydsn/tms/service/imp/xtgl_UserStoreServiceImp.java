package com.ydsn.tms.service.imp;

import java.util.List;
import com.ydsn.tms.dao.xtgl_UserInfoDAO;
import com.ydsn.tms.dao.xtgl_UserStoreDAO;
import com.ydsn.tms.po.xtgl_UserInfo;
import com.ydsn.tms.service.xtgl_UserStoreService;
import com.ydsn.tms.util.Array2object;
import com.ydsn.tms.util.IDFactory;
import com.ydsn.tms.vo.xtgl_UserStore;

/**
 * 
 *@author  孙军
 *2015年6月11日 下午5:59:13
 */
public class xtgl_UserStoreServiceImp implements xtgl_UserStoreService{
    private xtgl_UserStoreDAO userdao;
    private xtgl_UserInfoDAO userdao1;
	

	@Override
	public void addUser(xtgl_UserStore us) {
		xtgl_UserInfo user=new xtgl_UserInfo();
		String user_mch=us.getUser_mch();
		String user_id=IDFactory.createUser_id(user_mch);
		user.setUser_id(user_id);
		user.setUser_mch(user_mch);
		user.setUser_name(us.getUser_name());
		user.setUser_pwd("123456");
		user.setStm_id("10161");
		userdao1.add(user);
	}

	
	@Override
	public void updateUser(xtgl_UserStore us) {
		xtgl_UserInfo user=new xtgl_UserInfo();
		user.setUser_id(us.getUser_id());
		user.setUser_mch(us.getUser_mch());
		user.setUser_name(us.getUser_name());
		user.setUser_pwd(us.getUser_pwd());
		user.setStm_id(us.getStm_id());
		userdao1.update(user);
	}

	
	@Override
	public List<xtgl_UserStore> findAllBySpliteAndLike(xtgl_UserStore us,int currentPage, int pageSize) {
		List<Object[]> list=userdao.findAllBySpliteAndLike(us, currentPage, pageSize);
		return Array2object.Array2UserStore(list);
	}

	
	@Override
	public List<xtgl_UserStore> findAllBySplite(int currentPage, int pageSize) {
		List<Object[]> list=userdao.findAllBySplite(currentPage, pageSize);
		return Array2object.Array2UserStore(list);
	}

	
	@Override
	public List<xtgl_UserStore> findAll() {
		List<Object[]> list=userdao.findAll();
		return Array2object.Array2UserStore(list);
	}
	
	@Override
	public List<xtgl_UserStore> findAllByLike(xtgl_UserStore us) {
		List<Object[]> list=userdao.findAllByLike(us);
		return Array2object.Array2UserStore(list);
	}
//--------------------------get/set 构造器--------------------------------------------------------------------------------


	public xtgl_UserStoreDAO getUserdao() {
		return userdao;
	}


	public void setUserdao(xtgl_UserStoreDAO userdao) {
		this.userdao = userdao;
	}


	public xtgl_UserStoreServiceImp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public xtgl_UserStoreServiceImp(xtgl_UserStoreDAO userdao) {
		super();
		this.userdao = userdao;
	}


	public xtgl_UserInfoDAO getUserdao1() {
		return userdao1;
	}


	public void setUserdao1(xtgl_UserInfoDAO userdao1) {
		this.userdao1 = userdao1;
	}


	public xtgl_UserStoreServiceImp(xtgl_UserInfoDAO userdao1) {
		this.userdao1 = userdao1;
	}
	





}
