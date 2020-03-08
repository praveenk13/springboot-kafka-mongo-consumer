package com.ford.ierp.cims.service;

import org.springframework.stereotype.Service;

import com.ford.ierp.cims.model.IERPMessage;
import com.ford.ierp.cims.repository.CIMSRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CIMSService {
	private final CIMSRepository cimsRepository;

	public Mono<IERPMessage> save(IERPMessage ierpMessage) {
		if(ierpMessage.getEventType().equalsIgnoreCase("Success")) {
			ierpMessage.setPayload(null);
		}
		return cimsRepository.save(ierpMessage);
	}
}
