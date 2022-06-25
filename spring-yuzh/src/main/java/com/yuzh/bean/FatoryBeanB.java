package com.yuzh.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FatoryBeanB implements FactoryBean<Apple> {
	@Override
	public Apple getObject() throws Exception {
		 	return new Apple();
	}

	@Override
	public Class<?> getObjectType() {
		return Apple.class;
	}
}
