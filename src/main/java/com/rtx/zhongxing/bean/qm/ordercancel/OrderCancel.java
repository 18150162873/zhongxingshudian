package com.rtx.zhongxing.bean.qm.ordercancel;
public class OrderCancel {
	private String warehouseCode;//仓库编码, string (50)，必填 ，统仓统配等无需 ERP 指定仓储编码 的情况填 OTHER
	private String ownerCode;//货主编码, string (50)
	private String orderCode;//单据编码, string (50) ，必填
	private String orderId;//仓储系统单据编码, string (50) ，条件必填
	private String orderType;//单据类型, JYCK= 一般交易出库单，HHCK= 换货出库 ，BFCK= 补发出 库 PTCK=普通出库单，DBCK=调拨出库 ，B2BRK=B2B 入库，B2BCK=B2B 出库， QTCK=其他出库， SCRK=生产入库，LYRK=领用入库，CCRK=残次品入库，CGRK=采 购入库 ，DBRK= 调拨入库 ，QTRK= 其他入库 ，XTRK= 销退入库，THRK=退货入库， HHRK= 换货入库 ，CNJG= 仓内加工单 ，CGTH=采购退货出库单
	private String cancelReason;//取消原因, string (500)
	public String getwarehouseCode() {
		return warehouseCode;
	}
	public void setwarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getownerCode() {
		return ownerCode;
	}
	public void setownerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	public String getorderCode() {
		return orderCode;
	}
	public void setorderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getorderId() {
		return orderId;
	}
	public void setorderId(String orderId) {
		this.orderId = orderId;
	}
	public String getorderType() {
		return orderType;
	}
	public void setorderType(String orderType) {
		this.orderType = orderType;
	}
	public String getcancelReason() {
		return cancelReason;
	}
	public void setcancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

}