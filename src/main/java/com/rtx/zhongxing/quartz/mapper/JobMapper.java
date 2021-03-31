package com.rtx.zhongxing.quartz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.rtx.zhongxing.quartz.entiry.JobAndTrigger;




/**
 * 定时任务dao
 * @project  rtx_xstep_api
 * @author   wujunming
 * @data     2018年3月28日上午10:55:13
 */
@Mapper
public interface JobMapper {

	
	/**
	 * 查询所有定时任务信息
	 * @return
	 * @throws Exception
	 */
	@Select("SELECT qrtz_job_details.JOB_NAME,qrtz_job_details.JOB_GROUP,qrtz_job_details.JOB_CLASS_NAME,qrtz_triggers.TRIGGER_NAME,qrtz_triggers.TRIGGER_GROUP,qrtz_cron_triggers.CRON_EXPRESSION,qrtz_cron_triggers.TIME_ZONE_ID,qrtz_triggers.trigger_state FROM qrtz_job_details JOIN qrtz_triggers ON qrtz_job_details.JOB_NAME = qrtz_triggers.JOB_NAME  JOIN qrtz_cron_triggers ON qrtz_triggers.TRIGGER_NAME = qrtz_cron_triggers.TRIGGER_NAME AND qrtz_triggers.TRIGGER_GROUP = qrtz_cron_triggers.TRIGGER_GROUP")
	@Results({ @Result(property = "job_name", column = "job_name"),
			@Result(property = "job_group", column = "job_group"),
			@Result(property = "job_class_name", column = "job_class_name"),
			@Result(property = "trigger_name", column = "trigger_name"),
			@Result(property = "trigger_group", column = "trigger_group"),
			@Result(property = "cron_expression", column = "cron_expression"),
			@Result(property = "time_zone_id", column = "time_zone_id") ,
			@Result(property = "trigger_state", column = "trigger_state") })
	public List<JobAndTrigger> findAll() throws Exception;

}
