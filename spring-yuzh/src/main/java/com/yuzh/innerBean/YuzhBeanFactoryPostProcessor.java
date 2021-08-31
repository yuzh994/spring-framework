package com.yuzh.innerBean;

import com.yuzh.simpleAopTest.MemberDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class YuzhBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public static final Logger log = LoggerFactory.getLogger(YuzhBeanFactoryPostProcessor.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		BeanDefinition bd = beanFactory.getBeanDefinition("innerBeanDome");

//		bd.setScope(BeanDefinition.SCOPE_PROTOTYPE);

		log.info("进入到 postProcessBeanFactory 方法");
	}
}
