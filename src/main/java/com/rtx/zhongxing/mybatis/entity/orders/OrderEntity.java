package com.rtx.zhongxing.mybatis.entity.orders;

import java.util.Date;
import java.util.List;

import com.rtx.zhongxing.annotation.mybatisHelp.RTXMybatisTableHelp;

@RTXMybatisTableHelp(tablename = "orders")
public class OrderEntity {
	
	protected String serialkey;
	protected String whseid;
	protected String orderkey;
	protected String storerkey;
	protected String externorderkey;
	protected Date orderdate;
	protected Date deliverydate;
	protected String priority;
	protected String consigneekey;
	protected String c_contact1;
	protected String c_contact2;
	protected String c_company;
	protected String c_address1;
	protected String c_address2;
	protected String c_address3;
	protected String c_address4;
	protected String c_city;
	protected String c_state;
	protected String c_zip;
	protected String c_country;
	protected String c_isocntrycode;
	protected String c_phone1;
	protected String c_phone2;
	protected String c_fax1;
	protected String c_fax2;
	protected String c_vat;
	protected String buyerpo;
	protected String billtokey;
	protected String b_contact1;
	protected String b_contact2;
	protected String b_company;
	protected String b_address1;
	protected String b_address2;
	protected String b_address3;
	protected String b_address4;
	protected String b_city;
	protected String b_state;
	protected String b_zip;
	protected String b_country;
	protected String b_isocntrycode;
	protected String b_phone1;
	protected String b_phone2;
	protected String b_fax1;
	protected String b_fax2;
	protected String b_vat;
	protected String incoterm;
	protected String pmtterm;
	protected String door;
	protected String sortationlocation;
	protected String batchflag;
	protected String bulkcartongroup;
	protected String route;
	protected double stop;
	protected double openqty;
	protected String status;
	protected String dischargeplace;
	protected String deliveryplace;
	protected String intermodalvehicle;
	protected String countryoforigin;
	protected String countrydestination;
	protected String updatesource;
	protected String type;
	protected String ordergroup;
	protected Date effectivedate;
	protected String stage;
	protected String dc_id;
	protected String whse_id;
	protected String split_orders;
	protected String appt_status;
	protected String cheppalletindicator;
	protected String containertype;
	protected double containerqty;
	protected double billedcontainerqty;
	protected String transportationmode;
	protected String transportationservice;
	protected String externalorderkey2;
	protected String c_email1;
	protected String c_email2;
	protected String susr1;
	protected String susr2;
	protected String susr3;
	protected String susr4;
	protected String susr5;
	protected String notes2;
	protected double item_number;
	protected String forte_flag;
	protected String loadid;
	protected String shiptogether;
	protected Date deliverydate2;
	protected Date requestedshipdate;
	protected Date actualshipdate;
	protected Date deliver_date;
	protected double ordervalue;
	protected String ohtype;
	protected String externalloadid;
	protected double destinationnestid;
	protected String referencenum;
	protected String intransitkey;
	protected String receiptkey;
	protected String caselabeltype;
	protected String labelname;
	protected String stdsscclabelname;
	protected String stdgtinlabelname;
	protected String rfidsscclabelname;
	protected String rfidgtinlabelname;
	protected String rfidflag;
	protected String carriercode;
	protected String carriername;
	protected String carrieraddress1;
	protected String carrieraddress2;
	protected String carriercity;
	protected String carrierstate;
	protected String carrierzip;
	protected String carriercountry;
	protected String carrierphone;
	protected String drivername;
	protected String trailernumber;
	protected String trailerowner;
	protected String trailertype;
	protected Date depdatetime;
	protected String orderbreak;
	protected String allocatedonerp;
	protected String tradingpartner;
	protected String pronumber;
	protected String enablepacking;
	protected String packinglocation;
	protected String ordersid;
	protected String suspendedindicator;
	protected String picklistreportid;
	protected String packinglistreportid;
	protected String sourceversion;
	protected String referencetype;
	protected String referencedocument;
	protected String referencelocation;
	protected String referenceversion;
	protected double freightchargeamount;
	protected double freightcostamount;
	protected String appointmentkey;
	protected double allowoverpick;
	protected double totalqty;
	protected double totalgrosswgt;
	protected double totalcube;
	protected double totalorderlines;
	protected String referenceaccountingentity;
	protected String pokey;
	protected String apportion;
	protected String containerid;
	protected Date promisedshipdate;
	protected Date plannedshipdate;
	protected Date scheduledshipdate;
	protected Date promiseddelvdate;
	protected Date planneddelvdate;
	protected Date scheduleddelvdate;
	protected Date actualdelvdate;
	protected Date earliestshipdate;
	protected Date earliestdeliverydate;
	protected String carrierroutedocument;
	protected String carrierrouteaccountingentity;
	protected String carrierroutelocation;
	protected String carrierrouteversion;
	protected String tmhouseairwaybillnumber;
	protected String tmmasterairwaybillnumber;
	protected String tmbookingnumber;
	protected String tmhouseoceanbolnumber;
	protected String tmmasteroceanbolnumber;
	protected String tmequipmentnumber;
	protected String tmsealnumber;
	protected String tmlicenseplatenumber;
	protected String tmequipmenttype;
	protected String tmequipmentlength;
	protected String tmequipmentattribute;
	protected String tmairservicelevel;
	protected String tmoceanservicelevel;
	protected String tmoceantariffservice;
	protected String tmportofloading;
	protected String tmportofdischarge;
	protected String tmroutedvia;
	protected String tmserviceattribute;
	protected String tmfreightcostcurrency;
	protected String tmfreightchargecurrency;
	protected Date actualarrivaldate;
	protected String c_address5;
	protected String c_address6;
	protected String b_address5;
	protected String b_address6;
	protected String returntoparty;
	protected String trailerkey;
	protected String carrierroutestatus;
	protected String splitshipmentindicator;
	protected String splitshipmentoriginalorderkey;
	protected String splitshipmentfinalshipment;
	protected String bodapplicationarea;
	protected double freightcostbaseamount;
	protected double freightchargebaseamount;
	protected String packingvaltemplate;
	protected String packnotes;
	protected double totalroutes;
	protected String autodoorassigned;
	protected String autostageassigned;
	protected String autopackassigned;
	protected String autodockassignedhow;
	protected String autodockassignedset;
	protected double autodockassignedstep;
	protected Date autodockassigntime;
	protected double totalpalletestimate;
	protected String requireorderclose;
	protected String notes;
	protected String spsapistrategykey;
	protected String bolnumber;
	protected String bolprinted;
	protected String shiptogroup;
	protected String batchordernumber;
	protected String hostprocessrequired;
	protected Date adddate;
	protected String addwho;
	protected Date editdate;
	protected String editwho;
	protected String expresskey;
	protected String taskgroup;
	protected String rtxwxseqnum;
	protected String default20;
	protected String default30;
	protected String cancelwho;
	protected Date canceldate;
	protected String invoicemark;
	protected String warrantycard;
	protected String rfexec;
	protected String partship;
	protected String invoicein;
	protected double codfee;
	protected String cancelmark;
	protected String reason;
	protected String default1;
	protected String default2;
	protected String default3;
	protected double default4;
	protected double default5;
	protected double default6;
	protected double default7;
	protected double default8;
	protected String default9;
	protected String default10;
	protected String default11;
	protected String default12;
	protected String default13;
	protected String default14;
	protected double default15;
	protected String default16;
	protected String default17;
	protected String default18;
	protected String default19;
	protected String default21;
	protected String default22;
	protected String default23;
	protected String default24;
	protected String default25;
	protected String default26;
	protected String default27;
	protected String default28;
	protected String default29;
	protected String default31;
	protected String default32;
	protected String default33;
	protected String default34;
	protected String default35;
	protected String default36;
	protected String default37;
	protected String default38;
	protected String rtxdeletemark;
	protected String codouterorder;
	protected String codbilltype;
	protected String codtargetwarehouse;
	protected String codsendwarehouse;
	protected String codshopwarehouse;
	protected String codexpresscompany;
	protected String codsendtime;
	protected String codsendcity;
	protected double codbarginprice;
	protected String codshopnum;
	protected Date codordertime;
	protected String codrejectwarehouse;
	protected String codconsigneeaddr;
	protected String codwaybillnumber;
	protected String codremark;
	protected String pbbusinesstype;
	protected String pbcustomertype;
	protected String cancelcomplete;
	protected String cancelreason;
	protected String outerid;
	protected String amz_customerordernumber;
	protected String amz_trackingid;
	protected double amz_deliveryfee;
	protected double amz_discount;
	protected double amz_totalmoney;
	protected double amz_cardpay;
	protected double amz_payment;
	protected double amz_accountspay;
	protected String amz_zpl;
	protected String amz_warehouse;
	protected Date amz_ordertime;
	protected String default39;
	protected String default40;
	protected String default41;
	protected String default42;
	protected String default43;
	protected String default44;
	protected String default45;
	protected String default46;
	protected String agencyfund;
	protected String shortaddress;
	protected String packagecentername;
	protected String printkeyword;
	protected String packagecentercode;
	protected String rtxsapordertype;

