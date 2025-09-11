package com.microservice.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserProducerService {

	private static final String TOPIC = "user-notification";

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendUserEvent(String message) {
		kafkaTemplate.send(TOPIC, message);
	}
}
