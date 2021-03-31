package com.rtx.zhongxing.mybatis.entity.receipt;

import java.util.Date;
import java.util.List;

import com.rtx.zhongxing.annotation.mybatisHelp.RTXMybatisTableHelp;
import com.rtx.zhongxing.annotation.mybatisHelp.RtxMybatisUpdateCondition;

@RTXMybatisTableHelp(tablename = "receipt")
public class ReceiptEntity {
	
	@RtxMybatisUpdateCondition
	protected String serialkey;
	protected String whseid;
	protected String receiptkey;
	protected String externreceiptkey;
	protected String receiptgroup;
	protected String storerkey;
	protected Date receiptdate;
	protected String pokey;
	protected String carrierkey;
	protected String carriername;
	protected String carrieraddress1;
	protected String carrieraddress2;
	protected String carriercity;
	protected String carrierstate;
	protected String carrierzip;
	protected String carrierreference;
	protected String warehousereference;
	protected String origincountry;
	protected String destinationcountry;
	protected String vehiclenumber;
	protected Date vehicledate;
	protected String placeofloading;
	protected String placeofdischarge;
	protected String placeofdelivery;
	protected String incoterms;
	protected String termsnote;
	protected String containerkey;
	protected String signatory;
	protected String placeofissue;
	protected double openqty;
	protected String forte_flag;
	protected String status;
	protected Date effectivedate;
	protected String containertype;
	protected double containerqty;
	protected double billedcontainerqty;
	protected String transportationmode;
	protected String externalreceiptkey2;
	protected String susr1;
	protected String susr2;
	protected String susr3;
	protected String susr4;
	protected String susr5;
	protected String type;
	protected String rma;
	protected Date expectedreceiptdate;
	protected String allowautoreceipt;
	protected Date closeddate;
	protected String trackinventoryby;
	protected String carriercountry;
	protected String carrierphone;
	protected String drivername;
	protected String trailernumber;
	protected String trailerowner;
	protected String trailertype;
	protected Date arrivaldatetime;
	protected String lottablematchrequired;
	protected String advicenumber;
	protected Date advicedate;
	protected String packingslipnumber;
	protected String receiptid;
	protected String suppliercode;
	protected String suppliername;
	protected String shipfromaddressline1;
	protected String shipfromaddressline2;
	protected String shipfromaddressline3;
	protected String shipfromaddressline4;
	protected String shipfromcity;
	protected String shipfromstate;
	protected String shipfromzip;
	protected String shipfromisocountry;
	protected String shipfromcontact;
	protected String shipfromphone;
	protected String shipfromemail;
	protected Date scheduledshipdate;
	protected Date actualshipdate;
	protected double grossweight;
	protected double totalvolume;
	protected String sourcelocation;
	protected String sourceversion;
	protected String referencetype;
	protected String referencedocument;
	protected String referencelocation;
	protected String referenceversion;
	protected String door;
	protected String appointmentkey;
	protected String referenceaccountingentity;
	protected Date earliestshipdate;
	protected Date requiredshipdate;
	protected Date promisedshipdate;
	protected Date plannedshipdate;
	protected Date earliestdeliverydate;
	protected Date requireddeliverydate;
	protected Date promiseddeliverydate;
	protected Date planneddeliverydate;
	protected String shipfromaddressline5;
	protected String shipfromaddressline6;
	protected String returnfromparty;
	protected double temperature;
	protected String trailerkey;
	protected String transportationstatus;
	protected Date verifiedcloseddate;
	protected Date actualdeparturedate;
	protected String transportationservice;
	protected String pronumber;
	protected double freightchargebaseamount;
	protected double freightchargeamount;
	protected String tmfreightchargecurrency;
	protected double freightcostbaseamount;
	protected double freightcostamount;
	protected String tmfreightcostcurrency;
	protected String carrierroutestatus;
	protected Date adddate;
	protected String addwho;
	protected Date editdate;
	protected String editwho;
	protected String notes;
	protected String returnlots;
	protected String consigneekey;
	protected String productionstatus;
	protected String expectedrceiptdate;
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
	protected String createdate;
	protected double weight;
	protected String externpokey;
	protected String externalpokey2;
	protected String rtxapitype;
	private List<ReceiptDetailEntity> details;


	public String getRtxapitype() {
		return rtxapitype;
	}
	public void setRtxapitype(String rtxapitype) {
		this.rtxapitype = rtxapitype;
	}


	public String getSerialkey() {
		return serialkey;
	}


	public void setSerialkey(String serialkey) {
		this.serialkey = serialkey;
	}


