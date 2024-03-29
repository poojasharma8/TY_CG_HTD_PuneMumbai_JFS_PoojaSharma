package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean;

public class MessageTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		((AbstractApplicationContext)context).registerShutdownHook(); //after main method gets executed then called
		
		MessageBean messageBean = (MessageBean) context.getBean("messageBean");
		
		System.out.println(messageBean.getMessage());
		
		//((AbstractApplicationContext)context).close();
		
		
	}
	
}
