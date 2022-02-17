package com.yuzh.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		System.out.println("实例化之后，属性赋值之前");
	}

	@Override
	public void resetBeanDefinition(String beanName) {
		MergedBeanDefinitionPostProcessor.super.resetBeanDefinition(beanName);
	}
}
