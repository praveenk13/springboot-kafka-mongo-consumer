package com.ford.ierp.cims.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseMessage {
	private String uniqueId;
	private String systemName;
	private String interfaceName;
	private String errorCode;
	private String errorMsg;
	private String reprocessFlag;

	@Override
	public String toString() {
		return "CIMS_Response [uniqueId=" + uniqueId + ", systemName=" + systemName + ", interfaceName=" + interfaceName
				+ ", errorCode=" + errorCode + ", errorMsg=" + errorMsg + ", reprocessFlag=" + reprocessFlag + "]";
	}
}
