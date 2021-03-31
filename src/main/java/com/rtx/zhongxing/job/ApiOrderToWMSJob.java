package com.rtx.zhongxing.job;

import java.util.List;

import javax.annotation.Resource;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.rtx.zhongxing.annotation.JobNameAnnotation;
import com.rtx.zhongxing.annotation.QuartzJobLoadConfig;
import com.rtx.zhongxing.annotation.TriggerNameAnnotation;
import com.rtx.zhongxing.mybatis.entity.orders.MidOrderEntity;
import com.rtx.zhongxing.mybatis.entity.orders.OrderEntity;
import com.rtx.zhongxing.quartz.job.BaseJob;
import com.rtx.zhongxing.service.wms.OrderService;

@Component
@QuartzJobLoadConfig(cron = "0/30 * * * * ?")
@SuppressWarnings("all")
@JobNameAnnotation("出库单中间表写入到WMS")
@TriggerNameAnnotation("midOrderToWMSJobTrigger")
@DisallowConcurrentExecution
public class ApiOrderToWMSJob implements BaseJob{
	
	private final Logger log = LoggerFactory.getLogger(ApiOrderToWMSJob.class);
	
	@Resource(name = "OrderService")
	OrderService OrderService;

	// 配置的仓库数据源集
	@Value("${rtx.datasource.name}")
	private String[] wmwhseList;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
			List<MidOrderEntity> OrderList = OrderService.queryMidOrder("middle");

			for(MidOrderEntity midOrder:OrderList) {
				String msg = "OK";
				try {
					//中间表数据转换成入库单
					OrderEntity wmsOrder = OrderService.midMapp(midOrder);

					OrderService.addToWMS(midOrder.getWhseid(), wmsOrder);
				} catch (Exception e) {
					msg = e.getMessage();
					log.error(midOrder.getExternorderkey()+"写入到wms异常:",e);
				}
				//更新中间表状态
				OrderService.updOrderStatus(midOrder.getWhseid(), midOrder, msg);
			}

		} catch (Exception e) {
			log.error("出库单写入到wms定时任务异常",e);
		}
	}

}
