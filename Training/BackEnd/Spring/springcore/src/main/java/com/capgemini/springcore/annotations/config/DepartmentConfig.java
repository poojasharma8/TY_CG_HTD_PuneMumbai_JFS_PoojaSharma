package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotations.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {

	@Bean(name = "dev")
	public DepartmentBean getDepartmentBean1() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(501);
		bean.setDeptName("Dev");

		return bean;
	}

	@Bean(name = "testing")
	public DepartmentBean getDepartmentBean2() {
		DepartmentBean bean1 = new DepartmentBean();
		bean1.setDeptId(601);
		bean1.setDeptName("Testing");

		return bean1;
	}

	@Bean(name = "hr")
	// @Primary
	public DepartmentBean getDepartmentBean3() {
		DepartmentBean bean2 = new DepartmentBean();
		bean2.setDeptId(701);
		bean2.setDeptName("HR");

		return bean2;
	}
	
}
