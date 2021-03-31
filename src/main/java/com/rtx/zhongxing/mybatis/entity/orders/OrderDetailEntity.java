package com.rtx.zhongxing.mybatis.entity.orders;

import java.util.Date;

import com.rtx.zhongxing.annotation.mybatisHelp.RTXMybatisTableHelp;

@RTXMybatisTableHelp(tablename = "orderdetail")
public class OrderDetailEntity {

	protected Long serialkey;
	protected String orderkey;
	protected String orderlinenumber;
	protected String whseid;
	protected double orderdetailsysid;
	protected String externorderkey;
	protected String externlineno;
	protected String sku;
	protected String storerkey;
	protected String manufacturersku;
	protected String retailsku;
	protected String altsku;
	protected double originalqty;
	protected double openqty;
	protected double shippedqty;
	protected double adjustedqty;
	protected double qtypreallocated;
	protected double qtyallocated;
	protected double qtypicked;
	protected String uom;
	protected String packkey;
	protected String pickcode;
	protected String cartongroup;
	protected String lot;
	protected String id;
	protected String facility;
	protected String status;
	protected double unitprice;
	protected double tax01;
	protected double tax02;
	protected double extendedprice;
	protected String updatesource;
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
	protected Date effectivedate;
	protected String forte_flag;
	protected String tariffkey;
	protected String susr1;
	protected String susr2;
	protected String susr3;
	protected String susr4;
	protected String susr5;
	protected String notes;
	protected String workorderkey;
	protected String allocatestrategykey;
	protected String preallocatestrategykey;
	protected String allocatestrategytype;
	protected String skurotation;
	protected double shelflife;
	protected String rotation;
	protected String pallet_id;
	protected String sub_flag;
	protected double product_weight;
	protected double product_cube;
	protected double origcaseqty;
	protected double origpalletqty;
	protected double oktosubstitute;
	protected double issubstitute;
	protected String originalsku;
	protected String originallinenumber;
	protected String shipgroup01;
	protected String shipgroup02;
	protected String shipgroup03;
	protected Date actualshipdate;
	protected String intermodalvehicle;
	protected String pickinginstructions;
	protected String cartonbreak;
	protected double cartonqtybreak;
	protected double qtyintransit;
	protected String opprequest;
	protected String wpreleased;
	protected String externallot;
	protected String buyerpo;
	protected String generatecontainerdetail;
	protected String labelname;
	protected String stdsscclabelname;
	protected String stdgtinlabelname;
	protected String rfidsscclabelname;
	protected String rfidgtinlabelname;
	protected String externallocsequence;
	protected double minshippercent;
	protected String linetype;
	protected double componentqty;
	protected String componentreference;
	protected String oqcrequired;
	protected String oqcautoadjust;
	protected String orderdetailid;
	protected Date lottable11;
	protected Date lottable12;
	protected String sourceversion;
	protected String referencetype;
	protected String referencedocument;
	protected String referencelocation;
	protected String referenceversion;
	protected String referenceline;
	protected double cubicmeter;
	protected double hundredweight;
	protected String stageloc;
	protected double fulfillqty;
	protected String dapicksort;
	protected String shortshipreason;
	protected double origlayerqty;
	protected String referenceaccountingentity;
	protected String referencescheduleline;
	protected String baseorderkey;
	protected double convertedqty;
	protected double processedqty;
	protected double qtytoprocess;
	protected double sequence;
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
	protected String idrequired;
	protected String kitorderasn;
	protected double palletestimate;
	protected String backflushindicator;
	protected String alloclotlimit;
	protected Date lastshippeddate;
	protected String labelsprinted;
	protected String newallocationstrategy;
	protected String itemclass;
	protected double runinqty;
	protected double runoutqty;
	protected double fgqtyreceived;
	protected String runinuom;
	protected String runoutuom;
	protected double externalshiprequestqty;
	protected String batchordernumber;
	protected String batchorderline;
	protected String origordernumber;
	protected String origorderline;
	protected Date adddate;
	protected String addwho;
	protected Date editdate;
	protected String editwho;
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
	protected String default28;
	protected String default29;
	protected String default30;
	protected String default31;
	protected String default32;
	protected String default33;
	protected String default34;
	protected String default35;
	protected String default36;
	protected String default37;
	protected String default38;
	protected String default39;
	protected String default40;
	protected String amz_name;
	public Long getSerialkey() {
		return serialkey;
	}
	public void setSerialkey(Long serialkey) {
		this.serialkey = serialkey;
	}
	public String getOrderkey() {
		return orderkey;
	}
	public void setOrderkey(String orderkey) {
		this.orderkey = orderkey;
	}
	public String getOrderlinenumber() {
		return orderlinenumber;
	}
	public void setOrderlinenumber(String orderlinenumber) {
		this.orderlinenumber = orderlinenumber;
	}
	public String getWhseid() {
		return whseid;
	}
	public void setWhseid(String whseid) {
		this.whseid = whseid;
	}
	public double getOrderdetailsysid() {
		return orderdetailsysid;
	}
	public void setOrderdetailsysid(double orderdetailsysid) {
		this.orderdetailsysid = orderdetailsysid;
	}
	public String getExternorderkey() {
		return externorderkey;
	}
	public void setExternorderkey(String externorderkey) {
		this.externorderkey = externorderkey;
	}
	public String getExternlineno() {
		return externlineno;
	}
	public void setExternlineno(String externlineno) {
		this.externlineno = externlineno;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getStorerkey() {
		return storerkey;
	}
	public void setStorerkey(String storerkey) {
		this.storerkey = storerkey;
	}
	public String getManufacturersku() {
		return manufacturersku;
	}
	public void setManufacturersku(String manufacturersku) {
		this.manufacturersku = manufacturersku;
	}
	public String getRetailsku() {
		return retailsku;
	}
	public void setRetailsku(String retailsku) {
		this.retailsku = retailsku;
	}
	public String getAltsku() {
		return altsku;
	}
	public void setAltsku(String altsku) {
		this.altsku = altsku;
	}
	public double getOriginalqty() {
		return originalqty;
	}
	public void setOriginalqty(double originalqty) {
		this.originalqty = originalqty;
	}
	public double getOpenqty() {
		return openqty;
	}
	public void setOpenqty(double openqty) {
		this.openqty = openqty;
	}
	public double getShippedqty() {
		return shippedqty;
	}
	public void setShippedqty(double shippedqty) {
		this.shippedqty = shippedqty;
	}
	public double getAdjustedqty() {
		return adjustedqty;
	}
	public void setAdjustedqty(double adjustedqty) {
		this.adjustedqty = adjustedqty;
	}
	public double getQtypreallocated() {
		return qtypreallocated;
	}
	public void setQtypreallocated(double qtypreallocated) {
		this.qtypreallocated = qtypreallocated;
	}
	public double getQtyallocated() {
		return qtyallocated;
	}
	public void setQtyallocated(double qtyallocated) {
		this.qtyallocated = qtyallocated;
	}
	public double getQtypicked() {
		return qtypicked;
	}
	public void setQtypicked(double qtypicked) {
		this.qtypicked = qtypicked;
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
	public String getPickcode() {
		return pickcode;
	}
	public void setPickcode(String pickcode) {
		this.pickcode = pickcode;
	}
	public String getCartongroup() {
		return cartongroup;
	}
	public void setCartongroup(String cartongroup) {
		this.cartongroup = cartongroup;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFacility() {
		return facility;
	}
	public void setFacility(String facility) {
		this.facility = facility;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public double getTax01() {
		return tax01;
	}
	public void setTax01(double tax01) {
		this.tax01 = tax01;
	}
	public double getTax02() {
		return tax02;
	}
	public void setTax02(double tax02) {
		this.tax02 = tax02;
	}
	public double getExtendedprice() {
		return extendedprice;
	}
	public void setExtendedprice(double extendedprice) {
		this.extendedprice = extendedprice;
	}
	public String getUpdatesource() {
		return updatesource;
	}
	public void setUpdatesource(String updatesource) {
		this.updatesource = updatesource;
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
	public String getTariffkey() {
		return tariffkey;
	}
	public void setTariffkey(String tariffkey) {
		this.tariffkey = tariffkey;
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
	public String getWorkorderkey() {
		return workorderkey;
	}
	public void setWorkorderkey(String workorderkey) {
		this.workorderkey = workorderkey;
	}
	public String getAllocatestrategykey() {
		return allocatestrategykey;
	}
	public void setAllocatestrategykey(String allocatestrategykey) {
		this.allocatestrategykey = allocatestrategykey;
	}
	public String getPreallocatestrategykey() {
		return preallocatestrategykey;
	}
	public void setPreallocatestrategykey(String preallocatestrategykey) {
		this.preallocatestrategykey = preallocatestrategykey;
	}
	public String getAllocatestrategytype() {
		return allocatestrategytype;
	}
	public void setAllocatestrategytype(String allocatestrategytype) {
		this.allocatestrategytype = allocatestrategytype;
	}
	public String getSkurotation() {
		return skurotation;
	}
	public void setSkurotation(String skurotation) {
		this.skurotation = skurotation;
	}
	public double getShelflife() {
		return shelflife;
	}
	public void setShelflife(double shelflife) {
		this.shelflife = shelflife;
	}
	public String getRotation() {
		return rotation;
	}
	public void setRotation(String rotation) {
		this.rotation = rotation;
	}
	public String getPallet_id() {
		return pallet_id;
	}
	public void setPallet_id(String pallet_id) {
		this.pallet_id = pallet_id;
	}
	public String getSub_flag() {
		return sub_flag;
	}
	public void setSub_flag(String sub_flag) {
		this.sub_flag = sub_flag;
	}
	public double getProduct_weight() {
		return product_weight;
	}
	public void setProduct_weight(double product_weight) {
		this.product_weight = product_weight;
	}
	public double getProduct_cube() {
		return product_cube;
	}
	public void setProduct_cube(double product_cube) {
		this.product_cube = product_cube;
	}
	public double getOrigcaseqty() {
		return origcaseqty;
	}
	public void setOrigcaseqty(double origcaseqty) {
		this.origcaseqty = origcaseqty;
	}
	public double getOrigpalletqty() {
		return origpalletqty;
	}
	public void setOrigpalletqty(double origpalletqty) {
		this.origpalletqty = origpalletqty;
	}
	public double getOktosubstitute() {
		return oktosubstitute;
	}
	public void setOktosubstitute(double oktosubstitute) {
		this.oktosubstitute = oktosubstitute;
	}
	public double getIssubstitute() {
		return issubstitute;
	}
	public void setIssubstitute(double issubstitute) {
		this.issubstitute = issubstitute;
	}
	public String getOriginalsku() {
		return originalsku;
	}
	public void setOriginalsku(String originalsku) {
		this.originalsku = originalsku;
	}
	public String getOriginallinenumber() {
		return originallinenumber;
	}
	public void setOriginallinenumber(String originallinenumber) {
		this.originallinenumber = originallinenumber;
	}
	public String getShipgroup01() {
		return shipgroup01;
	}
	public void setShipgroup01(String shipgroup01) {
		this.shipgroup01 = shipgroup01;
	}
	public String getShipgroup02() {
		return shipgroup02;
	}
	public void setShipgroup02(String shipgroup02) {
		this.shipgroup02 = shipgroup02;
	}
	public String getShipgroup03() {
		return shipgroup03;
	}
	public void setShipgroup03(String shipgroup03) {
		this.shipgroup03 = shipgroup03;
	}
	public Date getActualshipdate() {
		return actualshipdate;
	}
	public void setActualshipdate(Date actualshipdate) {
		this.actualshipdate = actualshipdate;
	}
	public String getIntermodalvehicle() {
		return intermodalvehicle;
	}
	public void setIntermodalvehicle(String intermodalvehicle) {
		this.intermodalvehicle = intermodalvehicle;
	}
	public String getPickinginstructions() {
		return pickinginstructions;
	}
	public void setPickinginstructions(String pickinginstructions) {
		this.pickinginstructions = pickinginstructions;
	}
	public String getCartonbreak() {
		return cartonbreak;
	}
	public void setCartonbreak(String cartonbreak) {
		this.cartonbreak = cartonbreak;
	}
	public double getCartonqtybreak() {
		return cartonqtybreak;
	}
	public void setCartonqtybreak(double cartonqtybreak) {
		this.cartonqtybreak = cartonqtybreak;
	}
	public double getQtyintransit() {
		return qtyintransit;
	}
	public void setQtyintransit(double qtyintransit) {
		this.qtyintransit = qtyintransit;
	}
	public String getOpprequest() {
		return opprequest;
	}
	public void setOpprequest(String opprequest) {
		this.opprequest = opprequest;
	}
	public String getWpreleased() {
		return wpreleased;
	}
	public void setWpreleased(String wpreleased) {
		this.wpreleased = wpreleased;
	}
	public String getExternallot() {
		return externallot;
	}
	public void setExternallot(String externallot) {
		this.externallot = externallot;
	}
	public String getBuyerpo() {
		return buyerpo;
	}
	public void setBuyerpo(String buyerpo) {
		this.buyerpo = buyerpo;
	}
	public String getGeneratecontainerdetail() {
		return generatecontainerdetail;
	}
	public void setGeneratecontainerdetail(String generatecontainerdetail) {
		this.generatecontainerdetail = generatecontainerdetail;
	}
	public String getLabelname() {
		return labelname;
	}
	public void setLabelname(String labelname) {
		this.labelname = labelname;
	}
	public String getStdsscclabelname() {
		return stdsscclabelname;
	}
	public void setStdsscclabelname(String stdsscclabelname) {
		this.stdsscclabelname = stdsscclabelname;
	}
	public String getStdgtinlabelname() {
		return stdgtinlabelname;
	}
	public void setStdgtinlabelname(String stdgtinlabelname) {
		this.stdgtinlabelname = stdgtinlabelname;
	}
	public String getRfidsscclabelname() {
		return rfidsscclabelname;
	}
	public void setRfidsscclabelname(String rfidsscclabelname) {
		this.rfidsscclabelname = rfidsscclabelname;
	}
	public String getRfidgtinlabelname() {
		return rfidgtinlabelname;
	}
	public void setRfidgtinlabelname(String rfidgtinlabelname) {
		this.rfidgtinlabelname = rfidgtinlabelname;
	}
	public String getExternallocsequence() {
		return externallocsequence;
	}
	public void setExternallocsequence(String externallocsequence) {
		this.externallocsequence = externallocsequence;
	}
	public double getMinshippercent() {
		return minshippercent;
	}
	public void setMinshippercent(double minshippercent) {
		this.minshippercent = minshippercent;
	}
	public String getLinetype() {
		return linetype;
	}
	public void setLinetype(String linetype) {
		this.linetype = linetype;
	}
	public double getComponentqty() {
		return componentqty;
	}
	public void setComponentqty(double componentqty) {
		this.componentqty = componentqty;
	}
	public String getComponentreference() {
		return componentreference;
	}
	public void setComponentreference(String componentreference) {
		this.componentreference = componentreference;
	}
	public String getOqcrequired() {
		return oqcrequired;
	}
	public void setOqcrequired(String oqcrequired) {
		this.oqcrequired = oqcrequired;
	}
	public String getOqcautoadjust() {
		return oqcautoadjust;
	}
	public void setOqcautoadjust(String oqcautoadjust) {
		this.oqcautoadjust = oqcautoadjust;
	}
	public String getOrderdetailid() {
		return orderdetailid;
	}
	public void setOrderdetailid(String orderdetailid) {
		this.orderdetailid = orderdetailid;
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
	public String getStageloc() {
		return stageloc;
	}
	public void setStageloc(String stageloc) {
		this.stageloc = stageloc;
	}
	public double getFulfillqty() {
		return fulfillqty;
	}
	public void setFulfillqty(double fulfillqty) {
		this.fulfillqty = fulfillqty;
	}
	public String getDapicksort() {
		return dapicksort;
	}
	public void setDapicksort(String dapicksort) {
		this.dapicksort = dapicksort;
	}
	public String getShortshipreason() {
		return shortshipreason;
	}
	public void setShortshipreason(String shortshipreason) {
		this.shortshipreason = shortshipreason;
	}
	public double getOriglayerqty() {
		return origlayerqty;
	}
	public void setOriglayerqty(double origlayerqty) {
		this.origlayerqty = origlayerqty;
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
	public String getBaseorderkey() {
		return baseorderkey;
	}
	public void setBaseorderkey(String baseorderkey) {
		this.baseorderkey = baseorderkey;
	}
	public double getConvertedqty() {
		return convertedqty;
	}
	public void setConvertedqty(double convertedqty) {
		this.convertedqty = convertedqty;
	}
	public double getProcessedqty() {
		return processedqty;
	}
	public void setProcessedqty(double processedqty) {
		this.processedqty = processedqty;
	}
	public double getQtytoprocess() {
		return qtytoprocess;
	}
	public void setQtytoprocess(double qtytoprocess) {
		this.qtytoprocess = qtytoprocess;
	}
	public double getSequence() {
		return sequence;
	}
	public void setSequence(double sequence) {
		this.sequence = sequence;
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
	public String getIdrequired() {
		return idrequired;
	}
	public void setIdrequired(String idrequired) {
		this.idrequired = idrequired;
	}
	public String getKitorderasn() {
		return kitorderasn;
	}
	public void setKitorderasn(String kitorderasn) {
		this.kitorderasn = kitorderasn;
	}
	public double getPalletestimate() {
		return palletestimate;
	}
	public void setPalletestimate(double palletestimate) {
		this.palletestimate = palletestimate;
	}
	public String getBackflushindicator() {
		return backflushindicator;
	}
	public void setBackflushindicator(String backflushindicator) {
		this.backflushindicator = backflushindicator;
	}
	public String getAlloclotlimit() {
		return alloclotlimit;
	}
	public void setAlloclotlimit(String alloclotlimit) {
		this.alloclotlimit = alloclotlimit;
	}
	public Date getLastshippeddate() {
		return lastshippeddate;
	}
	public void setLastshippeddate(Date lastshippeddate) {
		this.lastshippeddate = lastshippeddate;
	}
	public String getLabelsprinted() {
		return labelsprinted;
	}
	public void setLabelsprinted(String labelsprinted) {
		this.labelsprinted = labelsprinted;
	}
	public String getNewallocationstrategy() {
		return newallocationstrategy;
	}
	public void setNewallocationstrategy(String newallocationstrategy) {
		this.newallocationstrategy = newallocationstrategy;
	}
	public String getItemclass() {
		return itemclass;
	}
	public void setItemclass(String itemclass) {
		this.itemclass = itemclass;
	}
	public double getRuninqty() {
		return runinqty;
	}
	public void setRuninqty(double runinqty) {
		this.runinqty = runinqty;
	}
	public double getRunoutqty() {
		return runoutqty;
	}
	public void setRunoutqty(double runoutqty) {
		this.runoutqty = runoutqty;
	}
	public double getFgqtyreceived() {
		return fgqtyreceived;
	}
	public void setFgqtyreceived(double fgqtyreceived) {
		this.fgqtyreceived = fgqtyreceived;
	}
	public String getRuninuom() {
		return runinuom;
	}
	public void setRuninuom(String runinuom) {
		this.runinuom = runinuom;
	}
	public String getRunoutuom() {
		return runoutuom;
	}
	public void setRunoutuom(String runoutuom) {
		this.runoutuom = runoutuom;
	}
	public double getExternalshiprequestqty() {
		return externalshiprequestqty;
	}
	public void setExternalshiprequestqty(double externalshiprequestqty) {
		this.externalshiprequestqty = externalshiprequestqty;
	}
	public String getBatchordernumber() {
		return batchordernumber;
	}
	public void setBatchordernumber(String batchordernumber) {
		this.batchordernumber = batchordernumber;
	}
	public String getBatchorderline() {
		return batchorderline;
	}
	public void setBatchorderline(String batchorderline) {
		this.batchorderline = batchorderline;
	}
	public String getOrigordernumber() {
		return origordernumber;
	}
	public void setOrigordernumber(String origordernumber) {
		this.origordernumber = origordernumber;
	}
	public String getOrigorderline() {
		return origorderline;
	}
	public void setOrigorderline(String origorderline) {
		this.origorderline = origorderline;
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
	public String getDefault28() {
		return default28;
	}
	public void setDefault28(String default28) {
		this.default28 = default28;
	}
	public String getDefault29() {
		return default29;
	}
	public void setDefault29(String default29) {
		this.default29 = default29;
	}
	public String getDefault30() {
		return default30;
	}
	public void setDefault30(String default30) {
		this.default30 = default30;
	}
	public String getDefault31() {
		return default31;
	}
	public void setDefault31(String default31) {
		this.default31 = default31;
	}
	public String getDefault32() {
		return default32;
	}
	public void setDefault32(String default32) {
		this.default32 = default32;
	}
	public String getDefault33() {
		return default33;
	}
	public void setDefault33(String default33) {
		this.default33 = default33;
	}
	public String getDefault34() {
		return default34;
	}
	public void setDefault34(String default34) {
		this.default34 = default34;
	}
	public String getDefault35() {
		return default35;
	}
	public void setDefault35(String default35) {
		this.default35 = default35;
	}
	public String getDefault36() {
		return default36;
	}
	public void setDefault36(String default36) {
		this.default36 = default36;
	}
	public String getDefault37() {
		return default37;
	}
	public void setDefault37(String default37) {
		this.default37 = default37;
	}
	public String getDefault38() {
		return default38;
	}
	public void setDefault38(String default38) {
		this.default38 = default38;
	}
	public String getDefault39() {
		return default39;
	}
	public void setDefault39(String default39) {
		this.default39 = default39;
	}
	public String getDefault40() {
		return default40;
	}
	public void setDefault40(String default40) {
		this.default40 = default40;
	}
	public String getAmz_name() {
		return amz_name;
	}
	public void setAmz_name(String amz_name) {
		this.amz_name = amz_name;
	}
}
