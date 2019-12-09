package com.capgemini.springcore.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	
@Override
public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("Before initialization ...");
	return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
}

@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("After initialization ...");
	return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
