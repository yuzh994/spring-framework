package com.yuzh.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FatoryBeanA implements FactoryBean<Pear> {
	@Override
	public Pear getObject() throws Exception {
		 	return new Pear();
	}

	@Override
	public Class<?> getObjectType() {
		return Pear.class;
	}
}
