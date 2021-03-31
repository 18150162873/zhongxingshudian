package com.rtx.zhongxing.quartz.entiry;

import java.math.BigInteger;


/**
 * 定时任务bean
 * @project  rtx_xstep_api
 * @author   wujunming
 * @data     2018年3月28日上午10:45:14
 */
public class JobAndTrigger {

	private String job_name;
	private String job_group;
	private String job_class_name;
	private String trigger_name;
	private String trigger_group;
	private BigInteger repeat_interval;
	private BigInteger times_triggered;
	private String cron_expression;
	private String trigger_state;
	private String time_zone_id;



	public String getJob_name() {
		return job_name;
	}

	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}

	public String getJob_group() {
		return job_group;
	}

	public void setJob_group(String job_group) {
		this.job_group = job_group;
	}

	public String getJob_class_name() {
		return job_class_name;
	}

	public void setJob_class_name(String job_class_name) {
		this.job_class_name = job_class_name;
	}

	public String getTrigger_name() {
		return trigger_name;
	}

	public void setTrigger_name(String trigger_name) {
		this.trigger_name = trigger_name;
	}

	public String getTrigger_group() {
		return trigger_group;
	}

	public void setTrigger_group(String trigger_group) {
		this.trigger_group = trigger_group;
	}

	public BigInteger getRepeat_interval() {
		return repeat_interval;
	}

	public void setRepeat_interval(BigInteger repeat_interval) {
		this.repeat_interval = repeat_interval;
	}

	public BigInteger getTimes_triggered() {
		return times_triggered;
	}

	public void setTimes_triggered(BigInteger times_triggered) {
		this.times_triggered = times_triggered;
	}

	public String getCron_expression() {
		return cron_expression;
	}

	public void setCron_expression(String cron_expression) {
		this.cron_expression = cron_expression;
	}

	public String getTime_zone_id() {
		return time_zone_id;
	}

	public void setTime_zone_id(String time_zone_id) {
		this.time_zone_id = time_zone_id;
	}

	public String getTrigger_state() {
		return trigger_state;
	}

	public void setTrigger_state(String trigger_state) {
		this.trigger_state = trigger_state;
	}


}
