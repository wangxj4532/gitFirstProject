package com.ydsn.tms.po;

/**
 * ��������ģ�顪����ⵥʵ��
 *@author  ���
 *2015��6��17�� ����7:48:14
 */
public class chrkgl_rukudan {
	  private String rk_bill;                     /**�����**/
	  private String kf_id;                       /**�ⷿID**/
	  private String rk_date;                     /**�������**/
	  private String dj_date;                     /**��������**/
	  private String kh_id;                       /**�ͻ�ID**/
	  private String rkdd_id;                     /**��ⶩ��ID**/
	  private String jy_man;                      /**У����**/
	  private String zhd_man;                     /**�Ƶ���**/
	  private String sh_driver;                   /**�ͻ�˾��**/
	  private String rkorfprk;                    /**���or��Ʒ���**/
	  private String remark;                      /**��ע**/
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
	public chrkgl_rukudan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public chrkgl_rukudan(String rk_bill, String kf_id, String rk_date,
			String dj_date, String kh_id, String rkdd_id, String jy_man,
			String zhd_man, String sh_driver, String rkorfprk, String remark) {
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
	}
	  
}