	public String getWhseid() {
		return whseid;
	}


	public void setWhseid(String whseid) {
		this.whseid = whseid;
	}


	public String getReceiptkey() {
		return receiptkey;
	}


	public void setReceiptkey(String receiptkey) {
		this.receiptkey = receiptkey;
	}


	public String getExternreceiptkey() {
		return externreceiptkey;
	}


	public void setExternreceiptkey(String externreceiptkey) {
		this.externreceiptkey = externreceiptkey;
	}


	public String getReceiptgroup() {
		return receiptgroup;
	}


	public void setReceiptgroup(String receiptgroup) {
		this.receiptgroup = receiptgroup;
	}


	public String getStorerkey() {
		return storerkey;
	}


	public void setStorerkey(String storerkey) {
		this.storerkey = storerkey;
	}


	public Date getReceiptdate() {
		return receiptdate;
	}


	public void setReceiptdate(Date receiptdate) {
		this.receiptdate = receiptdate;
	}


	public String getPokey() {
		return pokey;
	}


	public void setPokey(String pokey) {
		this.pokey = pokey;
	}


	public String getCarrierkey() {
		return carrierkey;
	}


	public void setCarrierkey(String carrierkey) {
		this.carrierkey = carrierkey;
	}


	public String getCarriername() {
		return carriername;
	}


	public void setCarriername(String carriername) {
		this.carriername = carriername;
	}


	public String getCarrieraddress1() {
		return carrieraddress1;
	}


	public void setCarrieraddress1(String carrieraddress1) {
		this.carrieraddress1 = carrieraddress1;
	}


	public String getCarrieraddress2() {
		return carrieraddress2;
	}


	public void setCarrieraddress2(String carrieraddress2) {
		this.carrieraddress2 = carrieraddress2;
	}


	public String getCarriercity() {
		return carriercity;
	}


	public void setCarriercity(String carriercity) {
		this.carriercity = carriercity;
	}


	public String getCarrierstate() {
		return carrierstate;
	}


	public void setCarrierstate(String carrierstate) {
		this.carrierstate = carrierstate;
	}


	public String getCarrierzip() {
		return carrierzip;
	}


	public void setCarrierzip(String carrierzip) {
		this.carrierzip = carrierzip;
	}


	public String getCarrierreference() {
		return carrierreference;
	}


	public void setCarrierreference(String carrierreference) {
		this.carrierreference = carrierreference;
	}


	public String getWarehousereference() {
		return warehousereference;
	}


	public void setWarehousereference(String warehousereference) {
		this.warehousereference = warehousereference;
	}


	public String getOrigincountry() {
		return origincountry;
	}


	public void setOrigincountry(String origincountry) {
		this.origincountry = origincountry;
	}


	public String getDestinationcountry() {
		return destinationcountry;
	}


	public void setDestinationcountry(String destinationcountry) {
		this.destinationcountry = destinationcountry;
	}


