package com.ford.ierp.cims.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.ford.ierp.cims.model.IERPMessage;
import com.ford.ierp.cims.producer.CIMSMessageSender;
import com.ford.ierp.cims.service.CIMSService;

import reactor.core.publisher.Mono;

public class MessageListener {
	@Autowired
	private CIMSService cimsService;
	@Autowired
	private CIMSMessageSender cimsMessageSender;

	@KafkaListener(topics = "CIMS")
	public void receive(IERPMessage ierpMessage) {
		System.out.println("Receieved Message " + ierpMessage.toString());

		Mono<IERPMessage> save = cimsService.save(ierpMessage);
		save.subscribe(System.out::println);
		if (ierpMessage.getEventType().equalsIgnoreCase("initiated")) {
			cimsMessageSender.sendResponse(ierpMessage);
		}

	}

}