	private List<OrderDetailEntity> details;

	public String getExternorderkey() {
		return externorderkey;
	}

	public void setExternorderkey(String externorderkey) {
		this.externorderkey = externorderkey;
	}

	public String getOrderkey() {
		return orderkey;
	}

	public void setOrderkey(String orderkey) {
		this.orderkey = orderkey;
	}

	public String getWhseid() {
		return whseid;
	}

	public void setWhseid(String whseid) {
		this.whseid = whseid;
	}

	public List<OrderDetailEntity> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetailEntity> details) {
		this.details = details;
	}

	public String getSerialkey() {
		return serialkey;
	}

	public void setSerialkey(String serialkey) {
		this.serialkey = serialkey;
	}

	public String getStorerkey() {
		return storerkey;
	}

	public void setStorerkey(String storerkey) {
		this.storerkey = storerkey;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public Date getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getConsigneekey() {
		return consigneekey;
	}

	public void setConsigneekey(String consigneekey) {
		this.consigneekey = consigneekey;
	}

	public String getC_contact1() {
		return c_contact1;
	}

	public void setC_contact1(String c_contact1) {
		this.c_contact1 = c_contact1;
	}

	public String getC_contact2() {
		return c_contact2;
	}

	public void setC_contact2(String c_contact2) {
		this.c_contact2 = c_contact2;
	}

	public String getC_company() {
		return c_company;
	}

	public void setC_company(String c_company) {
		this.c_company = c_company;
	}

	public String getC_address1() {
		return c_address1;
	}

	public void setC_address1(String c_address1) {
		this.c_address1 = c_address1;
	}

	public String getC_address2() {
		return c_address2;
	}

	public void setC_address2(String c_address2) {
		this.c_address2 = c_address2;
	}

	public String getC_address3() {
		return c_address3;
	}

	public void setC_address3(String c_address3) {
		this.c_address3 = c_address3;
	}

	public String getC_address4() {
		return c_address4;
	}

	public void setC_address4(String c_address4) {
		this.c_address4 = c_address4;
	}

	public String getC_city() {
		return c_city;
	}

	public void setC_city(String c_city) {
		this.c_city = c_city;
	}

	public String getC_state() {
		return c_state;
	}

	public void setC_state(String c_state) {
		this.c_state = c_state;
	}

	public String getC_zip() {
		return c_zip;
	}

	public void setC_zip(String c_zip) {
		this.c_zip = c_zip;
	}

	public String getC_country() {
		return c_country;
	}

	public void setC_country(String c_country) {
		this.c_country = c_country;
	}

	public String getC_isocntrycode() {
		return c_isocntrycode;
	}

	public void setC_isocntrycode(String c_isocntrycode) {
		this.c_isocntrycode = c_isocntrycode;
	}

	public String getC_phone1() {
		return c_phone1;
	}

	public void setC_phone1(String c_phone1) {
		this.c_phone1 = c_phone1;
	}

	public String getC_phone2() {
		return c_phone2;
	}

	public void setC_phone2(String c_phone2) {
		this.c_phone2 = c_phone2;
	}

	public String getC_fax1() {
		return c_fax1;
	}

	public void setC_fax1(String c_fax1) {
		this.c_fax1 = c_fax1;
	}

	public String getC_fax2() {
		return c_fax2;
	}

	public void setC_fax2(String c_fax2) {
		this.c_fax2 = c_fax2;
	}

	public String getC_vat() {
		return c_vat;
	}

	public void setC_vat(String c_vat) {
		this.c_vat = c_vat;
	}

	public String getBuyerpo() {
		return buyerpo;
	}

	public void setBuyerpo(String buyerpo) {
		this.buyerpo = buyerpo;
	}

	public String getBilltokey() {
		return billtokey;
	}

	public void setBilltokey(String billtokey) {
		this.billtokey = billtokey;
	}

	public String getB_contact1() {
		return b_contact1;
	}

	public void setB_contact1(String b_contact1) {
		this.b_contact1 = b_contact1;
	}

	public String getB_contact2() {
		return b_contact2;
	}

	public void setB_contact2(String b_contact2) {
		this.b_contact2 = b_contact2;
	}

	public String getB_company() {
		return b_company;
	}

	public void setB_company(String b_company) {
		this.b_company = b_company;
	}

	public String getB_address1() {
		return b_address1;
	}

	public void setB_address1(String b_address1) {
		this.b_address1 = b_address1;
	}

	public String getB_address2() {
		return b_address2;
	}

	public void setB_address2(String b_address2) {
		this.b_address2 = b_address2;
	}

	public String getB_address3() {
		return b_address3;
	}

	public void setB_address3(String b_address3) {
		this.b_address3 = b_address3;
	}

	public String getB_address4() {
		return b_address4;
	}

	public void setB_address4(String b_address4) {
		this.b_address4 = b_address4;
	}

	public String getB_city() {
		return b_city;
	}

	public void setB_city(String b_city) {
		this.b_city = b_city;
	}

	public String getB_state() {
		return b_state;
	}

	public void setB_state(String b_state) {
		this.b_state = b_state;
	}

	public String getB_zip() {
		return b_zip;
	}

	public void setB_zip(String b_zip) {
		this.b_zip = b_zip;
	}

	public String getB_country() {
		return b_country;
	}

	public void setB_country(String b_country) {
		this.b_country = b_country;
	}

	public String getB_isocntrycode() {
		return b_isocntrycode;
	}

	public void setB_isocntrycode(String b_isocntrycode) {
		this.b_isocntrycode = b_isocntrycode;
	}

	public String getB_phone1() {
		return b_phone1;
	}

	public void setB_phone1(String b_phone1) {
		this.b_phone1 = b_phone1;
	}

	public String getB_phone2() {
		return b_phone2;
	}

	public void setB_phone2(String b_phone2) {
		this.b_phone2 = b_phone2;
	}

	public String getB_fax1() {
		return b_fax1;
	}

	public void setB_fax1(String b_fax1) {
		this.b_fax1 = b_fax1;
	}

	public String getB_fax2() {
		return b_fax2;
	}

	public void setB_fax2(String b_fax2) {
		this.b_fax2 = b_fax2;
	}

	public String getB_vat() {
		return b_vat;
	}

	public void setB_vat(String b_vat) {
		this.b_vat = b_vat;
	}

	public String getIncoterm() {
		return incoterm;
	}

	public void setIncoterm(String incoterm) {
		this.incoterm = incoterm;
	}

	public String getPmtterm() {
		return pmtterm;
	}

	public void setPmtterm(String pmtterm) {
		this.pmtterm = pmtterm;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getSortationlocation() {
		return sortationlocation;
	}

	public void setSortationlocation(String sortationlocation) {
		this.sortationlocation = sortationlocation;
	}

	public String getBatchflag() {
		return batchflag;
	}

	public void setBatchflag(String batchflag) {
		this.batchflag = batchflag;
	}

	public String getBulkcartongroup() {
		return bulkcartongroup;
	}

	public void setBulkcartongroup(String bulkcartongroup) {
		this.bulkcartongroup = bulkcartongroup;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public double getStop() {
		return stop;
	}

	public void setStop(double stop) {
		this.stop = stop;
	}

	public double getOpenqty() {
		return openqty;
	}

	public void setOpenqty(double openqty) {
		this.openqty = openqty;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDischargeplace() {
		return dischargeplace;
	}

	public void setDischargeplace(String dischargeplace) {
		this.dischargeplace = dischargeplace;
	}

	public String getDeliveryplace() {
		return deliveryplace;
	}

	public void setDeliveryplace(String deliveryplace) {
		this.deliveryplace = deliveryplace;
	}

	public String getIntermodalvehicle() {
		return intermodalvehicle;
	}

	public void setIntermodalvehicle(String intermodalvehicle) {
		this.intermodalvehicle = intermodalvehicle;
	}

	public String getCountryoforigin() {
		return countryoforigin;
	}

	public void setCountryoforigin(String countryoforigin) {
		this.countryoforigin = countryoforigin;
	}

	public String getCountrydestination() {
		return countrydestination;
	}

	public void setCountrydestination(String countrydestination) {
		this.countrydestination = countrydestination;
	}

	public String getUpdatesource() {
		return updatesource;
	}

	public void setUpdatesource(String updatesource) {
		this.updatesource = updatesource;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrdergroup() {
		return ordergroup;
	}

	public void setOrdergroup(String ordergroup) {
		this.ordergroup = ordergroup;
	}

	public Date getEffectivedate() {
		return effectivedate;
	}

	public void setEffectivedate(Date effectivedate) {
		this.effectivedate = effectivedate;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getDc_id() {
		return dc_id;
	}

	public void setDc_id(String dc_id) {
		this.dc_id = dc_id;
	}

	public String getWhse_id() {
		return whse_id;
	}

	public void setWhse_id(String whse_id) {
		this.whse_id = whse_id;
	}

	public String getSplit_orders() {
		return split_orders;
	}

	public void setSplit_orders(String split_orders) {
		this.split_orders = split_orders;
	}

	public String getAppt_status() {
		return appt_status;
	}

	public void setAppt_status(String appt_status) {
		this.appt_status = appt_status;
	}

	public String getCheppalletindicator() {
		return cheppalletindicator;
	}

	public void setCheppalletindicator(String cheppalletindicator) {
		this.cheppalletindicator = cheppalletindicator;
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

	public String getTransportationservice() {
		return transportationservice;
	}

	public void setTransportationservice(String transportationservice) {
		this.transportationservice = transportationservice;
	}

	public String getExternalorderkey2() {
		return externalorderkey2;
	}

	public void setExternalorderkey2(String externalorderkey2) {
		this.externalorderkey2 = externalorderkey2;
	}

	public String getC_email1() {
		return c_email1;
	}

	public void setC_email1(String c_email1) {
		this.c_email1 = c_email1;
	}

	public String getC_email2() {
		return c_email2;
	}

	public void setC_email2(String c_email2) {
		this.c_email2 = c_email2;
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

	public String getNotes2() {
		return notes2;
	}

	public void setNotes2(String notes2) {
		this.notes2 = notes2;
	}

	public double getItem_number() {
		return item_number;
	}

	public void setItem_number(double item_number) {
		this.item_number = item_number;
	}

	public String getForte_flag() {
		return forte_flag;
	}

	public void setForte_flag(String forte_flag) {
		this.forte_flag = forte_flag;
	}

	public String getLoadid() {
		return loadid;
	}

	public void setLoadid(String loadid) {
		this.loadid = loadid;
	}

	public String getShiptogether() {
		return shiptogether;
	}

	public void setShiptogether(String shiptogether) {
		this.shiptogether = shiptogether;
	}

	public Date getDeliverydate2() {
		return deliverydate2;
	}

	public void setDeliverydate2(Date deliverydate2) {
		this.deliverydate2 = deliverydate2;
	}

	public Date getRequestedshipdate() {
		return requestedshipdate;
	}

	public void setRequestedshipdate(Date requestedshipdate) {
		this.requestedshipdate = requestedshipdate;
	}

	public Date getActualshipdate() {
		return actualshipdate;
	}

	public void setActualshipdate(Date actualshipdate) {
		this.actualshipdate = actualshipdate;
	}

	public Date getDeliver_date() {
		return deliver_date;
	}

	public void setDeliver_date(Date deliver_date) {
		this.deliver_date = deliver_date;
	}

	public double getOrdervalue() {
		return ordervalue;
	}

	public void setOrdervalue(double ordervalue) {
		this.ordervalue = ordervalue;
	}

	public String getOhtype() {
		return ohtype;
	}

	public void setOhtype(String ohtype) {
		this.ohtype = ohtype;
	}

	public String getExternalloadid() {
		return externalloadid;
	}

	public void setExternalloadid(String externalloadid) {
		this.externalloadid = externalloadid;
	}

	public double getDestinationnestid() {
		return destinationnestid;
	}

	public void setDestinationnestid(double destinationnestid) {
		this.destinationnestid = destinationnestid;
	}

	public String getReferencenum() {
		return referencenum;
	}

	public void setReferencenum(String referencenum) {
		this.referencenum = referencenum;
	}

	public String getIntransitkey() {
		return intransitkey;
	}

	public void setIntransitkey(String intransitkey) {
		this.intransitkey = intransitkey;
	}

	public String getReceiptkey() {
		return receiptkey;
	}

	public void setReceiptkey(String receiptkey) {
		this.receiptkey = receiptkey;
	}

	public String getCaselabeltype() {
		return caselabeltype;
	}

	public void setCaselabeltype(String caselabeltype) {
		this.caselabeltype = caselabeltype;
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

	public String getRfidflag() {
		return rfidflag;
	}

	public void setRfidflag(String rfidflag) {
		this.rfidflag = rfidflag;
	}

	public String getCarriercode() {
		return carriercode;
	}

	public void setCarriercode(String carriercode) {
		this.carriercode = carriercode;
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

	public Date getDepdatetime() {
		return depdatetime;
	}

	public void setDepdatetime(Date depdatetime) {
		this.depdatetime = depdatetime;
	}

	public String getOrderbreak() {
		return orderbreak;
	}

	public void setOrderbreak(String orderbreak) {
		this.orderbreak = orderbreak;
	}

	public String getAllocatedonerp() {
		return allocatedonerp;
	}

	public void setAllocatedonerp(String allocatedonerp) {
		this.allocatedonerp = allocatedonerp;
	}

	public String getTradingpartner() {
		return tradingpartner;
	}

	public void setTradingpartner(String tradingpartner) {
		this.tradingpartner = tradingpartner;
	}

	public String getPronumber() {
		return pronumber;
	}

	public void setPronumber(String pronumber) {
		this.pronumber = pronumber;
	}

	public String getEnablepacking() {
		return enablepacking;
	}

	public void setEnablepacking(String enablepacking) {
		this.enablepacking = enablepacking;
	}

	public String getPackinglocation() {
		return packinglocation;
	}

	public void setPackinglocation(String packinglocation) {
		this.packinglocation = packinglocation;
	}

	public String getOrdersid() {
		return ordersid;
	}

	public void setOrdersid(String ordersid) {
		this.ordersid = ordersid;
	}

	public String getSuspendedindicator() {
		return suspendedindicator;
	}

	public void setSuspendedindicator(String suspendedindicator) {
		this.suspendedindicator = suspendedindicator;
	}

	public String getPicklistreportid() {
		return picklistreportid;
	}

	public void setPicklistreportid(String picklistreportid) {
		this.picklistreportid = picklistreportid;
	}

	public String getPackinglistreportid() {
		return packinglistreportid;
	}

	public void setPackinglistreportid(String packinglistreportid) {
		this.packinglistreportid = packinglistreportid;
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

	public double getFreightchargeamount() {
		return freightchargeamount;
	}

	public void setFreightchargeamount(double freightchargeamount) {
		this.freightchargeamount = freightchargeamount;
	}

	public double getFreightcostamount() {
		return freightcostamount;
	}

	public void setFreightcostamount(double freightcostamount) {
		this.freightcostamount = freightcostamount;
	}

	public String getAppointmentkey() {
		return appointmentkey;
	}

	public void setAppointmentkey(String appointmentkey) {
		this.appointmentkey = appointmentkey;
	}

	public double getAllowoverpick() {
		return allowoverpick;
	}

	public void setAllowoverpick(double allowoverpick) {
		this.allowoverpick = allowoverpick;
	}

	public double getTotalqty() {
		return totalqty;
	}

	public void setTotalqty(double totalqty) {
		this.totalqty = totalqty;
	}

	public double getTotalgrosswgt() {
		return totalgrosswgt;
	}

	public void setTotalgrosswgt(double totalgrosswgt) {
		this.totalgrosswgt = totalgrosswgt;
	}

	public double getTotalcube() {
		return totalcube;
	}

	public void setTotalcube(double totalcube) {
		this.totalcube = totalcube;
	}

	public double getTotalorderlines() {
		return totalorderlines;
	}

	public void setTotalorderlines(double totalorderlines) {
		this.totalorderlines = totalorderlines;
	}

	public String getReferenceaccountingentity() {
		return referenceaccountingentity;
	}

	public void setReferenceaccountingentity(String referenceaccountingentity) {
		this.referenceaccountingentity = referenceaccountingentity;
	}

	public String getPokey() {
		return pokey;
	}

	public void setPokey(String pokey) {
		this.pokey = pokey;
	}

	public String getApportion() {
		return apportion;
	}

	public void setApportion(String apportion) {
		this.apportion = apportion;
	}

	public String getContainerid() {
		return containerid;
	}

	public void setContainerid(String containerid) {
		this.containerid = containerid;
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

	public Date getScheduledshipdate() {
		return scheduledshipdate;
	}

	public void setScheduledshipdate(Date scheduledshipdate) {
		this.scheduledshipdate = scheduledshipdate;
	}

	public Date getPromiseddelvdate() {
		return promiseddelvdate;
	}

	public void setPromiseddelvdate(Date promiseddelvdate) {
		this.promiseddelvdate = promiseddelvdate;
	}

	public Date getPlanneddelvdate() {
		return planneddelvdate;
	}

	public void setPlanneddelvdate(Date planneddelvdate) {
		this.planneddelvdate = planneddelvdate;
	}

	public Date getScheduleddelvdate() {
		return scheduleddelvdate;
	}

	public void setScheduleddelvdate(Date scheduleddelvdate) {
		this.scheduleddelvdate = scheduleddelvdate;
	}

	public Date getActualdelvdate() {
		return actualdelvdate;
	}

	public void setActualdelvdate(Date actualdelvdate) {
		this.actualdelvdate = actualdelvdate;
	}

	public Date getEarliestshipdate() {
		return earliestshipdate;
	}

	public void setEarliestshipdate(Date earliestshipdate) {
		this.earliestshipdate = earliestshipdate;
	}

	public Date getEarliestdeliverydate() {
		return earliestdeliverydate;
	}

	public void setEarliestdeliverydate(Date earliestdeliverydate) {
		this.earliestdeliverydate = earliestdeliverydate;
	}

	public String getCarrierroutedocument() {
		return carrierroutedocument;
	}

	public void setCarrierroutedocument(String carrierroutedocument) {
		this.carrierroutedocument = carrierroutedocument;
	}

	public String getCarrierrouteaccountingentity() {
		return carrierrouteaccountingentity;
	}

	public void setCarrierrouteaccountingentity(String carrierrouteaccountingentity) {
		this.carrierrouteaccountingentity = carrierrouteaccountingentity;
	}

	public String getCarrierroutelocation() {
		return carrierroutelocation;
	}

	public void setCarrierroutelocation(String carrierroutelocation) {
		this.carrierroutelocation = carrierroutelocation;
	}

	public String getCarrierrouteversion() {
		return carrierrouteversion;
	}

	public void setCarrierrouteversion(String carrierrouteversion) {
		this.carrierrouteversion = carrierrouteversion;
	}

	public String getTmhouseairwaybillnumber() {
		return tmhouseairwaybillnumber;
	}

	public void setTmhouseairwaybillnumber(String tmhouseairwaybillnumber) {
		this.tmhouseairwaybillnumber = tmhouseairwaybillnumber;
	}

	public String getTmmasterairwaybillnumber() {
		return tmmasterairwaybillnumber;
	}

	public void setTmmasterairwaybillnumber(String tmmasterairwaybillnumber) {
		this.tmmasterairwaybillnumber = tmmasterairwaybillnumber;
	}

	public String getTmbookingnumber() {
		return tmbookingnumber;
	}

	public void setTmbookingnumber(String tmbookingnumber) {
		this.tmbookingnumber = tmbookingnumber;
	}

	public String getTmhouseoceanbolnumber() {
		return tmhouseoceanbolnumber;
	}

	public void setTmhouseoceanbolnumber(String tmhouseoceanbolnumber) {
		this.tmhouseoceanbolnumber = tmhouseoceanbolnumber;
	}

	public String getTmmasteroceanbolnumber() {
		return tmmasteroceanbolnumber;
	}

	public void setTmmasteroceanbolnumber(String tmmasteroceanbolnumber) {
		this.tmmasteroceanbolnumber = tmmasteroceanbolnumber;
	}

	public String getTmequipmentnumber() {
		return tmequipmentnumber;
	}

	public void setTmequipmentnumber(String tmequipmentnumber) {
		this.tmequipmentnumber = tmequipmentnumber;
	}

	public String getTmsealnumber() {
		return tmsealnumber;
	}

	public void setTmsealnumber(String tmsealnumber) {
		this.tmsealnumber = tmsealnumber;
	}

	public String getTmlicenseplatenumber() {
		return tmlicenseplatenumber;
	}

	public void setTmlicenseplatenumber(String tmlicenseplatenumber) {
		this.tmlicenseplatenumber = tmlicenseplatenumber;
	}

	public String getTmequipmenttype() {
		return tmequipmenttype;
	}

	public void setTmequipmenttype(String tmequipmenttype) {
		this.tmequipmenttype = tmequipmenttype;
	}

	public String getTmequipmentlength() {
		return tmequipmentlength;
	}

	public void setTmequipmentlength(String tmequipmentlength) {
		this.tmequipmentlength = tmequipmentlength;
	}

	public String getTmequipmentattribute() {
		return tmequipmentattribute;
	}

	public void setTmequipmentattribute(String tmequipmentattribute) {
		this.tmequipmentattribute = tmequipmentattribute;
	}

	public String getTmairservicelevel() {
		return tmairservicelevel;
	}

	public void setTmairservicelevel(String tmairservicelevel) {
		this.tmairservicelevel = tmairservicelevel;
	}

	public String getTmoceanservicelevel() {
		return tmoceanservicelevel;
	}

	public void setTmoceanservicelevel(String tmoceanservicelevel) {
		this.tmoceanservicelevel = tmoceanservicelevel;
	}

	public String getTmoceantariffservice() {
		return tmoceantariffservice;
	}

	public void setTmoceantariffservice(String tmoceantariffservice) {
		this.tmoceantariffservice = tmoceantariffservice;
	}

	public String getTmportofloading() {
		return tmportofloading;
	}

	public void setTmportofloading(String tmportofloading) {
		this.tmportofloading = tmportofloading;
	}

	public String getTmportofdischarge() {
		return tmportofdischarge;
	}

	public void setTmportofdischarge(String tmportofdischarge) {
		this.tmportofdischarge = tmportofdischarge;
	}

	public String getTmroutedvia() {
		return tmroutedvia;
	}

	public void setTmroutedvia(String tmroutedvia) {
		this.tmroutedvia = tmroutedvia;
	}

	public String getTmserviceattribute() {
		return tmserviceattribute;
	}

	public void setTmserviceattribute(String tmserviceattribute) {
		this.tmserviceattribute = tmserviceattribute;
	}

	public String getTmfreightcostcurrency() {
		return tmfreightcostcurrency;
	}

	public void setTmfreightcostcurrency(String tmfreightcostcurrency) {
		this.tmfreightcostcurrency = tmfreightcostcurrency;
	}

	public String getTmfreightchargecurrency() {
		return tmfreightchargecurrency;
	}

	public void setTmfreightchargecurrency(String tmfreightchargecurrency) {
		this.tmfreightchargecurrency = tmfreightchargecurrency;
	}

	public Date getActualarrivaldate() {
		return actualarrivaldate;
	}

	public void setActualarrivaldate(Date actualarrivaldate) {
		this.actualarrivaldate = actualarrivaldate;
	}

	public String getC_address5() {
		return c_address5;
	}

	public void setC_address5(String c_address5) {
		this.c_address5 = c_address5;
	}

	public String getC_address6() {
		return c_address6;
	}

	public void setC_address6(String c_address6) {
		this.c_address6 = c_address6;
	}

	public String getB_address5() {
		return b_address5;
	}

	public void setB_address5(String b_address5) {
		this.b_address5 = b_address5;
	}

	public String getB_address6() {
		return b_address6;
	}

	public void setB_address6(String b_address6) {
		this.b_address6 = b_address6;
	}

	public String getReturntoparty() {
		return returntoparty;
	}

	public void setReturntoparty(String returntoparty) {
		this.returntoparty = returntoparty;
	}

	public String getTrailerkey() {
		return trailerkey;
	}

	public void setTrailerkey(String trailerkey) {
		this.trailerkey = trailerkey;
	}

	public String getCarrierroutestatus() {
		return carrierroutestatus;
	}

	public void setCarrierroutestatus(String carrierroutestatus) {
		this.carrierroutestatus = carrierroutestatus;
	}

	public String getSplitshipmentindicator() {
		return splitshipmentindicator;
	}

	public void setSplitshipmentindicator(String splitshipmentindicator) {
		this.splitshipmentindicator = splitshipmentindicator;
	}

	public String getSplitshipmentoriginalorderkey() {
		return splitshipmentoriginalorderkey;
	}

	public void setSplitshipmentoriginalorderkey(String splitshipmentoriginalorderkey) {
		this.splitshipmentoriginalorderkey = splitshipmentoriginalorderkey;
	}

	public String getSplitshipmentfinalshipment() {
		return splitshipmentfinalshipment;
	}

	public void setSplitshipmentfinalshipment(String splitshipmentfinalshipment) {
		this.splitshipmentfinalshipment = splitshipmentfinalshipment;
	}

	public String getBodapplicationarea() {
		return bodapplicationarea;
	}

	public void setBodapplicationarea(String bodapplicationarea) {
		this.bodapplicationarea = bodapplicationarea;
	}

	public double getFreightcostbaseamount() {
		return freightcostbaseamount;
	}

	public void setFreightcostbaseamount(double freightcostbaseamount) {
		this.freightcostbaseamount = freightcostbaseamount;
	}

	public double getFreightchargebaseamount() {
		return freightchargebaseamount;
	}

	public void setFreightchargebaseamount(double freightchargebaseamount) {
		this.freightchargebaseamount = freightchargebaseamount;
	}

	public String getPackingvaltemplate() {
		return packingvaltemplate;
	}

	public void setPackingvaltemplate(String packingvaltemplate) {
		this.packingvaltemplate = packingvaltemplate;
	}

	public String getPacknotes() {
		return packnotes;
	}

	public void setPacknotes(String packnotes) {
		this.packnotes = packnotes;
	}

	public double getTotalroutes() {
		return totalroutes;
	}

	public void setTotalroutes(double totalroutes) {
		this.totalroutes = totalroutes;
	}

	public String getAutodoorassigned() {
		return autodoorassigned;
	}

	public void setAutodoorassigned(String autodoorassigned) {
		this.autodoorassigned = autodoorassigned;
	}

	public String getAutostageassigned() {
		return autostageassigned;
	}

	public void setAutostageassigned(String autostageassigned) {
		this.autostageassigned = autostageassigned;
	}

	public String getAutopackassigned() {
		return autopackassigned;
	}

	public void setAutopackassigned(String autopackassigned) {
		this.autopackassigned = autopackassigned;
	}

	public String getAutodockassignedhow() {
		return autodockassignedhow;
	}

	public void setAutodockassignedhow(String autodockassignedhow) {
		this.autodockassignedhow = autodockassignedhow;
	}

	public String getAutodockassignedset() {
		return autodockassignedset;
	}

	public void setAutodockassignedset(String autodockassignedset) {
		this.autodockassignedset = autodockassignedset;
	}

	public double getAutodockassignedstep() {
		return autodockassignedstep;
	}

	public void setAutodockassignedstep(double autodockassignedstep) {
		this.autodockassignedstep = autodockassignedstep;
	}

	public Date getAutodockassigntime() {
		return autodockassigntime;
	}

	public void setAutodockassigntime(Date autodockassigntime) {
		this.autodockassigntime = autodockassigntime;
	}

	public double getTotalpalletestimate() {
		return totalpalletestimate;
	}

	public void setTotalpalletestimate(double totalpalletestimate) {
		this.totalpalletestimate = totalpalletestimate;
	}

	public String getRequireorderclose() {
		return requireorderclose;
	}

	public void setRequireorderclose(String requireorderclose) {
		this.requireorderclose = requireorderclose;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getSpsapistrategykey() {
		return spsapistrategykey;
	}

	public void setSpsapistrategykey(String spsapistrategykey) {
		this.spsapistrategykey = spsapistrategykey;
	}

	public String getBolnumber() {
		return bolnumber;
	}

	public void setBolnumber(String bolnumber) {
		this.bolnumber = bolnumber;
	}

	public String getBolprinted() {
		return bolprinted;
	}

	public void setBolprinted(String bolprinted) {
		this.bolprinted = bolprinted;
	}

	public String getShiptogroup() {
		return shiptogroup;
	}

	public void setShiptogroup(String shiptogroup) {
		this.shiptogroup = shiptogroup;
	}

	public String getBatchordernumber() {
		return batchordernumber;
	}

	public void setBatchordernumber(String batchordernumber) {
		this.batchordernumber = batchordernumber;
	}

	public String getHostprocessrequired() {
		return hostprocessrequired;
	}

	public void setHostprocessrequired(String hostprocessrequired) {
		this.hostprocessrequired = hostprocessrequired;
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

	public String getExpresskey() {
		return expresskey;
	}

	public void setExpresskey(String expresskey) {
		this.expresskey = expresskey;
	}

	public String getTaskgroup() {
		return taskgroup;
	}

	public void setTaskgroup(String taskgroup) {
		this.taskgroup = taskgroup;
	}

	public String getRtxwxseqnum() {
		return rtxwxseqnum;
	}

	public void setRtxwxseqnum(String rtxwxseqnum) {
		this.rtxwxseqnum = rtxwxseqnum;
	}

	public String getDefault20() {
		return default20;
	}

	public void setDefault20(String default20) {
		this.default20 = default20;
	}

	public String getDefault30() {
		return default30;
	}

	public void setDefault30(String default30) {
		this.default30 = default30;
	}

	public String getCancelwho() {
		return cancelwho;
	}

	public void setCancelwho(String cancelwho) {
		this.cancelwho = cancelwho;
	}

	public Date getCanceldate() {
		return canceldate;
	}

	public void setCanceldate(Date canceldate) {
		this.canceldate = canceldate;
	}

	public String getInvoicemark() {
		return invoicemark;
	}

	public void setInvoicemark(String invoicemark) {
		this.invoicemark = invoicemark;
	}

	public String getWarrantycard() {
		return warrantycard;
	}

	public void setWarrantycard(String warrantycard) {
		this.warrantycard = warrantycard;
	}

	public String getRfexec() {
		return rfexec;
	}

	public void setRfexec(String rfexec) {
		this.rfexec = rfexec;
	}

	public String getPartship() {
		return partship;
	}

	public void setPartship(String partship) {
		this.partship = partship;
	}

	public String getInvoicein() {
		return invoicein;
	}

	public void setInvoicein(String invoicein) {
		this.invoicein = invoicein;
	}

	public double getCodfee() {
		return codfee;
	}

	public void setCodfee(double codfee) {
		this.codfee = codfee;
	}

	public String getCancelmark() {
		return cancelmark;
	}

	public void setCancelmark(String cancelmark) {
		this.cancelmark = cancelmark;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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

	public double getDefault4() {
		return default4;
	}

	public void setDefault4(double default4) {
		this.default4 = default4;
	}

	public double getDefault5() {
		return default5;
	}

	public void setDefault5(double default5) {
		this.default5 = default5;
	}

	public double getDefault6() {
		return default6;
	}

	public void setDefault6(double default6) {
		this.default6 = default6;
	}

	public double getDefault7() {
		return default7;
	}

	public void setDefault7(double default7) {
		this.default7 = default7;
	}

	public double getDefault8() {
		return default8;
	}

	public void setDefault8(double default8) {
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

	public double getDefault15() {
		return default15;
	}

	public void setDefault15(double default15) {
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

	public String getRtxdeletemark() {
		return rtxdeletemark;
	}

	public void setRtxdeletemark(String rtxdeletemark) {
		this.rtxdeletemark = rtxdeletemark;
	}

	public String getCodouterorder() {
		return codouterorder;
	}

	public void setCodouterorder(String codouterorder) {
		this.codouterorder = codouterorder;
	}

	public String getCodbilltype() {
		return codbilltype;
	}

	public void setCodbilltype(String codbilltype) {
		this.codbilltype = codbilltype;
	}

	public String getCodtargetwarehouse() {
		return codtargetwarehouse;
	}

	public void setCodtargetwarehouse(String codtargetwarehouse) {
		this.codtargetwarehouse = codtargetwarehouse;
	}

	public String getCodsendwarehouse() {
		return codsendwarehouse;
	}

	public void setCodsendwarehouse(String codsendwarehouse) {
		this.codsendwarehouse = codsendwarehouse;
	}

	public String getCodshopwarehouse() {
		return codshopwarehouse;
	}

	public void setCodshopwarehouse(String codshopwarehouse) {
		this.codshopwarehouse = codshopwarehouse;
	}

	public String getCodexpresscompany() {
		return codexpresscompany;
	}

	public void setCodexpresscompany(String codexpresscompany) {
		this.codexpresscompany = codexpresscompany;
	}

	public String getCodsendtime() {
		return codsendtime;
	}

	public void setCodsendtime(String codsendtime) {
		this.codsendtime = codsendtime;
	}

	public String getCodsendcity() {
		return codsendcity;
	}

	public void setCodsendcity(String codsendcity) {
		this.codsendcity = codsendcity;
	}

	public double getCodbarginprice() {
		return codbarginprice;
	}

	public void setCodbarginprice(double codbarginprice) {
		this.codbarginprice = codbarginprice;
	}

	public String getCodshopnum() {
		return codshopnum;
	}

	public void setCodshopnum(String codshopnum) {
		this.codshopnum = codshopnum;
	}

	public Date getCodordertime() {
		return codordertime;
	}

	public void setCodordertime(Date codordertime) {
		this.codordertime = codordertime;
	}

	public String getCodrejectwarehouse() {
		return codrejectwarehouse;
	}

	public void setCodrejectwarehouse(String codrejectwarehouse) {
		this.codrejectwarehouse = codrejectwarehouse;
	}

	public String getCodconsigneeaddr() {
		return codconsigneeaddr;
	}

	public void setCodconsigneeaddr(String codconsigneeaddr) {
		this.codconsigneeaddr = codconsigneeaddr;
	}

	public String getCodwaybillnumber() {
		return codwaybillnumber;
	}

	public void setCodwaybillnumber(String codwaybillnumber) {
		this.codwaybillnumber = codwaybillnumber;
	}

	public String getCodremark() {
		return codremark;
	}

	public void setCodremark(String codremark) {
		this.codremark = codremark;
	}

	public String getPbbusinesstype() {
		return pbbusinesstype;
	}

	public void setPbbusinesstype(String pbbusinesstype) {
		this.pbbusinesstype = pbbusinesstype;
	}

	public String getPbcustomertype() {
		return pbcustomertype;
	}

	public void setPbcustomertype(String pbcustomertype) {
		this.pbcustomertype = pbcustomertype;
	}

	public String getCancelcomplete() {
		return cancelcomplete;
	}

	public void setCancelcomplete(String cancelcomplete) {
		this.cancelcomplete = cancelcomplete;
	}

	public String getCancelreason() {
		return cancelreason;
	}

	public void setCancelreason(String cancelreason) {
		this.cancelreason = cancelreason;
	}

	public String getOuterid() {
		return outerid;
	}

	public void setOuterid(String outerid) {
		this.outerid = outerid;
	}

	public String getAmz_customerordernumber() {
		return amz_customerordernumber;
	}

	public void setAmz_customerordernumber(String amz_customerordernumber) {
		this.amz_customerordernumber = amz_customerordernumber;
	}

	public String getAmz_trackingid() {
		return amz_trackingid;
	}

	public void setAmz_trackingid(String amz_trackingid) {
		this.amz_trackingid = amz_trackingid;
	}

	public double getAmz_deliveryfee() {
		return amz_deliveryfee;
	}

	public void setAmz_deliveryfee(double amz_deliveryfee) {
		this.amz_deliveryfee = amz_deliveryfee;
	}

	public double getAmz_discount() {
		return amz_discount;
	}

	public void setAmz_discount(double amz_discount) {
		this.amz_discount = amz_discount;
	}

	public double getAmz_totalmoney() {
		return amz_totalmoney;
	}

	public void setAmz_totalmoney(double amz_totalmoney) {
		this.amz_totalmoney = amz_totalmoney;
	}

	public double getAmz_cardpay() {
		return amz_cardpay;
	}

	public void setAmz_cardpay(double amz_cardpay) {
		this.amz_cardpay = amz_cardpay;
	}

	public double getAmz_payment() {
		return amz_payment;
	}

	public void setAmz_payment(double amz_payment) {
		this.amz_payment = amz_payment;
	}

	public double getAmz_accountspay() {
		return amz_accountspay;
	}

	public void setAmz_accountspay(double amz_accountspay) {
		this.amz_accountspay = amz_accountspay;
	}

	public String getAmz_zpl() {
		return amz_zpl;
	}

	public void setAmz_zpl(String amz_zpl) {
		this.amz_zpl = amz_zpl;
	}

	public String getAmz_warehouse() {
		return amz_warehouse;
	}

	public void setAmz_warehouse(String amz_warehouse) {
		this.amz_warehouse = amz_warehouse;
	}

	public Date getAmz_ordertime() {
		return amz_ordertime;
	}

	public void setAmz_ordertime(Date amz_ordertime) {
		this.amz_ordertime = amz_ordertime;
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

	public String getDefault41() {
		return default41;
	}

	public void setDefault41(String default41) {
		this.default41 = default41;
	}

	public String getDefault42() {
		return default42;
	}

	public void setDefault42(String default42) {
		this.default42 = default42;
	}

	public String getDefault43() {
		return default43;
	}

	public void setDefault43(String default43) {
		this.default43 = default43;
	}

	public String getDefault44() {
		return default44;
	}

	public void setDefault44(String default44) {
		this.default44 = default44;
	}

	public String getDefault45() {
		return default45;
	}

	public void setDefault45(String default45) {
		this.default45 = default45;
	}

	public String getDefault46() {
		return default46;
	}

	public void setDefault46(String default46) {
		this.default46 = default46;
	}

	public String getAgencyfund() {
		return agencyfund;
	}

	public void setAgencyfund(String agencyfund) {
		this.agencyfund = agencyfund;
	}

	public String getShortaddress() {
		return shortaddress;
	}

	public void setShortaddress(String shortaddress) {
		this.shortaddress = shortaddress;
	}

	public String getPackagecentername() {
		return packagecentername;
	}

	public void setPackagecentername(String packagecentername) {
		this.packagecentername = packagecentername;
	}

	public String getPrintkeyword() {
		return printkeyword;
	}

	public void setPrintkeyword(String printkeyword) {
		this.printkeyword = printkeyword;
	}

	public String getPackagecentercode() {
		return packagecentercode;
	}

	public void setPackagecentercode(String packagecentercode) {
		this.packagecentercode = packagecentercode;
	}

	public String getRtxsapordertype() {
		return rtxsapordertype;
	}

	public void setRtxsapordertype(String rtxsapordertype) {
		this.rtxsapordertype = rtxsapordertype;
	}
}
