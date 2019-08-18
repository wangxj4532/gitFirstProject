package com.ydsn.tms.action;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.ydsn.tms.po.xtgl_UserInfo;
import com.ydsn.tms.service.xtgl_UserUpdPwdService;

/**
 * 系统管理模块———用户修改密码控制层
 *@author  孙军
 *2015年6月12日 下午5:33:53
 */
public class xtgl_UserUpdPwdAction {
    private xtgl_UserUpdPwdService pwdser;
    private String user_id;
    private String old_pwd;
    private String new_pwd;
    
    public String vilPwd(){
    	HttpServletResponse response=ServletActionContext.getResponse();
    	List<xtgl_UserInfo> list=pwdser.vilPwd(user_id, old_pwd);
    	if(list.size()!=1){
    		try {
    			response.getWriter().write("1");
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	return null;
    }
    public String submit(){
    	pwdser.submit(user_id, new_pwd);
    	HttpServletResponse response=ServletActionContext.getResponse();
    		try {
    			String str = "{\"status\":\"ok\" , \"message\":\"操作成功!\"}";
    			response.getWriter().write(str);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	return null;
    }
    
 /**-------------------get/set方法和构造器----------------------------------------------------------------**/

	public xtgl_UserUpdPwdService getPwdser() {
		return pwdser;
	}
	public void setPwdser(xtgl_UserUpdPwdService pwdser) {
		this.pwdser = pwdser;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getOld_pwd() {
		return old_pwd;
	}
	public void setOld_pwd(String old_pwd) {
		this.old_pwd = old_pwd;
	}
	public String getNew_pwd() {
		return new_pwd;
	}
	public void setNew_pwd(String new_pwd) {
		this.new_pwd = new_pwd;
	}
	public xtgl_UserUpdPwdAction() {
	}
	public xtgl_UserUpdPwdAction(xtgl_UserUpdPwdService pwdser) {
		this.pwdser = pwdser;
	}
    
}
