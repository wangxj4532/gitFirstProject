package com.ydsn.tms.po;

public class jcxx_ReceiveFile {
    private String rec_id;
	private String rec_bill;
	private String rec_name;
	private String rec_man;
	private String rec_phone;
	private String rec_addr;
	private String rec_time;
	public String getRec_id() {
		return rec_id;
	}
	public void setRec_id(String rec_id) {
		this.rec_id = rec_id;
	}
	public String getRec_bill() {
		return rec_bill;
	}
	public void setRec_bill(String rec_bill) {
		this.rec_bill = rec_bill;
	}
	public String getRec_name() {
		return rec_name;
	}
	public void setRec_name(String rec_name) {
		this.rec_name = rec_name;
	}
	public String getRec_man() {
		return rec_man;
	}
	public void setRec_man(String rec_man) {
		this.rec_man = rec_man;
	}
	public String getRec_phone() {
		return rec_phone;
	}
	public void setRec_phone(String rec_phone) {
		this.rec_phone = rec_phone;
	}
	public String getRec_addr() {
		return rec_addr;
	}
	public void setRec_addr(String rec_addr) {
		this.rec_addr = rec_addr;
	}
	public String getRec_time() {
		return rec_time;
	}
	public void setRec_time(String rec_time) {
		this.rec_time = rec_time;
	}
	public jcxx_ReceiveFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public jcxx_ReceiveFile(String rec_id, String rec_bill, String rec_name,
			String rec_man, String rec_phone, String rec_addr, String rec_time) {
		super();
		this.rec_id = rec_id;
		this.rec_bill = rec_bill;
		this.rec_name = rec_name;
		this.rec_man = rec_man;
		this.rec_phone = rec_phone;
		this.rec_addr = rec_addr;
		this.rec_time = rec_time;
	}
	
}
