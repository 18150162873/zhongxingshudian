package com.rtx.zhongxing.quartz.services;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.rtx.zhongxing.quartz.entiry.JobAndTrigger;


/**
 * 定时任务配置service接口
 * @project  rtx_xstep_api
 * @author   wujunming
 * @data     2018年3月28日上午10:52:44
 */
@Service("iJobAndTriggerService")
public interface IJobAndTriggerService {

	/**
	 * 分页查询所有定时任务
	 * @param pageNum  当前页
	 * @param pageSize 页大小
	 * @return 定时任务列表
	 * @throws Exception
	 */
	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(String datasource,Integer pageNum, Integer pageSize) throws Exception;

}
