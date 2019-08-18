package com.ydsn.tms.po;
/**
 * 基础信息模块-货位档案
 * 
 *@author  孙军
 *2015年6月11日 下午4:49:38
 */
public class jcxx_CargoSpace {
    private String sto_id;
	private String car_id;
	private String car_bill;
	private String car_desc;
	private String car_remark;
	public String getSto_id() {
		return sto_id;
	}
	public void setSto_id(String sto_id) {
		this.sto_id = sto_id;
	}
	public String getCar_id() {
		return car_id;
	}
	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}
	public String getCar_bill() {
		return car_bill;
	}
	public void setCar_bill(String car_bill) {
		this.car_bill = car_bill;
	}
	public String getCar_desc() {
		return car_desc;
	}
	public void setCar_desc(String car_desc) {
		this.car_desc = car_desc;
	}
	public String getCar_remark() {
		return car_remark;
	}
	public void setCar_remark(String car_remark) {
		this.car_remark = car_remark;
	}
	public jcxx_CargoSpace() {
		super();
		// TODO Auto-generated constructor stub
	}
	public jcxx_CargoSpace(String sto_id, String car_id, String car_bill,
			String car_desc, String car_remark) {
		super();
		this.sto_id = sto_id;
		this.car_id = car_id;
		this.car_bill = car_bill;
		this.car_desc = car_desc;
		this.car_remark = car_remark;
	}
	
}
