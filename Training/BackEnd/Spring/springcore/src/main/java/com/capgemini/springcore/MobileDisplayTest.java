package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MobileBean;

public class MobileDisplayTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("mobileDisplay.xml");
		MobileBean mobilebean = context.getBean("mobile", MobileBean.class);
		
		System.out.println("Brand : "+mobilebean.getBrand());
		System.out.println("Model : "+mobilebean.getModelName());
		System.out.println("Price : "+mobilebean.getPrice());
		System.out.println("Display-Size : "+mobilebean.getMobiledisplay().getDisplaySize() + " inches");
		System.out.println("Resolution : "+mobilebean.getMobiledisplay().getResolution());
	}

}
