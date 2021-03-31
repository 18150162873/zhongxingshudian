package com.rtx.zhongxing.bean.qm.batchdeliveryorder;
import com.rtx.zhongxing.bean.qm.batchdeliveryorder.DeliveryOrder;
import com.rtx.zhongxing.bean.qm.batchdeliveryorder.OrderLines;
public class Order {
	private DeliveryOrder deliveryOrder;
	private OrderLines orderLines;
	public DeliveryOrder getDeliveryOrder() {
		return deliveryOrder;
	}
	public void setDeliveryOrder(DeliveryOrder deliveryOrder) {
		this.deliveryOrder = deliveryOrder;
	}
	public OrderLines getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(OrderLines orderLines) {
		this.orderLines = orderLines;
	}

}