package com.rtx.zhongxing.job;

import java.util.List;

import javax.annotation.Resource;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.rtx.zhongxing.annotation.JobNameAnnotation;
import com.rtx.zhongxing.annotation.QuartzJobLoadConfig;
import com.rtx.zhongxing.annotation.TriggerNameAnnotation;
import com.rtx.zhongxing.mybatis.entity.receipt.MidReceiptEntity;
import com.rtx.zhongxing.mybatis.entity.receipt.ReceiptEntity;
import com.rtx.zhongxing.quartz.job.BaseJob;
import com.rtx.zhongxing.service.wms.CommonService;
import com.rtx.zhongxing.service.wms.ReceiptService;

@Component
@QuartzJobLoadConfig(cron = "0/30 * * * * ?")
@SuppressWarnings("all")
@JobNameAnnotation("入库单中间表写入到WMS")
@TriggerNameAnnotation("midReceiptToWMSJobTrigger")
@DisallowConcurrentExecution
public class ApiReceiptToWMSJob implements BaseJob{
	
	private final Logger log = LoggerFactory.getLogger(ApiReceiptToWMSJob.class);
	
	@Resource(name = "receiptService")
	ReceiptService receiptService;

	// 配置的仓库数据源集
	@Value("${rtx.datasource.name}")
	private String[] wmwhseList;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
			List<MidReceiptEntity> receiptList = receiptService.queryMidReceipt("middle");

			for(MidReceiptEntity midReceipt:receiptList) {
				String msg = "OK";
				try {
					//中间表数据转换成入库单
					ReceiptEntity wmsReceipt = receiptService.midMapp(midReceipt);

					receiptService.addToWMS(midReceipt.getWhseid(), wmsReceipt);
				} catch (Exception e) {
					msg = e.getMessage();
					log.error(midReceipt.getExternreceiptkey()+"写入到wms异常:",e);
				}
				//更新中间表状态
				receiptService.updMidReceiptStatus(midReceipt.getWhseid(), midReceipt, msg);
			}

		} catch (Exception e) {
			log.error("入库单写入到wms定时任务异常",e);
		}
	}

}
