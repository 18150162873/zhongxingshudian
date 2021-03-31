package com.rtx.zhongxing.bean.qm.stockout;
public class PickerInfo {
	private String company;//公司名称, string (200)
	private String name;//姓名, string (50)
	private String tel;//固定电话, string (50)
	private String mobile;//移动电话, string (50)
	private String id;//证件号，string(50)
	private String carNo;//车牌号，string(50)
	public String getcompany() {
		return company;
	}
	public void setcompany(String company) {
		this.company = company;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String gettel() {
		return tel;
	}
	public void settel(String tel) {
		this.tel = tel;
	}
	public String getmobile() {
		return mobile;
	}
	public void setmobile(String mobile) {
		this.mobile = mobile;
	}
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String getcarNo() {
		return carNo;
	}
	public void setcarNo(String carNo) {
		this.carNo = carNo;
	}

}