	public String getVehiclenumber() {
		return vehiclenumber;
	}


	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}


	public Date getVehicledate() {
		return vehicledate;
	}


	public void setVehicledate(Date vehicledate) {
		this.vehicledate = vehicledate;
	}


	public String getPlaceofloading() {
		return placeofloading;
	}


	public void setPlaceofloading(String placeofloading) {
		this.placeofloading = placeofloading;
	}


	public String getPlaceofdischarge() {
		return placeofdischarge;
	}


	public void setPlaceofdischarge(String placeofdischarge) {
		this.placeofdischarge = placeofdischarge;
	}


	public String getPlaceofdelivery() {
		return placeofdelivery;
	}


	public void setPlaceofdelivery(String placeofdelivery) {
		this.placeofdelivery = placeofdelivery;
	}


	public String getIncoterms() {
		return incoterms;
	}


	public void setIncoterms(String incoterms) {
		this.incoterms = incoterms;
	}


	public String getTermsnote() {
		return termsnote;
	}


	public void setTermsnote(String termsnote) {
		this.termsnote = termsnote;
	}


	public String getContainerkey() {
		return containerkey;
	}


	public void setContainerkey(String containerkey) {
		this.containerkey = containerkey;
	}


	public String getSignatory() {
		return signatory;
	}


	public void setSignatory(String signatory) {
		this.signatory = signatory;
	}


	public String getPlaceofissue() {
		return placeofissue;
	}


	public void setPlaceofissue(String placeofissue) {
		this.placeofissue = placeofissue;
	}


	public double getOpenqty() {
		return openqty;
	}


	public void setOpenqty(double openqty) {
		this.openqty = openqty;
	}


	public String getForte_flag() {
		return forte_flag;
	}


	public void setForte_flag(String forte_flag) {
		this.forte_flag = forte_flag;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getEffectivedate() {
		return effectivedate;
	}


	public void setEffectivedate(Date effectivedate) {
		this.effectivedate = effectivedate;
	}


	public String getContainertype() {
		return containertype;
	}


	public void setContainertype(String containertype) {
		this.containertype = containertype;
	}


	public double getContainerqty() {
		return containerqty;
	}


	public void setContainerqty(double containerqty) {
		this.containerqty = containerqty;
	}


	public double getBilledcontainerqty() {
		return billedcontainerqty;
	}


	public void setBilledcontainerqty(double billedcontainerqty) {
		this.billedcontainerqty = billedcontainerqty;
	}


	public String getTransportationmode() {
		return transportationmode;
	}


	public void setTransportationmode(String transportationmode) {
		this.transportationmode = transportationmode;
	}


	public String getExternalreceiptkey2() {
		return externalreceiptkey2;
	}


	public void setExternalreceiptkey2(String externalreceiptkey2) {
		this.externalreceiptkey2 = externalreceiptkey2;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getRma() {
		return rma;
	}


	public void setRma(String rma) {
		this.rma = rma;
	}


	public Date getExpectedreceiptdate() {
		return expectedreceiptdate;
	}


	public void setExpectedreceiptdate(Date expectedreceiptdate) {
		this.expectedreceiptdate = expectedreceiptdate;
	}


	public String getAllowautoreceipt() {
		return allowautoreceipt;
	}


	public void setAllowautoreceipt(String allowautoreceipt) {
		this.allowautoreceipt = allowautoreceipt;
	}


	public Date getCloseddate() {
		return closeddate;
	}


	public void setCloseddate(Date closeddate) {
		this.closeddate = closeddate;
	}


	public String getTrackinventoryby() {
		return trackinventoryby;
	}


	public void setTrackinventoryby(String trackinventoryby) {
		this.trackinventoryby = trackinventoryby;
	}


	public String getCarriercountry() {
		return carriercountry;
	}


	public void setCarriercountry(String carriercountry) {
		this.carriercountry = carriercountry;
	}


	public String getCarrierphone() {
		return carrierphone;
	}


	public void setCarrierphone(String carrierphone) {
		this.carrierphone = carrierphone;
	}


	public String getDrivername() {
		return drivername;
	}


	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}


	public String getTrailernumber() {
		return trailernumber;
	}


	public void setTrailernumber(String trailernumber) {
		this.trailernumber = trailernumber;
	}


	public String getTrailerowner() {
		return trailerowner;
	}


	public void setTrailerowner(String trailerowner) {
		this.trailerowner = trailerowner;
	}


	public String getTrailertype() {
		return trailertype;
	}


	public void setTrailertype(String trailertype) {
		this.trailertype = trailertype;
	}


	public Date getArrivaldatetime() {
		return arrivaldatetime;
	}


	public void setArrivaldatetime(Date arrivaldatetime) {
		this.arrivaldatetime = arrivaldatetime;
	}


	public String getLottablematchrequired() {
		return lottablematchrequired;
	}


	public void setLottablematchrequired(String lottablematchrequired) {
		this.lottablematchrequired = lottablematchrequired;
	}


	public String getAdvicenumber() {
		return advicenumber;
	}


	public void setAdvicenumber(String advicenumber) {
		this.advicenumber = advicenumber;
	}


	public Date getAdvicedate() {
		return advicedate;
	}


	public void setAdvicedate(Date advicedate) {
		this.advicedate = advicedate;
	}


	public String getPackingslipnumber() {
		return packingslipnumber;
	}


	public void setPackingslipnumber(String packingslipnumber) {
		this.packingslipnumber = packingslipnumber;
	}


	public String getReceiptid() {
		return receiptid;
	}


	public void setReceiptid(String receiptid) {
		this.receiptid = receiptid;
	}


	public String getSuppliercode() {
		return suppliercode;
	}


	public void setSuppliercode(String suppliercode) {
		this.suppliercode = suppliercode;
	}


	public String getSuppliername() {
		return suppliername;
	}


	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}


	public String getShipfromaddressline1() {
		return shipfromaddressline1;
	}


	public void setShipfromaddressline1(String shipfromaddressline1) {
		this.shipfromaddressline1 = shipfromaddressline1;
	}


	public String getShipfromaddressline2() {
		return shipfromaddressline2;
	}


	public void setShipfromaddressline2(String shipfromaddressline2) {
		this.shipfromaddressline2 = shipfromaddressline2;
	}


	public String getShipfromaddressline3() {
		return shipfromaddressline3;
	}


	public void setShipfromaddressline3(String shipfromaddressline3) {
		this.shipfromaddressline3 = shipfromaddressline3;
	}


	public String getShipfromaddressline4() {
		return shipfromaddressline4;
	}


	public void setShipfromaddressline4(String shipfromaddressline4) {
		this.shipfromaddressline4 = shipfromaddressline4;
	}


	public String getShipfromcity() {
		return shipfromcity;
	}


	public void setShipfromcity(String shipfromcity) {
		this.shipfromcity = shipfromcity;
	}


	public String getShipfromstate() {
		return shipfromstate;
	}


	public void setShipfromstate(String shipfromstate) {
		this.shipfromstate = shipfromstate;
	}


	public String getShipfromzip() {
		return shipfromzip;
	}


	public void setShipfromzip(String shipfromzip) {
		this.shipfromzip = shipfromzip;
	}


	public String getShipfromisocountry() {
		return shipfromisocountry;
	}


	public void setShipfromisocountry(String shipfromisocountry) {
		this.shipfromisocountry = shipfromisocountry;
	}


	public String getShipfromcontact() {
		return shipfromcontact;
	}


	public void setShipfromcontact(String shipfromcontact) {
		this.shipfromcontact = shipfromcontact;
	}


	public String getShipfromphone() {
		return shipfromphone;
	}


	public void setShipfromphone(String shipfromphone) {
		this.shipfromphone = shipfromphone;
	}


	public String getShipfromemail() {
		return shipfromemail;
	}


	public void setShipfromemail(String shipfromemail) {
		this.shipfromemail = shipfromemail;
	}


	public Date getScheduledshipdate() {
		return scheduledshipdate;
	}


	public void setScheduledshipdate(Date scheduledshipdate) {
		this.scheduledshipdate = scheduledshipdate;
	}


	public Date getActualshipdate() {
		return actualshipdate;
	}


	public void setActualshipdate(Date actualshipdate) {
		this.actualshipdate = actualshipdate;
	}


	public double getGrossweight() {
		return grossweight;
	}


	public void setGrossweight(double grossweight) {
		this.grossweight = grossweight;
	}


	public double getTotalvolume() {
		return totalvolume;
	}


	public void setTotalvolume(double totalvolume) {
		this.totalvolume = totalvolume;
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


	public String getDoor() {
		return door;
	}


	public void setDoor(String door) {
		this.door = door;
	}


	public String getAppointmentkey() {
		return appointmentkey;
	}


	public void setAppointmentkey(String appointmentkey) {
		this.appointmentkey = appointmentkey;
	}


	public String getReferenceaccountingentity() {
		return referenceaccountingentity;
	}


	public void setReferenceaccountingentity(String referenceaccountingentity) {
		this.referenceaccountingentity = referenceaccountingentity;
	}


	public Date getEarliestshipdate() {
		return earliestshipdate;
	}


	public void setEarliestshipdate(Date earliestshipdate) {
		this.earliestshipdate = earliestshipdate;
	}


	public Date getRequiredshipdate() {
		return requiredshipdate;
	}


	public void setRequiredshipdate(Date requiredshipdate) {
		this.requiredshipdate = requiredshipdate;
	}


	public Date getPromisedshipdate() {
		return promisedshipdate;
	}


	public void setPromisedshipdate(Date promisedshipdate) {
		this.promisedshipdate = promisedshipdate;
	}


	public Date getPlannedshipdate() {
		return plannedshipdate;
	}


	public void setPlannedshipdate(Date plannedshipdate) {
		this.plannedshipdate = plannedshipdate;
	}


	public Date getEarliestdeliverydate() {
		return earliestdeliverydate;
	}


	public void setEarliestdeliverydate(Date earliestdeliverydate) {
		this.earliestdeliverydate = earliestdeliverydate;
	}


	public Date getRequireddeliverydate() {
		return requireddeliverydate;
	}


	public void setRequireddeliverydate(Date requireddeliverydate) {
		this.requireddeliverydate = requireddeliverydate;
	}


	public Date getPromiseddeliverydate() {
		return promiseddeliverydate;
	}


	public void setPromiseddeliverydate(Date promiseddeliverydate) {
		this.promiseddeliverydate = promiseddeliverydate;
	}


	public Date getPlanneddeliverydate() {
		return planneddeliverydate;
	}


	public void setPlanneddeliverydate(Date planneddeliverydate) {
		this.planneddeliverydate = planneddeliverydate;
	}


	public String getShipfromaddressline5() {
		return shipfromaddressline5;
	}


	public void setShipfromaddressline5(String shipfromaddressline5) {
		this.shipfromaddressline5 = shipfromaddressline5;
	}


	public String getShipfromaddressline6() {
		return shipfromaddressline6;
	}


	public void setShipfromaddressline6(String shipfromaddressline6) {
		this.shipfromaddressline6 = shipfromaddressline6;
	}


	public String getReturnfromparty() {
		return returnfromparty;
	}


	public void setReturnfromparty(String returnfromparty) {
		this.returnfromparty = returnfromparty;
	}


	public double getTemperature() {
		return temperature;
	}


	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}


	public String getTrailerkey() {
		return trailerkey;
	}


	public void setTrailerkey(String trailerkey) {
		this.trailerkey = trailerkey;
	}


	public String getTransportationstatus() {
		return transportationstatus;
	}


	public void setTransportationstatus(String transportationstatus) {
		this.transportationstatus = transportationstatus;
	}


	public Date getVerifiedcloseddate() {
		return verifiedcloseddate;
	}


	public void setVerifiedcloseddate(Date verifiedcloseddate) {
		this.verifiedcloseddate = verifiedcloseddate;
	}


	public Date getActualdeparturedate() {
		return actualdeparturedate;
	}


	public void setActualdeparturedate(Date actualdeparturedate) {
		this.actualdeparturedate = actualdeparturedate;
	}


	public String getTransportationservice() {
		return transportationservice;
	}


	public void setTransportationservice(String transportationservice) {
		this.transportationservice = transportationservice;
	}


	public String getPronumber() {
		return pronumber;
	}


	public void setPronumber(String pronumber) {
		this.pronumber = pronumber;
	}


	public double getFreightchargebaseamount() {
		return freightchargebaseamount;
	}


	public void setFreightchargebaseamount(double freightchargebaseamount) {
		this.freightchargebaseamount = freightchargebaseamount;
	}


	public double getFreightchargeamount() {
		return freightchargeamount;
	}


	public void setFreightchargeamount(double freightchargeamount) {
		this.freightchargeamount = freightchargeamount;
	}


	public String getTmfreightchargecurrency() {
		return tmfreightchargecurrency;
	}


	public void setTmfreightchargecurrency(String tmfreightchargecurrency) {
		this.tmfreightchargecurrency = tmfreightchargecurrency;
	}


	public double getFreightcostbaseamount() {
		return freightcostbaseamount;
	}


	public void setFreightcostbaseamount(double freightcostbaseamount) {
		this.freightcostbaseamount = freightcostbaseamount;
	}


	public double getFreightcostamount() {
		return freightcostamount;
	}


	public void setFreightcostamount(double freightcostamount) {
		this.freightcostamount = freightcostamount;
	}


	public String getTmfreightcostcurrency() {
		return tmfreightcostcurrency;
	}


	public void setTmfreightcostcurrency(String tmfreightcostcurrency) {
		this.tmfreightcostcurrency = tmfreightcostcurrency;
	}


	public String getCarrierroutestatus() {
		return carrierroutestatus;
	}


	public void setCarrierroutestatus(String carrierroutestatus) {
		this.carrierroutestatus = carrierroutestatus;
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


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public String getReturnlots() {
		return returnlots;
	}


	public void setReturnlots(String returnlots) {
		this.returnlots = returnlots;
	}


	public String getConsigneekey() {
		return consigneekey;
	}


	public void setConsigneekey(String consigneekey) {
		this.consigneekey = consigneekey;
	}


	public String getProductionstatus() {
		return productionstatus;
	}


	public void setProductionstatus(String productionstatus) {
		this.productionstatus = productionstatus;
	}


	public String getExpectedrceiptdate() {
		return expectedrceiptdate;
	}


	public void setExpectedrceiptdate(String expectedrceiptdate) {
		this.expectedrceiptdate = expectedrceiptdate;
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


	public String getCreatedate() {
		return createdate;
	}


	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getExternpokey() {
		return externpokey;
	}


	public void setExternpokey(String externpokey) {
		this.externpokey = externpokey;
	}


	public String getExternalpokey2() {
		return externalpokey2;
	}


	public void setExternalpokey2(String externalpokey2) {
		this.externalpokey2 = externalpokey2;
	}


	public List<ReceiptDetailEntity> getDetails() {
		return details;
	}


	public void setDetails(List<ReceiptDetailEntity> details) {
		this.details = details;
	}
}
