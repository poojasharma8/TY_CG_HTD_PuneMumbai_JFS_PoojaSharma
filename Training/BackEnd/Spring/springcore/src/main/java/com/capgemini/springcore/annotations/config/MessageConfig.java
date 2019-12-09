package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.annotations.beans.MessageBean;

@Configuration
public class MessageConfig {
	
	@Bean
	@Scope("singleton")
	public MessageBean getMessageBean() {
		MessageBean messagebean = new MessageBean();
		messagebean.setMessage("Hello Fraands...");
		return messagebean;
	}

}
