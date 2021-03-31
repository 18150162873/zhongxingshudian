package com.rtx.zhongxing.service.express.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.PopHttpClient;
import com.pdd.pop.sdk.http.api.pop.request.PddCloudprintStdtemplatesGetRequest;
import com.pdd.pop.sdk.http.api.pop.request.PddWaybillGetRequest;
import com.pdd.pop.sdk.http.api.pop.request.PddWaybillGetRequest.ParamWaybillCloudPrintApplyNewRequest;
import com.pdd.pop.sdk.http.api.pop.request.PddWaybillGetRequest.ParamWaybillCloudPrintApplyNewRequestSender;
import com.pdd.pop.sdk.http.api.pop.request.PddWaybillGetRequest.ParamWaybillCloudPrintApplyNewRequestSenderAddress;
import com.pdd.pop.sdk.http.api.pop.request.PddWaybillGetRequest.ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItem;
import com.pdd.pop.sdk.http.api.pop.request.PddWaybillGetRequest.ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemOrderInfo;
import com.pdd.pop.sdk.http.api.pop.request.PddWaybillGetRequest.ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfo;
import com.pdd.pop.sdk.http.api.pop.request.PddWaybillGetRequest.ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfoItemsItem;
import com.pdd.pop.sdk.http.api.pop.request.PddWaybillGetRequest.ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipient;
import com.pdd.pop.sdk.http.api.pop.request.PddWaybillGetRequest.ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipientAddress;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudprintStdtemplatesGetResponse;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudprintStdtemplatesGetResponse.InnerPddCloudprintStdtemplatesGetResponseResultDatasItemStandardTemplatesItem;
import com.pdd.pop.sdk.http.api.pop.response.PddWaybillGetResponse;
import com.rtx.zhongxing.bean.express.pdd.PddExpressOrderResult;
import com.rtx.zhongxing.express.AccessTokenHelp;
import com.rtx.zhongxing.mybatis.entity.express.ParameterEntity;
import com.rtx.zhongxing.mybatis.entity.express.PddStdtemplateEntity;
import com.rtx.zhongxing.mybatis.mapper.express.AccessTokenMapper;
import com.rtx.zhongxing.mybatis.mapper.express.PddStdtemplatesMapper;
import com.rtx.zhongxing.service.express.ExpressService;


@SuppressWarnings("all")
@Service
public class PDDExpressApi implements ExpressService<ParameterEntity,PddExpressOrderResult>{

	@Value("${pdd.clientid}")
	private String clientId;
	@Value("${pdd.clientsecret}")
	private String clientSecret;
	
	Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	AccessTokenMapper expressAccessTokenMapper;
	
	@Autowired
	PddStdtemplatesMapper stdtemplatesMapper;
	
	
	@Override
	public PddExpressOrderResult getWaybill(ParameterEntity Parameter){
		PddExpressOrderResult result = null;
		try {
			PddWaybillGetRequest request = mappingRequest(Parameter);
			AccessTokenHelp accessTokenHelp = AccessTokenHelp.getInstance();
			accessTokenHelp.resetAccesstoken(expressAccessTokenMapper, "PDD");
			PopClient client = new PopHttpClient(clientId, clientSecret);
			String requestStr = JsonUtil.transferToJson(request);
			
			LOG.info("拼多多API快递面单接口请求报文:{}",requestStr);
			PddWaybillGetResponse response = client.syncInvoke(request, accessTokenHelp.pddAccesstoken);
			LOG.info("拼多多API快递面单接口请求报文:{}",JsonUtil.transferToJson(response));
			if(response.getErrorResponse()!=null) {
				throw new RuntimeException(response.getErrorResponse().getErrorMsg()+"-"+response.getErrorResponse().getSubMsg());
			}
//			response.getErrorResponse();
//			response.getPddWaybillGetResponse();
			
		} catch (Exception e) {
			LOG.error("{}拼多多API快递面单接口异常:{}",Parameter.getExternorderkey(),e.getMessage());
			throw new RuntimeException(Parameter.getExternorderkey()+"拼多多API快递面单接口异常:{}"+e.getMessage());
		}
		
		return null;
	}
	
	
	private String getStdtemplates(String wp_code,String externorderkey) {
		String standardTemplateUrl = "";
		if(StringUtils.isEmpty(wp_code)) {
			throw new RuntimeException(externorderkey+"承运商名称不能为空");
		}
		
		try {
			PddStdtemplateEntity stdtemplates = stdtemplatesMapper.queryStdtemplateByCode(wp_code);
			if(stdtemplates == null) {
				PopClient client = new PopHttpClient(clientId, clientSecret);
				PddCloudprintStdtemplatesGetRequest request = new PddCloudprintStdtemplatesGetRequest();
				request.setWpCode(wp_code);
				PddCloudprintStdtemplatesGetResponse response = client.syncInvoke(request);
				if(response.getErrorResponse()!=null) {
					throw new RuntimeException("请求拼多多API失败:"+response.getErrorResponse().getErrorMsg());
				}
				
				List<InnerPddCloudprintStdtemplatesGetResponseResultDatasItemStandardTemplatesItem> items =response.getPddCloudprintStdtemplatesGetResponse().getResult().getDatas().get(0).getStandardTemplates();
				for(InnerPddCloudprintStdtemplatesGetResponseResultDatasItemStandardTemplatesItem item:items) {
					if("标准模板".equals(item.getStandardTemplateName())) {
						PddStdtemplateEntity temp = new PddStdtemplateEntity();
						temp.setStandardTemplateId(item.getStandardTemplateId()+"");
						temp.setStandardTemplateName(item.getStandardTemplateName());
						temp.setStandardTemplateUrl(item.getStandardTemplateUrl());
						temp.setStandardWaybillType(item.getStandardWaybillType()+"");
						temp.setWpCode(wp_code);
						stdtemplatesMapper.addStdtemplate(temp);
						standardTemplateUrl = item.getStandardTemplateUrl();
						break;
					}
				}
				
			}else {
				standardTemplateUrl = stdtemplates.getStandardTemplateUrl();
			}
		} catch (Exception e) {
			LOG.error("拼多多平台获取标准模板失败:{}",e.getMessage());
			throw new RuntimeException("拼多多平台获取标准模板失败:"+e.getMessage());
		}
		
		
		return standardTemplateUrl;
	}
	
