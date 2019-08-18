package com.ydsn.tms.vo;
/**
 * 基础信息模块-货位和库房的VO
 * 
 *@author  孙军
 *2015年6月11日 下午5:03:31
 */
public class jcxx_CarStore {
	
	private String sto_id;
	private String car_id;
	private String car_bill;
	private String car_desc;
	private String car_remark;
	private String sto_name;
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
	public String getSto_name() {
		return sto_name;
	}
	public void setSto_name(String sto_name) {
		this.sto_name = sto_name;
	}
	public jcxx_CarStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public jcxx_CarStore(String sto_id, String car_id, String car_bill,
			String car_desc, String car_remark, String sto_name) {
		super();
		this.sto_id = sto_id;
		this.car_id = car_id;
		this.car_bill = car_bill;
		this.car_desc = car_desc;
		this.car_remark = car_remark;
		this.sto_name = sto_name;
	}
	
	
}
