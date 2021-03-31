package com.rtx.zhongxing.bean.qm.stockout;
public class RelatedOrder {
	private String orderType;//关联的订单类型，CG=采购单，DB=调拨单, CK=出库单，RK=入库 单，VIPDG = 唯品会 JIT 业务送仓单，string (50) , (只传英文编码)
	private String orderCode;//关联的订单编号，string(50)
	public String getorderType() {
		return orderType;
	}
	public void setorderType(String orderType) {
		this.orderType = orderType;
	}
	public String getorderCode() {
		return orderCode;
	}
	public void setorderCode(String orderCode) {
		this.orderCode = orderCode;
	}

}