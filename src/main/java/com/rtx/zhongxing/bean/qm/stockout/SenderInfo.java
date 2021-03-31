package com.rtx.zhongxing.bean.qm.stockout;
public class SenderInfo {
	private String company;//公司名称, string (200)
	private String name;//姓名, string (50) ,
	private String zipCode;//邮编, string (50)
	private String tel;//固定电话, string (50)
	private String mobile;//移动电话, string (50) ,
	private String email;//电子邮箱, string (50)
	private String countryCode;//国家二字码，string（50）
	private String province;//省份, string (50) ,
	private String city;//城市, string (50) ,
	private String area;//区域, string (50)
	private String town;//村镇, string (50)
	private String detailAddress;//详细地址, string (200)
	private String id;//证件号，string(50)
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
	public String getzipCode() {
		return zipCode;
	}
	public void setzipCode(String zipCode) {
		this.zipCode = zipCode;
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
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getcountryCode() {
		return countryCode;
	}
	public void setcountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getprovince() {
		return province;
	}
	public void setprovince(String province) {
		this.province = province;
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public String getarea() {
		return area;
	}
	public void setarea(String area) {
		this.area = area;
	}
	public String gettown() {
		return town;
	}
	public void settown(String town) {
		this.town = town;
	}
	public String getdetailAddress() {
		return detailAddress;
	}
	public void setdetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}

}