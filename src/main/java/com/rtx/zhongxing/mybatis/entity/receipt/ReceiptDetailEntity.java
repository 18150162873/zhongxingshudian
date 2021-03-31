package com.rtx.zhongxing.mybatis.entity.receipt;

import java.util.Date;

import com.rtx.zhongxing.annotation.mybatisHelp.RTXMybatisTableHelp;

@RTXMybatisTableHelp(tablename = "receiptdetail")
public class ReceiptDetailEntity {

	protected String receiptkey;
	protected String receiptlinenumber;
	protected String whseid;
	protected String sublinenumber;
	protected String externreceiptkey;
	protected String externlineno;
	protected String storerkey;
	protected String pokey;
	protected String tariffkey;
	protected String sku;
	protected String altsku;
	protected String id;
	protected String status;
	protected Date datereceived;
	protected double qtyexpected;
	protected double qtyadjusted;
	protected double qtyreceived;
	protected String uom;
	protected String packkey;
	protected String vesselkey;
	protected String voyagekey;
	protected String xdockkey;
	protected String containerkey;
	protected String toloc;
	protected String tolot;
	protected String toid;
	protected String conditioncode;
	protected String lottable01;
	protected String lottable02;
	protected String lottable03;
	protected Date lottable04;
	protected Date lottable05;
	protected String lottable06;
	protected String lottable07;
	protected String lottable08;
	protected String lottable09;
	protected String lottable10;
	protected double casecnt;
	protected double innerpack;
	protected double pallet;
	protected double cube;
	protected double grosswgt;
	protected double netwgt;
	protected double otherunit1;
	protected double otherunit2;
	protected double unitprice;
	protected double extendedprice;
	protected Date effectivedate;
	protected String forte_flag;
	protected String susr1;
	protected String susr2;
	protected String susr3;
	protected String susr4;
	protected String susr5;
	protected String notes;
	protected String reasoncode;
	protected String palletid;
	protected double qtyrejected;
	protected String type;
	protected String returntype;
	protected String returnreason;
	protected String dispositiontype;
	protected String dispositioncode;
	protected String returncondition;
	protected String qcrequired;
	protected double qcqtyinspected;
	protected double qcqtyrejected;
	protected String qcrejreason;
	protected String qcstatus;
	protected String qcuser;
	protected String qcautoadjust;
	protected String externallot;
	protected String rma;
	protected double packingslipqty;
	protected String ipskey;
	protected String suppliername;
	protected String supplierkey;
	protected String matchlottable;
	protected String receiptdetailid;
	protected String polinenumber;
	protected Date lottable11;
	protected Date lottable12;
	protected String sourcelocation;
	protected String sourceversion;
	protected String referencetype;
	protected String referencedocument;
	protected String referencelocation;
	protected String referenceversion;
	protected String referenceline;
	protected double cubicmeter;
	protected double hundredweight;
	protected double tarewgt;
	protected String referenceaccountingentity;
	protected String referencescheduleline;
	protected String requisitiondocument;
	protected String requisitionaccountingentity;
	protected String requisitionlocation;
	protected String requisitionversion;
	protected String requisitionline;
	protected String requisitionscheduleline;
	protected String purchaseorderdocument;
	protected String purchaseorderaccountingentity;
	protected String purchaseorderlocation;
	protected String purchaseorderversion;
	protected String purchaseorderline;
	protected String purchaseorderscheduleline;
	protected String salesorderdocument;
	protected String salesorderaccountingentity;
	protected String salesorderlocation;
	protected String salesorderversion;
	protected String salesorderline;
	protected String salesorderscheduleline;
	protected String productionorderdocument;
	protected String productionorderaccentity;
	protected String productionorderlocation;
	protected String productionorderversion;
	protected String productionorderline;
	protected String productionorderscheduleline;
	protected double temperature;
	protected String originallinenumber;
	protected String disposition;
	protected String qcsampledtype;
	protected double qtytoinspect;
	protected String checkforbackflushing;
	protected String quarantinelpn;
	protected String hostprocessrequired;
	protected String allowreopen;
	protected Date adddate;
	protected String addwho;
	protected Date editdate;
	protected String editwho;
	protected String putaway;
	protected String skip;
	protected String returnwho;
	protected Date returndate;
	protected String returnstatus;
	protected String default1;
	protected String default2;
	protected String default3;
	protected String default4;
	protected String default5;
	protected String default6;
	protected String default7;
	protected String default8;
	protected String default9;
	protected String default10;
	protected String default11;
	protected String default12;
	protected String default13;
	protected String default14;
	protected String default15;
	protected String default16;
	protected String default17;
	protected String default18;
	protected String default19;
	protected String default20;
	protected String default21;
	protected String default22;
	protected String default23;
	protected String default24;
	protected String default25;
	protected String default26;
	protected String default27;
	
