package com.yuzh.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("myFactoryBean")
public class YzhFactoryBean implements FactoryBean<YzhBean> {

	@Override

	public YzhBean getObject() throws Exception {
		return new YzhBean();
	}

	@Override
	public Class<?> getObjectType() {
		return YzhBean.class;
	}
}
