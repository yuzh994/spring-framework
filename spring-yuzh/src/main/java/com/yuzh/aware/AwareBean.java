package com.yuzh.aware;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class AwareBean implements BeanNameAware , BeanFactoryAware {

	@Override
	public void setBeanName(String name) {
		System.out.println("========setBeanName:"+name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("========setBeanFactory:"+ JSON.toJSONString(beanFactory));
	}
}
