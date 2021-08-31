package com.yuzh.innerBean;

import com.yuzh.SpringTest.Apple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class YuzhBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	public static final Logger log = LoggerFactory.getLogger(YuzhBeanFactoryPostProcessor.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		log.info("进入到 postProcessBeanFactory 方法");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

		/**
		 * 可以自己注册 BeanDefinition
		 */

		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(Apple.class);

		registry.registerBeanDefinition("apple",beanDefinition);

		log.info("进入到 postProcessBeanDefinitionRegistry 方法");
	}
}
