package com.rtx.zhongxing.bean.qm.entryorder;

import javax.xml.bind.annotation.XmlRootElement;

import com.rtx.zhongxing.bean.qm.RtxQMResponse;

@XmlRootElement(name="response")
public class EntryOrderResponseDTO extends RtxQMResponse{
	
	private String entryOrderId;//仓储系统入库单编码, string (50) 

	public String getEntryOrderId() {
		return entryOrderId;
	}

	public void setEntryOrderId(String entryOrderId) {
		this.entryOrderId = entryOrderId;
	}
}