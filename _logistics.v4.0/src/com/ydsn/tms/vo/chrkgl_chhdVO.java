package com.ydsn.tms.vo;

/**
 * 出入库管理模块——出货单vo
 *@author  孙军
 *2015年6月16日 上午8:59:56
 */
public class chrkgl_chhdVO {
	private String chk_id;                       /**出库订单ID**/
	private String chk_bill;                     /**出库单编号**/
	private String chkkf_id;                     /**出库库房ID**/
	private String chk_date;                     /**出库日期**/
	private String chkkh_id;                     /**出库客户ID**/
	private String shhdw_id;                     /**收货单位ID**/
	private String chk_way;                      /**出库方式**/
	private String sh_way;                       /**送货方式**/
	private String sh_date;                      /**送货日期**/
	private String shh_man;                      /**收货人**/
	private String shh_tel;                      /**收货人电话**/
	private String chkzhd_man;                   /**出库制单人**/
	private String chk_bm;                       /**出库单编码**/
	private String chkorccpxh;                   /**出库OR残次品核销**/
	private String rec_name;                     /**收货单位**/
	private String cus_name;                     /**客户名称**/
	private String chkdd_bill;                   /**客户订单编号**/
	public String getChk_id() {
		return chk_id;
	}
	public void setChk_id(String chk_id) {
		this.chk_id = chk_id;
	}
	public String getChk_bill() {
		return chk_bill;
	}
	public void setChk_bill(String chk_bill) {
		this.chk_bill = chk_bill;
	}
	public String getChkkf_id() {
		return chkkf_id;
	}
	public void setChkkf_id(String chkkf_id) {
		this.chkkf_id = chkkf_id;
	}
	public String getChk_date() {
		return chk_date;
	}
	public void setChk_date(String chk_date) {
		this.chk_date = chk_date;
	}
	public String getChkkh_id() {
		return chkkh_id;
	}
	public void setChkkh_id(String chkkh_id) {
		this.chkkh_id = chkkh_id;
	}
	public String getShhdw_id() {
		return shhdw_id;
	}
	public void setShhdw_id(String shhdw_id) {
		this.shhdw_id = shhdw_id;
	}
	public String getChk_way() {
		return chk_way;
	}
	public void setChk_way(String chk_way) {
		this.chk_way = chk_way;
	}
	public String getSh_way() {
		return sh_way;
	}
	public void setSh_way(String sh_way) {
		this.sh_way = sh_way;
	}
	public String getSh_date() {
		return sh_date;
	}
	public void setSh_date(String sh_date) {
		this.sh_date = sh_date;
	}
	public String getShh_man() {
		return shh_man;
	}
	public void setShh_man(String shh_man) {
		this.shh_man = shh_man;
	}
	public String getShh_tel() {
		return shh_tel;
	}
	public void setShh_tel(String shh_tel) {
		this.shh_tel = shh_tel;
	}
	public String getChkzhd_man() {
		return chkzhd_man;
	}
	public void setChkzhd_man(String chkzhd_man) {
		this.chkzhd_man = chkzhd_man;
	}
	public String getChk_bm() {
		return chk_bm;
	}
	public void setChk_bm(String chk_bm) {
		this.chk_bm = chk_bm;
	}
	public String getChkorccpxh() {
		return chkorccpxh;
	}
	public void setChkorccpxh(String chkorccpxh) {
		this.chkorccpxh = chkorccpxh;
	}
	public String getRec_name() {
		return rec_name;
	}
	public void setRec_name(String rec_name) {
		this.rec_name = rec_name;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public String getChkdd_bill() {
		return chkdd_bill;
	}
	public void setChkdd_bill(String chkdd_bill) {
		this.chkdd_bill = chkdd_bill;
	}
	public chrkgl_chhdVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public chrkgl_chhdVO(String chk_id, String chk_bill, String chkkf_id,
			String chk_date, String chkkh_id, String shhdw_id, String chk_way,
			String sh_way, String sh_date, String shh_man, String shh_tel,
			String chkzhd_man, String chk_bm, String chkorccpxh,
			String rec_name, String cus_name, String chkdd_bill) {
		super();
		this.chk_id = chk_id;
		this.chk_bill = chk_bill;
		this.chkkf_id = chkkf_id;
		this.chk_date = chk_date;
		this.chkkh_id = chkkh_id;
		this.shhdw_id = shhdw_id;
		this.chk_way = chk_way;
		this.sh_way = sh_way;
		this.sh_date = sh_date;
		this.shh_man = shh_man;
		this.shh_tel = shh_tel;
		this.chkzhd_man = chkzhd_man;
		this.chk_bm = chk_bm;
		this.chkorccpxh = chkorccpxh;
		this.rec_name = rec_name;
		this.cus_name = cus_name;
		this.chkdd_bill = chkdd_bill;
	}
	
	
}
