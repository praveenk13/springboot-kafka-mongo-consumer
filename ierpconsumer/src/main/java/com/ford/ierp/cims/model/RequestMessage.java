package com.ford.ierp.cims.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequestMessage {
	private String uniqueId;
	private String systemName;
	private String interfaceName;
	private String author;
	private String payload;

	@Override
	public String toString() {
		return "RequestMessage [uniqueId=" + uniqueId + ", systemName=" + systemName + ", interfaceName="
				+ interfaceName + ", author=" + author + ", payload=" + payload + "]";
	}

}
