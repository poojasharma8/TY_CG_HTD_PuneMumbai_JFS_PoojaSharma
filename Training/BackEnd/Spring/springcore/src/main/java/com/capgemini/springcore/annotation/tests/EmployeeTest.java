package com.capgemini.springcore.annotation.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotations.beans.EmployeeBean;
import com.capgemini.springcore.annotations.config.DepartmentConfig;
import com.capgemini.springcore.annotations.config.EmployeeConfig;

public class EmployeeTest {
	
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		((AbstractApplicationContext)context).registerShutdownHook();
		
		System.out.println("----------------------------------");
		System.out.println("Employee Info ...");
		System.out.println("Employee Id : "+employeeBean.getEmpId());
		System.out.println("Employee Name : "+employeeBean.getEmpName());
		System.out.println("****************************************************");
		System.out.println("Department Info...");
		System.out.println("Department ID : " +employeeBean.getDeptBean().getDeptId());
		System.out.println("Department Name : "+employeeBean.getDeptBean().getDeptName());
		System.out.println("-------------------------------------");
		
		//((AbstractApplicationContext)context).close();
	}

}
