package com.rtx.zhongxing.bean.qm.batchdeliveryorder;
import javax.xml.bind.annotation.XmlRootElement;

import com.rtx.zhongxing.bean.qm.batchdeliveryorder.Orders;

@XmlRootElement(name="request")
public class DeliveryOrderBatchDTO {
	private Orders orders;
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}

}