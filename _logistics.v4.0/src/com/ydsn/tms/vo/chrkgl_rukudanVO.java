package com.ydsn.tms.vo;

/**
 * 
 *@author  孙军
 *2015年6月17日 下午8:16:31
 */
public class chrkgl_rukudanVO {
	  private String rk_bill;                     /**入库编号**/
	  private String kf_id;                       /**库房ID**/
	  private String rk_date;                     /**入库日期**/
	  private String dj_date;                     /**单据日期**/
	  private String kh_id;                       /**客户ID**/
	  private String rkdd_id;                     /**入库订单ID**/
	  private String jy_man;                      /**校验人**/
	  private String zhd_man;                     /**制单人**/
	  private String sh_driver;                   /**送货司机**/
	  private String rkorfprk;                    /**入库or返品入库**/
	  private String remark;                      /**备注**/
	  private String kf_name;                     /**库房名称**/
	  private String kh_name;                     /**客户名称**/
	  private String khrkdd_bill;                 /**客户入库订单编号**/
	public String getRk_bill() {
		return rk_bill;
	}
	public void setRk_bill(String rk_bill) {
		this.rk_bill = rk_bill;
	}
	public String getKf_id() {
		return kf_id;
	}
	public void setKf_id(String kf_id) {
		this.kf_id = kf_id;
	}
	public String getRk_date() {
		return rk_date;
	}
	public void setRk_date(String rk_date) {
		this.rk_date = rk_date;
	}
	public String getDj_date() {
		return dj_date;
	}
	public void setDj_date(String dj_date) {
		this.dj_date = dj_date;
	}
	public String getKh_id() {
		return kh_id;
	}
	public void setKh_id(String kh_id) {
		this.kh_id = kh_id;
	}
	public String getRkdd_id() {
		return rkdd_id;
	}
	public void setRkdd_id(String rkdd_id) {
		this.rkdd_id = rkdd_id;
	}
	public String getJy_man() {
		return jy_man;
	}
	public void setJy_man(String jy_man) {
		this.jy_man = jy_man;
	}
	public String getZhd_man() {
		return zhd_man;
	}
	public void setZhd_man(String zhd_man) {
		this.zhd_man = zhd_man;
	}
	public String getSh_driver() {
		return sh_driver;
	}
	public void setSh_driver(String sh_driver) {
		this.sh_driver = sh_driver;
	}
	public String getRkorfprk() {
		return rkorfprk;
	}
	public void setRkorfprk(String rkorfprk) {
		this.rkorfprk = rkorfprk;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getKf_name() {
		return kf_name;
	}
	public void setKf_name(String kf_name) {
		this.kf_name = kf_name;
	}
	public String getKh_name() {
		return kh_name;
	}
	public void setKh_name(String kh_name) {
		this.kh_name = kh_name;
	}
	public String getKhrkdd_bill() {
		return khrkdd_bill;
	}
	public void setKhrkdd_bill(String khrkdd_bill) {
		this.khrkdd_bill = khrkdd_bill;
	}
	public chrkgl_rukudanVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public chrkgl_rukudanVO(String rk_bill, String kf_id, String rk_date,
			String dj_date, String kh_id, String rkdd_id, String jy_man,
			String zhd_man, String sh_driver, String rkorfprk, String remark,
			String kf_name, String kh_name, String khrkdd_bill) {
		super();
		this.rk_bill = rk_bill;
		this.kf_id = kf_id;
		this.rk_date = rk_date;
		this.dj_date = dj_date;
		this.kh_id = kh_id;
		this.rkdd_id = rkdd_id;
		this.jy_man = jy_man;
		this.zhd_man = zhd_man;
		this.sh_driver = sh_driver;
		this.rkorfprk = rkorfprk;
		this.remark = remark;
		this.kf_name = kf_name;
		this.kh_name = kh_name;
		this.khrkdd_bill = khrkdd_bill;
	}
	  
	  
}
