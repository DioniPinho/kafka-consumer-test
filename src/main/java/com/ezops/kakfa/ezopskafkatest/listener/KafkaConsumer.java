package com.ezops.kakfa.ezopskafkatest.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service 
public class KafkaConsumer {

	@KafkaListener(topics = "nkd_jobs_test", groupId = "group_test_3")
	public void consume(String message) {
		System.out.println("Consumed : "+ message);
	}
}
