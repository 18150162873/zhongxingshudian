package com.rtx.zhongxing.bean.qm.entryorder;
import javax.xml.bind.annotation.XmlRootElement;

import com.rtx.zhongxing.bean.qm.entryorder.EntryOrder;
import com.rtx.zhongxing.bean.qm.entryorder.OrderLines;

@XmlRootElement(name="request")
public class EntryOrderDTO {
	private EntryOrder entryOrder;
	private OrderLines orderLines;
	public EntryOrder getEntryOrder() {
		return entryOrder;
	}
	public void setEntryOrder(EntryOrder entryOrder) {
		this.entryOrder = entryOrder;
	}
	public OrderLines getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(OrderLines orderLines) {
		this.orderLines = orderLines;
	}

}