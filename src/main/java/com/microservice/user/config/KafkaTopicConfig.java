package com.microservice.user.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic userNotificationTopic() {
		return new NewTopic("user-notification", 1, (short) 1);
	}
}
