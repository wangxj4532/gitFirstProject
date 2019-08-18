package com.ydsn.tms.po;
/**
 *仓库基础类 
 *@author  孙军
 *2015年6月1日 下午12:29:37
 */
public class Storeroom {

	private Integer sto_id;
	private String sto_bill;
	private String sto_name;
	private String sto_phone;
	private String sto_addr;
	private String sto_man;
	public Integer getSto_id() {
		return sto_id;
	}
	public void setSto_id(Integer sto_id) {
		this.sto_id = sto_id;
	}
	public String getSto_bill() {
		return sto_bill;
	}
	public void setSto_bill(String sto_bill) {
		this.sto_bill = sto_bill;
	}
	public String getSto_name() {
		return sto_name;
	}
	public void setSto_name(String sto_name) {
		this.sto_name = sto_name;
	}
	public String getSto_phone() {
		return sto_phone;
	}
	public void setSto_phone(String sto_phone) {
		this.sto_phone = sto_phone;
	}
	public String getSto_addr() {
		return sto_addr;
	}
	public void setSto_addr(String sto_addr) {
		this.sto_addr = sto_addr;
	}
	public String getSto_man() {
		return sto_man;
	}
	public void setSto_man(String sto_man) {
		this.sto_man = sto_man;
	}
	public Storeroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Storeroom(Integer sto_id, String sto_bill, String sto_name,
			String sto_phone, String sto_addr, String sto_man) {
		super();
		this.sto_id = sto_id;
		this.sto_bill = sto_bill;
		this.sto_name = sto_name;
		this.sto_phone = sto_phone;
		this.sto_addr = sto_addr;
		this.sto_man = sto_man;
	}

	
}

