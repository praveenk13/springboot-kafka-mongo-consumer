package com.ford.ierp.cims.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.ford.ierp.cims.model.IERPMessage;

@Component
public class CIMSMessageSender {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	public void sendResponse(IERPMessage ierpMessage) {
 		ierpMessage.setEventType((int)(java.lang.Math.random()*100)%2==0?"Success":"Failed");
 		kafkaTemplate.send("CIMS", ierpMessage.getUniqueId(), ierpMessage);
	}
}
