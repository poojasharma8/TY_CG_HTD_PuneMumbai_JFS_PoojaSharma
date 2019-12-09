package com.capgemini.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConfig {

	@Bean
	public LocalEntityManagerFactoryBean getEMF() {
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("employeePersistenceUnit");
		
		return factoryBean;
	}

}