	//将wms参数映射到请求参数
	private PddWaybillGetRequest mappingRequest(ParameterEntity paramter){
		String templateUrl = getStdtemplates(paramter.getCarriercode(), paramter.getExternorderkey());
		
		PddWaybillGetRequest request = new PddWaybillGetRequest();

        ParamWaybillCloudPrintApplyNewRequest paramWaybillCloudPrintApplyNewRequest = new ParamWaybillCloudPrintApplyNewRequest();
        paramWaybillCloudPrintApplyNewRequest.setNeedEncrypt(false);

        ParamWaybillCloudPrintApplyNewRequestSender sender = new ParamWaybillCloudPrintApplyNewRequestSender();

        ParamWaybillCloudPrintApplyNewRequestSenderAddress address = new ParamWaybillCloudPrintApplyNewRequestSenderAddress();
        address.setCity(paramter.getSender().getSendCity());
        address.setDetail(paramter.getSender().getSendAddr());
        address.setDistrict(paramter.getSender().getSendArea());
        address.setProvince(paramter.getSender().getSendProvince());
        address.setTown("");
        address.setCountry("");
        sender.setAddress(address);
        sender.setMobile(paramter.getSender().getSendMobile());
        sender.setName(paramter.getSender().getSendName());
        sender.setPhone(paramter.getSender().getSendPhone());
        paramWaybillCloudPrintApplyNewRequest.setSender(sender);
        List<ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItem> tradeOrderInfoDtos = new ArrayList<ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItem>();

        ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItem item = new ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItem();
        item.setLogisticsServices("");
        item.setObjectId(paramter.getExternorderkey());

        ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemOrderInfo orderInfo = new ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemOrderInfo();
        orderInfo.setOrderChannelsType(paramter.getOrderchannelstype());
        List<String> tradeOrderList = new ArrayList<String>();
        tradeOrderList.add("["+paramter.getExternorderkey()+"]");
        orderInfo.setTradeOrderList(tradeOrderList);
        item.setOrderInfo(orderInfo);

        ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfo packageInfo = new ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfo();
        packageInfo.setGoodsDescription("");
        packageInfo.setId("");
        List<ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfoItemsItem> items = new ArrayList<ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfoItemsItem>();

        ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfoItemsItem item1 = new ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemPackageInfoItemsItem();
        item1.setCount(1);
        item1.setName("书籍");
        items.add(item1);
        packageInfo.setItems(items);
        packageInfo.setPackagingDescription("str");
        packageInfo.setTotalPackagesCount(0);
        packageInfo.setVolume(0L);
        packageInfo.setWeight(0L);
        item.setPackageInfo(packageInfo);

        ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipient recipient = new ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipient();

        ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipientAddress address1 = new ParamWaybillCloudPrintApplyNewRequestTradeOrderInfoDtosItemRecipientAddress();
        address1.setCity(paramter.getReceiverCity());
        address1.setDetail(paramter.getReceiverAddr());
        address1.setDistrict(paramter.getReceiverArea());
        address1.setProvince(paramter.getReceiverProvince());
        address1.setTown("");
        address1.setCountry("");
        recipient.setAddress(address1);
        recipient.setMobile(paramter.getReceiverMobile());
        recipient.setName(paramter.getReceiverName());
        recipient.setPhone(paramter.getReceiverPhone());
        item.setRecipient(recipient);
        item.setTemplateUrl(templateUrl);
        item.setUserId(412194750l);
        tradeOrderInfoDtos.add(item);
        paramWaybillCloudPrintApplyNewRequest.setTradeOrderInfoDtos(tradeOrderInfoDtos);
        paramWaybillCloudPrintApplyNewRequest.setWpCode(paramter.getCarriercode());
        request.setParamWaybillCloudPrintApplyNewRequest(paramWaybillCloudPrintApplyNewRequest);
		return request;
	}
}
