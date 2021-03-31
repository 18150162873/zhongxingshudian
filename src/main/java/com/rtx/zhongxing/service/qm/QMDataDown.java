package com.rtx.zhongxing.service.qm;

import com.rtx.zhongxing.bean.qm.RtxQMResponse;
/**
 * 奇门数据下发
 * @author ltt
 *
 */
public interface QMDataDown {

	RtxQMResponse handelApiToWms(String datasourcekey,String body);
}
