package com.ford.ierp.cims.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IERPMessage {
	@Id
	private String uniqueId;
	private String systemName;
	private String interfaceName;
	private String author;
	private String payload;
	private String eventType;
	private String errorCode;
	private String shortDesc;
	private String description;

	@Override
	public String toString() {
		return "IERPMessage [uniqueId=" + uniqueId + ", systemName=" + systemName + ", interfaceName=" + interfaceName
				+ ", author=" + author + ", payload=" + payload + ", eventType=" + eventType + ", errorCode="
				+ errorCode + ", shortDesc=" + shortDesc + ", description=" + description + "]";
	}	
}
