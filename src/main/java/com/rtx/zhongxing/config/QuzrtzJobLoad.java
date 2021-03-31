package com.rtx.zhongxing.config;

import java.util.Arrays;
import java.util.List;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.TriggerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.rtx.zhongxing.annotation.QuartzJobLoadConfig;
import com.rtx.zhongxing.quartz.job.BaseJob;

/**
 * 启动时加载quartz定时任务
 * @author ltt
 *
 */
@SuppressWarnings("all")
@Component
public class QuzrtzJobLoad implements CommandLineRunner{
	
	Logger log = LoggerFactory.getLogger(QuzrtzJobLoad.class); 

	@Autowired
	private Scheduler sched;
	
	@Autowired
    private ApplicationContext appContext;
	
	@Override
	public void run(String... args) throws Exception {
		String groupName ="QM";
		String[] beanName = appContext.getBeanNamesForAnnotation(QuartzJobLoadConfig.class);
		
		for(String name:beanName) {
			try {
				if(!load(name.toUpperCase())) {
					continue;
				}
				
				BaseJob job = (BaseJob) appContext.getBean(name);
				QuartzJobLoadConfig config = job.getClass().getAnnotation(QuartzJobLoadConfig.class);
				String identity = name+"Task";
				String cron = config.cron();
				String triggerName = name+"Trigger";
				
				boolean exists = sched.checkExists(new JobKey(identity, groupName));
				if(exists) {
					continue;
				}
				
				JobDetail jobDetail = JobBuilder
						.newJob(job.getClass())
						.withIdentity(identity, groupName)
						.build();

				CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cron);

				CronTrigger trigger = TriggerBuilder
						.newTrigger()
						.withIdentity(triggerName, groupName)
						.withSchedule(scheduleBuilder)
						.build();
				sched.scheduleJob(jobDetail,trigger);
			} catch (Exception e) {
				log.error("加载quartz job 异常",e);
			}
			
		}
	}

	private boolean load(String name) {
		//,SKUDetailDownJobl,SKUDetailDownJob,TradeorderFinishUploadJob,ArrivalorderDetailDownJob,ArrivalorderListDownJob,
		//SKUDetailDownJob,SKUListDownJob,SKUToWmsJob
		//RtxOrderToWmsJob
		//TradeorderDownJob,RtxOrderToWmsJob,RtxOrderFinishJob,TradeorderFinishUploadJob,
		//TradeorderDownJob,ExpressJob
		//ExpressJob,TradeorderDownJob,RtxOrderToWmsJob,RtxOrderFinishJob,TradeorderFinishUploadJob
		List<String> load = Arrays.asList("ArrivalorderFinishUploadJob".toUpperCase().split(","));
		if(load.contains(name)) {
			return true;
		}else {
			return false;
		}
	}
}
