package com.rtx.zhongxing.bean.express.jd;

import com.jd.open.api.sdk.domain.wujiemiandan.SignSuccessQueryApi.response.get.WaybillAddress;

public class JDWaybillRequest {

	private String waybillType;//	运单类型：1普通运单	是
	private String waybillCount;//	所需运单的数量，顺丰只能传1，非顺丰快递公司最多只能传99	是
	private String providerId;//	承运商id (providerId与providerCode两者必填一个)	条件
	private String providerCode;//	承运商编码(providerID与providerCode两者必填一个)	条件
	private String branchCode;//	承运商发货网点编码  ，加盟型快递公司必传	条件
	private String settlementCode;//	财务结算编码，直营型快递公司必传	条件
	private String salePlatform;//	销售平台	是
	private String platformOrderNo;//	平台订单号，即pop订单号，如果多订单合并发货，每个订单号之间用“,”逗号分隔，每个订单号最多32位	是
	private String vendorCode;//	商家编码，是用POP商家ID	是
	private String vendorName;//	商家名称	是
	private String vendorOrderCode;//	商家自有订单号	是
	private WaybillAddress fromAddress;//	京标发货四级地址	是
	private WaybillAddress toAddress;//	京标收货四级地址	是
	private String weight;//	重量，单位为千克 两位小数	是
	private String volume;//	体积，单位为统一为立方厘米 两位小数	是
	private String goodsName;//	商品名称	否
	private String promiseTimeType;//	承诺时效类型	是
	private String promiseCompleteTime;//	承诺完成时间，若未承诺时效，则不考虑此字段	否
	private String promiseOutStockTime;//	计划出库时间	否
	private String payType;//	付款方式0-在线支付  目前暂时不支持货到付款业务	是
	private String goodsMoney;//	商品金额  两位小数	是
	private String shouldPayMoney;//	代收金额  两位小数  付款方式为在线支付时，代收金额必须为0	是
	private String needGuarantee;//	是否要保价（系统暂不开放报价业务）	是
	private String guaranteeMoney;//	保价金额  两位小数  needGuarantee为false时，保价金额必须为0	是
	private String receiveTimeType;//	收货时间类型，0任何时间，1工作日2节假日	是
	private String warehouseCode;//	发货仓编码	否
	private String secondSectionCode;//	二段码	否
	private String thirdSectionCode;//	三段码	否
	private String remark;//	备注	否
	private String expressPayMethod;//	快递费付款方式(顺丰必填)	否
	private String expressType;//	快件产品类别(顺丰必填)	否
	private String extendField1;//	扩展字段1	否
	private String extendField2;//	扩展字段2	否
	private String extendField3;//	扩展字段3	否
	private String extendField4;//	扩展字段4	否
	private String extendField5;//	扩展字段5	否
	
	public String getWaybillType() {
		return waybillType;
	}
	public void setWaybillType(String waybillType) {
		this.waybillType = waybillType;
	}
	public String getWaybillCount() {
		return waybillCount;
	}
	public void setWaybillCount(String waybillCount) {
		this.waybillCount = waybillCount;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getProviderCode() {
		return providerCode;
	}
	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getSettlementCode() {
		return settlementCode;
	}
	public void setSettlementCode(String settlementCode) {
		this.settlementCode = settlementCode;
	}
	public String getSalePlatform() {
		return salePlatform;
	}
	public void setSalePlatform(String salePlatform) {
		this.salePlatform = salePlatform;
	}
	public String getPlatformOrderNo() {
		return platformOrderNo;
	}
	public void setPlatformOrderNo(String platformOrderNo) {
		this.platformOrderNo = platformOrderNo;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorOrderCode() {
		return vendorOrderCode;
	}
	public void setVendorOrderCode(String vendorOrderCode) {
		this.vendorOrderCode = vendorOrderCode;
	}
	public WaybillAddress getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(WaybillAddress fromAddress) {
		this.fromAddress = fromAddress;
	}
	public WaybillAddress getToAddress() {
		return toAddress;
	}
	public void setToAddress(WaybillAddress toAddress) {
		this.toAddress = toAddress;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getPromiseTimeType() {
		return promiseTimeType;
	}
	public void setPromiseTimeType(String promiseTimeType) {
		this.promiseTimeType = promiseTimeType;
	}
	public String getPromiseCompleteTime() {
		return promiseCompleteTime;
	}
	public void setPromiseCompleteTime(String promiseCompleteTime) {
		this.promiseCompleteTime = promiseCompleteTime;
	}
	public String getPromiseOutStockTime() {
		return promiseOutStockTime;
	}
	public void setPromiseOutStockTime(String promiseOutStockTime) {
		this.promiseOutStockTime = promiseOutStockTime;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getGoodsMoney() {
		return goodsMoney;
	}
	public void setGoodsMoney(String goodsMoney) {
		this.goodsMoney = goodsMoney;
	}
	public String getShouldPayMoney() {
		return shouldPayMoney;
	}
	public void setShouldPayMoney(String shouldPayMoney) {
		this.shouldPayMoney = shouldPayMoney;
	}
	public String getNeedGuarantee() {
		return needGuarantee;
	}
	public void setNeedGuarantee(String needGuarantee) {
		this.needGuarantee = needGuarantee;
	}
	public String getGuaranteeMoney() {
		return guaranteeMoney;
	}
	public void setGuaranteeMoney(String guaranteeMoney) {
		this.guaranteeMoney = guaranteeMoney;
	}
	public String getReceiveTimeType() {
		return receiveTimeType;
	}
	public void setReceiveTimeType(String receiveTimeType) {
		this.receiveTimeType = receiveTimeType;
	}
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getSecondSectionCode() {
		return secondSectionCode;
	}
	public void setSecondSectionCode(String secondSectionCode) {
		this.secondSectionCode = secondSectionCode;
	}
	public String getThirdSectionCode() {
		return thirdSectionCode;
	}
	public void setThirdSectionCode(String thirdSectionCode) {
		this.thirdSectionCode = thirdSectionCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getExpressPayMethod() {
		return expressPayMethod;
	}
	public void setExpressPayMethod(String expressPayMethod) {
		this.expressPayMethod = expressPayMethod;
	}
	public String getExpressType() {
		return expressType;
	}
	public void setExpressType(String expressType) {
		this.expressType = expressType;
	}
	public String getExtendField1() {
		return extendField1;
	}
	public void setExtendField1(String extendField1) {
		this.extendField1 = extendField1;
	}
	public String getExtendField2() {
		return extendField2;
	}
	public void setExtendField2(String extendField2) {
		this.extendField2 = extendField2;
	}
	public String getExtendField3() {
		return extendField3;
	}
	public void setExtendField3(String extendField3) {
		this.extendField3 = extendField3;
	}
	public String getExtendField4() {
		return extendField4;
	}
	public void setExtendField4(String extendField4) {
		this.extendField4 = extendField4;
	}
	public String getExtendField5() {
		return extendField5;
	}
	public void setExtendField5(String extendField5) {
		this.extendField5 = extendField5;
	}
}
