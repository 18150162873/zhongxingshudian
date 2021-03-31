package com.rtx.zhongxing.quartz.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rtx.zhongxing.annotation.DataSourceAnnotation;
import com.rtx.zhongxing.quartz.entiry.JobAndTrigger;
import com.rtx.zhongxing.quartz.mapper.JobMapper;
import com.rtx.zhongxing.quartz.services.IJobAndTriggerService;

/**
 * 定时任务service实现类
 * @project  rtx_xstep_api
 * @author   wujunming
 * @data     2018年3月28日上午10:54:10
 */
@Transactional
@Service("iJobAndTriggerService")
public class IJobAndTriggerServiceImpl implements IJobAndTriggerService{
	
	
	@Autowired
	private JobMapper jobMapper;

	
	@DataSourceAnnotation
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@Transactional(rollbackFor=Exception.class) 
	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(String datasource,Integer pageNum, Integer pageSize) throws Exception {
        if(pageNum!= null && pageSize!= null){  
            PageHelper.startPage(pageNum, pageSize);  
        } 
        List<JobAndTrigger> job = jobMapper.findAll(); 
        for (JobAndTrigger jobAndTrigger : job) {
			System.out.println(jobAndTrigger.getJob_name());
		}
        return new PageInfo(job);  
	}

}