	public String getReceiptkey() {
		return receiptkey;
	}
	public void setReceiptkey(String receiptkey) {
		this.receiptkey = receiptkey;
	}
	public String getReceiptlinenumber() {
		return receiptlinenumber;
	}
	public void setReceiptlinenumber(String receiptlinenumber) {
		this.receiptlinenumber = receiptlinenumber;
	}
	public String getWhseid() {
		return whseid;
	}
	public void setWhseid(String whseid) {
		this.whseid = whseid;
	}
	public String getSublinenumber() {
		return sublinenumber;
	}
	public void setSublinenumber(String sublinenumber) {
		this.sublinenumber = sublinenumber;
	}
	public String getExternreceiptkey() {
		return externreceiptkey;
	}
	public void setExternreceiptkey(String externreceiptkey) {
		this.externreceiptkey = externreceiptkey;
	}
	public String getExternlineno() {
		return externlineno;
	}
	public void setExternlineno(String externlineno) {
		this.externlineno = externlineno;
	}
	public String getStorerkey() {
		return storerkey;
	}
	public void setStorerkey(String storerkey) {
		this.storerkey = storerkey;
	}
	public String getPokey() {
		return pokey;
	}
	public void setPokey(String pokey) {
		this.pokey = pokey;
	}
	public String getTariffkey() {
		return tariffkey;
	}
	public void setTariffkey(String tariffkey) {
		this.tariffkey = tariffkey;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getAltsku() {
		return altsku;
	}
	public void setAltsku(String altsku) {
		this.altsku = altsku;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDatereceived() {
		return datereceived;
	}
	public void setDatereceived(Date datereceived) {
		this.datereceived = datereceived;
	}
	public double getQtyexpected() {
		return qtyexpected;
	}
	public void setQtyexpected(double qtyexpected) {
		this.qtyexpected = qtyexpected;
	}
	public double getQtyadjusted() {
		return qtyadjusted;
	}
	public void setQtyadjusted(double qtyadjusted) {
		this.qtyadjusted = qtyadjusted;
	}
	public double getQtyreceived() {
		return qtyreceived;
	}
	public void setQtyreceived(double qtyreceived) {
		this.qtyreceived = qtyreceived;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getPackkey() {
		return packkey;
	}
	public void setPackkey(String packkey) {
		this.packkey = packkey;
	}
	public String getVesselkey() {
		return vesselkey;
	}
	public void setVesselkey(String vesselkey) {
		this.vesselkey = vesselkey;
	}
	public String getVoyagekey() {
		return voyagekey;
	}
	public void setVoyagekey(String voyagekey) {
		this.voyagekey = voyagekey;
	}
	public String getXdockkey() {
		return xdockkey;
	}
	public void setXdockkey(String xdockkey) {
		this.xdockkey = xdockkey;
	}
	public String getContainerkey() {
		return containerkey;
	}
	public void setContainerkey(String containerkey) {
		this.containerkey = containerkey;
	}
	public String getToloc() {
		return toloc;
	}
	public void setToloc(String toloc) {
		this.toloc = toloc;
	}
	public String getTolot() {
		return tolot;
	}
	public void setTolot(String tolot) {
		this.tolot = tolot;
	}
	public String getToid() {
		return toid;
	}
	public void setToid(String toid) {
		this.toid = toid;
	}
	public String getConditioncode() {
		return conditioncode;
	}
	public void setConditioncode(String conditioncode) {
		this.conditioncode = conditioncode;
	}
	public String getLottable01() {
		return lottable01;
	}
	public void setLottable01(String lottable01) {
		this.lottable01 = lottable01;
	}
	public String getLottable02() {
		return lottable02;
	}
	public void setLottable02(String lottable02) {
		this.lottable02 = lottable02;
	}
	public String getLottable03() {
		return lottable03;
	}
	public void setLottable03(String lottable03) {
		this.lottable03 = lottable03;
	}
	public Date getLottable04() {
		return lottable04;
	}
	public void setLottable04(Date lottable04) {
		this.lottable04 = lottable04;
	}
	public Date getLottable05() {
		return lottable05;
	}
	public void setLottable05(Date lottable05) {
		this.lottable05 = lottable05;
	}
	public String getLottable06() {
		return lottable06;
	}
	public void setLottable06(String lottable06) {
		this.lottable06 = lottable06;
	}
	public String getLottable07() {
		return lottable07;
	}
	public void setLottable07(String lottable07) {
		this.lottable07 = lottable07;
	}
	public String getLottable08() {
		return lottable08;
	}
	public void setLottable08(String lottable08) {
		this.lottable08 = lottable08;
	}
	public String getLottable09() {
		return lottable09;
	}
	public void setLottable09(String lottable09) {
		this.lottable09 = lottable09;
	}
	public String getLottable10() {
		return lottable10;
	}
	public void setLottable10(String lottable10) {
		this.lottable10 = lottable10;
	}
	public double getCasecnt() {
		return casecnt;
	}
	public void setCasecnt(double casecnt) {
		this.casecnt = casecnt;
	}
	public double getInnerpack() {
		return innerpack;
	}
	public void setInnerpack(double innerpack) {
		this.innerpack = innerpack;
	}
	public double getPallet() {
		return pallet;
	}
	public void setPallet(double pallet) {
		this.pallet = pallet;
	}
	public double getCube() {
		return cube;
	}
	public void setCube(double cube) {
		this.cube = cube;
	}
	public double getGrosswgt() {
		return grosswgt;
	}
	public void setGrosswgt(double grosswgt) {
		this.grosswgt = grosswgt;
	}
	public double getNetwgt() {
		return netwgt;
	}
	public void setNetwgt(double netwgt) {
		this.netwgt = netwgt;
	}
	public double getOtherunit1() {
		return otherunit1;
	}
	public void setOtherunit1(double otherunit1) {
		this.otherunit1 = otherunit1;
	}
	public double getOtherunit2() {
		return otherunit2;
	}
	public void setOtherunit2(double otherunit2) {
		this.otherunit2 = otherunit2;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public double getExtendedprice() {
		return extendedprice;
	}
	public void setExtendedprice(double extendedprice) {
		this.extendedprice = extendedprice;
	}
	public Date getEffectivedate() {
		return effectivedate;
	}
	public void setEffectivedate(Date effectivedate) {
		this.effectivedate = effectivedate;
	}
	public String getForte_flag() {
		return forte_flag;
	}
	public void setForte_flag(String forte_flag) {
		this.forte_flag = forte_flag;
	}
	public String getSusr1() {
		return susr1;
	}
	public void setSusr1(String susr1) {
		this.susr1 = susr1;
	}
	public String getSusr2() {
		return susr2;
	}
	public void setSusr2(String susr2) {
		this.susr2 = susr2;
	}
	public String getSusr3() {
		return susr3;
	}
	public void setSusr3(String susr3) {
		this.susr3 = susr3;
	}
	public String getSusr4() {
		return susr4;
	}
	public void setSusr4(String susr4) {
		this.susr4 = susr4;
	}
	public String getSusr5() {
		return susr5;
	}
	public void setSusr5(String susr5) {
		this.susr5 = susr5;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getReasoncode() {
		return reasoncode;
	}
	public void setReasoncode(String reasoncode) {
		this.reasoncode = reasoncode;
	}
	public String getPalletid() {
		return palletid;
	}
	public void setPalletid(String palletid) {
		this.palletid = palletid;
	}
	public double getQtyrejected() {
		return qtyrejected;
	}
	public void setQtyrejected(double qtyrejected) {
		this.qtyrejected = qtyrejected;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getReturntype() {
		return returntype;
	}
	public void setReturntype(String returntype) {
		this.returntype = returntype;
	}
	public String getReturnreason() {
		return returnreason;
	}
	public void setReturnreason(String returnreason) {
		this.returnreason = returnreason;
	}
	public String getDispositiontype() {
		return dispositiontype;
	}
	public void setDispositiontype(String dispositiontype) {
		this.dispositiontype = dispositiontype;
	}
	public String getDispositioncode() {
		return dispositioncode;
	}
	public void setDispositioncode(String dispositioncode) {
		this.dispositioncode = dispositioncode;
	}
	public String getReturncondition() {
		return returncondition;
	}
	public void setReturncondition(String returncondition) {
		this.returncondition = returncondition;
	}
	public String getQcrequired() {
		return qcrequired;
	}
	public void setQcrequired(String qcrequired) {
		this.qcrequired = qcrequired;
	}
	public double getQcqtyinspected() {
		return qcqtyinspected;
	}
	public void setQcqtyinspected(double qcqtyinspected) {
		this.qcqtyinspected = qcqtyinspected;
	}
	public double getQcqtyrejected() {
		return qcqtyrejected;
	}
	public void setQcqtyrejected(double qcqtyrejected) {
		this.qcqtyrejected = qcqtyrejected;
	}
	public String getQcrejreason() {
		return qcrejreason;
	}
	public void setQcrejreason(String qcrejreason) {
		this.qcrejreason = qcrejreason;
	}
	public String getQcstatus() {
		return qcstatus;
	}
	public void setQcstatus(String qcstatus) {
		this.qcstatus = qcstatus;
	}
	public String getQcuser() {
		return qcuser;
	}
	public void setQcuser(String qcuser) {
		this.qcuser = qcuser;
	}
	public String getQcautoadjust() {
		return qcautoadjust;
	}
	public void setQcautoadjust(String qcautoadjust) {
		this.qcautoadjust = qcautoadjust;
	}
	public String getExternallot() {
		return externallot;
	}
	public void setExternallot(String externallot) {
		this.externallot = externallot;
	}
	public String getRma() {
		return rma;
	}
	public void setRma(String rma) {
		this.rma = rma;
	}
	public double getPackingslipqty() {
		return packingslipqty;
	}
	public void setPackingslipqty(double packingslipqty) {
		this.packingslipqty = packingslipqty;
	}
	public String getIpskey() {
		return ipskey;
	}
	public void setIpskey(String ipskey) {
		this.ipskey = ipskey;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getSupplierkey() {
		return supplierkey;
	}
	public void setSupplierkey(String supplierkey) {
		this.supplierkey = supplierkey;
	}
	public String getMatchlottable() {
		return matchlottable;
	}
	public void setMatchlottable(String matchlottable) {
		this.matchlottable = matchlottable;
	}
	public String getReceiptdetailid() {
		return receiptdetailid;
	}
	public void setReceiptdetailid(String receiptdetailid) {
		this.receiptdetailid = receiptdetailid;
	}
	public String getPolinenumber() {
		return polinenumber;
	}
	public void setPolinenumber(String polinenumber) {
		this.polinenumber = polinenumber;
	}
	public Date getLottable11() {
		return lottable11;
	}
	public void setLottable11(Date lottable11) {
		this.lottable11 = lottable11;
	}
	public Date getLottable12() {
		return lottable12;
	}
	public void setLottable12(Date lottable12) {
		this.lottable12 = lottable12;
	}
	public String getSourcelocation() {
		return sourcelocation;
	}
	public void setSourcelocation(String sourcelocation) {
		this.sourcelocation = sourcelocation;
	}
	public String getSourceversion() {
		return sourceversion;
	}
	public void setSourceversion(String sourceversion) {
		this.sourceversion = sourceversion;
	}
	public String getReferencetype() {
		return referencetype;
	}
	public void setReferencetype(String referencetype) {
		this.referencetype = referencetype;
	}
	public String getReferencedocument() {
		return referencedocument;
	}
	public void setReferencedocument(String referencedocument) {
		this.referencedocument = referencedocument;
	}
	public String getReferencelocation() {
		return referencelocation;
	}
	public void setReferencelocation(String referencelocation) {
		this.referencelocation = referencelocation;
	}
	public String getReferenceversion() {
		return referenceversion;
	}
	public void setReferenceversion(String referenceversion) {
		this.referenceversion = referenceversion;
	}
	public String getReferenceline() {
		return referenceline;
	}
	public void setReferenceline(String referenceline) {
		this.referenceline = referenceline;
	}
	public double getCubicmeter() {
		return cubicmeter;
	}
	public void setCubicmeter(double cubicmeter) {
		this.cubicmeter = cubicmeter;
	}
	public double getHundredweight() {
		return hundredweight;
	}
	public void setHundredweight(double hundredweight) {
		this.hundredweight = hundredweight;
	}
	public double getTarewgt() {
		return tarewgt;
	}
	public void setTarewgt(double tarewgt) {
		this.tarewgt = tarewgt;
	}
	public String getReferenceaccountingentity() {
		return referenceaccountingentity;
	}
	public void setReferenceaccountingentity(String referenceaccountingentity) {
		this.referenceaccountingentity = referenceaccountingentity;
	}
	public String getReferencescheduleline() {
		return referencescheduleline;
	}
	public void setReferencescheduleline(String referencescheduleline) {
		this.referencescheduleline = referencescheduleline;
	}
	public String getRequisitiondocument() {
		return requisitiondocument;
	}
	public void setRequisitiondocument(String requisitiondocument) {
		this.requisitiondocument = requisitiondocument;
	}
	public String getRequisitionaccountingentity() {
		return requisitionaccountingentity;
	}
	public void setRequisitionaccountingentity(String requisitionaccountingentity) {
		this.requisitionaccountingentity = requisitionaccountingentity;
	}
	public String getRequisitionlocation() {
		return requisitionlocation;
	}
	public void setRequisitionlocation(String requisitionlocation) {
		this.requisitionlocation = requisitionlocation;
	}
	public String getRequisitionversion() {
		return requisitionversion;
	}
	public void setRequisitionversion(String requisitionversion) {
		this.requisitionversion = requisitionversion;
	}
	public String getRequisitionline() {
		return requisitionline;
	}
	public void setRequisitionline(String requisitionline) {
		this.requisitionline = requisitionline;
	}
	public String getRequisitionscheduleline() {
		return requisitionscheduleline;
	}
	public void setRequisitionscheduleline(String requisitionscheduleline) {
		this.requisitionscheduleline = requisitionscheduleline;
	}
	public String getPurchaseorderdocument() {
		return purchaseorderdocument;
	}
	public void setPurchaseorderdocument(String purchaseorderdocument) {
		this.purchaseorderdocument = purchaseorderdocument;
	}
	public String getPurchaseorderaccountingentity() {
		return purchaseorderaccountingentity;
	}
	public void setPurchaseorderaccountingentity(String purchaseorderaccountingentity) {
		this.purchaseorderaccountingentity = purchaseorderaccountingentity;
	}
	public String getPurchaseorderlocation() {
		return purchaseorderlocation;
	}
	public void setPurchaseorderlocation(String purchaseorderlocation) {
		this.purchaseorderlocation = purchaseorderlocation;
	}
	public String getPurchaseorderversion() {
		return purchaseorderversion;
	}
	public void setPurchaseorderversion(String purchaseorderversion) {
		this.purchaseorderversion = purchaseorderversion;
	}
	public String getPurchaseorderline() {
		return purchaseorderline;
	}
	public void setPurchaseorderline(String purchaseorderline) {
		this.purchaseorderline = purchaseorderline;
	}
	public String getPurchaseorderscheduleline() {
		return purchaseorderscheduleline;
	}
	public void setPurchaseorderscheduleline(String purchaseorderscheduleline) {
		this.purchaseorderscheduleline = purchaseorderscheduleline;
	}
	public String getSalesorderdocument() {
		return salesorderdocument;
	}
	public void setSalesorderdocument(String salesorderdocument) {
		this.salesorderdocument = salesorderdocument;
	}
	public String getSalesorderaccountingentity() {
		return salesorderaccountingentity;
	}
	public void setSalesorderaccountingentity(String salesorderaccountingentity) {
		this.salesorderaccountingentity = salesorderaccountingentity;
	}
	public String getSalesorderlocation() {
		return salesorderlocation;
	}
	public void setSalesorderlocation(String salesorderlocation) {
		this.salesorderlocation = salesorderlocation;
	}
	public String getSalesorderversion() {
		return salesorderversion;
	}
	public void setSalesorderversion(String salesorderversion) {
		this.salesorderversion = salesorderversion;
	}
	public String getSalesorderline() {
		return salesorderline;
	}
	public void setSalesorderline(String salesorderline) {
		this.salesorderline = salesorderline;
	}
	public String getSalesorderscheduleline() {
		return salesorderscheduleline;
	}
	public void setSalesorderscheduleline(String salesorderscheduleline) {
		this.salesorderscheduleline = salesorderscheduleline;
	}
	public String getProductionorderdocument() {
		return productionorderdocument;
	}
	public void setProductionorderdocument(String productionorderdocument) {
		this.productionorderdocument = productionorderdocument;
	}
	public String getProductionorderaccentity() {
		return productionorderaccentity;
	}
	public void setProductionorderaccentity(String productionorderaccentity) {
		this.productionorderaccentity = productionorderaccentity;
	}
	public String getProductionorderlocation() {
		return productionorderlocation;
	}
	public void setProductionorderlocation(String productionorderlocation) {
		this.productionorderlocation = productionorderlocation;
	}
	public String getProductionorderversion() {
		return productionorderversion;
	}
	public void setProductionorderversion(String productionorderversion) {
		this.productionorderversion = productionorderversion;
	}
	public String getProductionorderline() {
		return productionorderline;
	}
	public void setProductionorderline(String productionorderline) {
		this.productionorderline = productionorderline;
	}
	public String getProductionorderscheduleline() {
		return productionorderscheduleline;
	}
	public void setProductionorderscheduleline(String productionorderscheduleline) {
		this.productionorderscheduleline = productionorderscheduleline;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public String getOriginallinenumber() {
		return originallinenumber;
	}
	public void setOriginallinenumber(String originallinenumber) {
		this.originallinenumber = originallinenumber;
	}
	public String getDisposition() {
		return disposition;
	}
	public void setDisposition(String disposition) {
		this.disposition = disposition;
	}
	public String getQcsampledtype() {
		return qcsampledtype;
	}
	public void setQcsampledtype(String qcsampledtype) {
		this.qcsampledtype = qcsampledtype;
	}
	public double getQtytoinspect() {
		return qtytoinspect;
	}
	public void setQtytoinspect(double qtytoinspect) {
		this.qtytoinspect = qtytoinspect;
	}
	public String getCheckforbackflushing() {
		return checkforbackflushing;
	}
	public void setCheckforbackflushing(String checkforbackflushing) {
		this.checkforbackflushing = checkforbackflushing;
	}
	public String getQuarantinelpn() {
		return quarantinelpn;
	}
	public void setQuarantinelpn(String quarantinelpn) {
		this.quarantinelpn = quarantinelpn;
	}
	public String getHostprocessrequired() {
		return hostprocessrequired;
	}
	public void setHostprocessrequired(String hostprocessrequired) {
		this.hostprocessrequired = hostprocessrequired;
	}
	public String getAllowreopen() {
		return allowreopen;
	}
	public void setAllowreopen(String allowreopen) {
		this.allowreopen = allowreopen;
	}
	public Date getAdddate() {
		return adddate;
	}
	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}
	public String getAddwho() {
		return addwho;
	}
	public void setAddwho(String addwho) {
		this.addwho = addwho;
	}
	public Date getEditdate() {
		return editdate;
	}
	public void setEditdate(Date editdate) {
		this.editdate = editdate;
	}
	public String getEditwho() {
		return editwho;
	}
	public void setEditwho(String editwho) {
		this.editwho = editwho;
	}
	public String getPutaway() {
		return putaway;
	}
	public void setPutaway(String putaway) {
		this.putaway = putaway;
	}
	public String getSkip() {
		return skip;
	}
	public void setSkip(String skip) {
		this.skip = skip;
	}
	public String getReturnwho() {
		return returnwho;
	}
	public void setReturnwho(String returnwho) {
		this.returnwho = returnwho;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	public String getReturnstatus() {
		return returnstatus;
	}
	public void setReturnstatus(String returnstatus) {
		this.returnstatus = returnstatus;
	}
	public String getDefault1() {
		return default1;
	}
	public void setDefault1(String default1) {
		this.default1 = default1;
	}
	public String getDefault2() {
		return default2;
	}
	public void setDefault2(String default2) {
		this.default2 = default2;
	}
	public String getDefault3() {
		return default3;
	}
	public void setDefault3(String default3) {
		this.default3 = default3;
	}
	public String getDefault4() {
		return default4;
	}
	public void setDefault4(String default4) {
		this.default4 = default4;
	}
	public String getDefault5() {
		return default5;
	}
	public void setDefault5(String default5) {
		this.default5 = default5;
	}
	public String getDefault6() {
		return default6;
	}
	public void setDefault6(String default6) {
		this.default6 = default6;
	}
	public String getDefault7() {
		return default7;
	}
	public void setDefault7(String default7) {
		this.default7 = default7;
	}
	public String getDefault8() {
		return default8;
	}
	public void setDefault8(String default8) {
		this.default8 = default8;
	}
	public String getDefault9() {
		return default9;
	}
	public void setDefault9(String default9) {
		this.default9 = default9;
	}
	public String getDefault10() {
		return default10;
	}
	public void setDefault10(String default10) {
		this.default10 = default10;
	}
	public String getDefault11() {
		return default11;
	}
	public void setDefault11(String default11) {
		this.default11 = default11;
	}
	public String getDefault12() {
		return default12;
	}
	public void setDefault12(String default12) {
		this.default12 = default12;
	}
	public String getDefault13() {
		return default13;
	}
	public void setDefault13(String default13) {
		this.default13 = default13;
	}
	public String getDefault14() {
		return default14;
	}
	public void setDefault14(String default14) {
		this.default14 = default14;
	}
	public String getDefault15() {
		return default15;
	}
	public void setDefault15(String default15) {
		this.default15 = default15;
	}
	public String getDefault16() {
		return default16;
	}
	public void setDefault16(String default16) {
		this.default16 = default16;
	}
	public String getDefault17() {
		return default17;
	}
	public void setDefault17(String default17) {
		this.default17 = default17;
	}
	public String getDefault18() {
		return default18;
	}
	public void setDefault18(String default18) {
		this.default18 = default18;
	}
	public String getDefault19() {
		return default19;
	}
	public void setDefault19(String default19) {
		this.default19 = default19;
	}
	public String getDefault20() {
		return default20;
	}
	public void setDefault20(String default20) {
		this.default20 = default20;
	}
	public String getDefault21() {
		return default21;
	}
	public void setDefault21(String default21) {
		this.default21 = default21;
	}
	public String getDefault22() {
		return default22;
	}
	public void setDefault22(String default22) {
		this.default22 = default22;
	}
	public String getDefault23() {
		return default23;
	}
	public void setDefault23(String default23) {
		this.default23 = default23;
	}
	public String getDefault24() {
		return default24;
	}
	public void setDefault24(String default24) {
		this.default24 = default24;
	}
	public String getDefault25() {
		return default25;
	}
	public void setDefault25(String default25) {
		this.default25 = default25;
	}
	public String getDefault26() {
		return default26;
	}
	public void setDefault26(String default26) {
		this.default26 = default26;
	}
	public String getDefault27() {
		return default27;
	}
	public void setDefault27(String default27) {
		this.default27 = default27;
	}
	
}
