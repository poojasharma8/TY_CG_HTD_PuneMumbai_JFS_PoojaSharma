package com.capgemini.springcore.annotation.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotations.beans.Car;

public class CarTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("carsConfig.xml");
		Car myCar = context.getBean("myCar", Car.class);
		
		System.out.println("Model Details******************************");
		System.out.println("model name " +myCar.getModelName());
		System.out.println("model no. "+myCar.getModelNo());
		System.out.println("Engine Details ***************************");
		System.out.println("CC : "+myCar.getEngine().getCC());
		System.out.println("Type : "+myCar.getEngine().getType());
	}
}
