package com.olive.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {
	
	@JmsListener(destination = "${my.jms.desti-name}")
	public void readData(String message) {
		
		System.out.println("Data is Consumer Side :: " + message);
	}

}
