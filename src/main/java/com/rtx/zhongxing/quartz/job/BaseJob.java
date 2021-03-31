package com.rtx.zhongxing.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


/**
 * base job
 * @project  rtx_xstep_api
 * @author   wujunming
 * @data     2018年3月28日上午10:59:15
 */
public interface BaseJob extends Job {
	
	 public void execute(JobExecutionContext context) throws JobExecutionException;
}
