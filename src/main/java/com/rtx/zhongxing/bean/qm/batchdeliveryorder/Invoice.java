package com.rtx.zhongxing.bean.qm.batchdeliveryorder;
import com.rtx.zhongxing.bean.qm.batchdeliveryorder.Detail;
public class Invoice {
	private String type;//发票类型, string (50) , INVOICE=普通发票，VINVOICE=增值税普通发票, EVINVOICE=电子增票, 条件必填 (条件为 invoiceFlag 为 Y)
	private String header;//发票抬头, string (200) , (条件为 invoiceFlag 为 Y)
	private String taxNumber;//税号,string(50)
	private String amount;//发票总金额, double (18, 2) , (条件为 invoiceFlag 为 Y)
	private String content;//发票内容,string(500) ，不推荐使用
	private Detail detail;
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public String getheader() {
		return header;
	}
	public void setheader(String header) {
		this.header = header;
	}
	public String gettaxNumber() {
		return taxNumber;
	}
	public void settaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	public String getamount() {
		return amount;
	}
	public void setamount(String amount) {
		this.amount = amount;
	}
	public String getcontent() {
		return content;
	}
	public void setcontent(String content) {
		this.content = content;
	}
	public Detail getDetail() {
		return detail;
	}
	public void setDetail(Detail detail) {
		this.detail = detail;
	}

}