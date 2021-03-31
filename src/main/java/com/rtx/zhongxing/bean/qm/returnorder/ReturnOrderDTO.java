package com.rtx.zhongxing.bean.qm.returnorder;
import com.rtx.zhongxing.bean.qm.returnorder.ReturnOrder;
import com.rtx.zhongxing.bean.qm.returnorder.OrderLines;

public class ReturnOrderDTO {
	private ReturnOrder returnOrder;
	private OrderLines orderLines;
	public ReturnOrder getReturnOrder() {
		return returnOrder;
	}
	public void setReturnOrder(ReturnOrder returnOrder) {
		this.returnOrder = returnOrder;
	}
	public OrderLines getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(OrderLines orderLines) {
		this.orderLines = orderLines;
	}

}