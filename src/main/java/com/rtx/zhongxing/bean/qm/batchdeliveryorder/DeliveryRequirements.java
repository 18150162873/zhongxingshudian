package com.rtx.zhongxing.bean.qm.batchdeliveryorder;
public class DeliveryRequirements {
	private String scheduleType;//投递时延要求,int, 1=工作日,2=节假日,101=当日达,102=次晨 达,103=次日达, 104=预约达
	private String scheduleDay;//要求送达日期, string (10) , YYYY-MM-DD
	private String scheduleStartTime;//投递时间范围要求 (开始时间) , string (8) , HH:MM:SS
	private String scheduleEndTime;//投递时间范围要求 (结束时间) , string (8) , HH:MM:SS
	private String deliveryType;//发货服务类型，PTPS（普通配送），LLPS（冷链配送），HBP(环保 配),string(50)
	public String getscheduleType() {
		return scheduleType;
	}
	public void setscheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}
	public String getscheduleDay() {
		return scheduleDay;
	}
	public void setscheduleDay(String scheduleDay) {
		this.scheduleDay = scheduleDay;
	}
	public String getscheduleStartTime() {
		return scheduleStartTime;
	}
	public void setscheduleStartTime(String scheduleStartTime) {
		this.scheduleStartTime = scheduleStartTime;
	}
	public String getscheduleEndTime() {
		return scheduleEndTime;
	}
	public void setscheduleEndTime(String scheduleEndTime) {
		this.scheduleEndTime = scheduleEndTime;
	}
	public String getdeliveryType() {
		return deliveryType;
	}
	public void setdeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

}