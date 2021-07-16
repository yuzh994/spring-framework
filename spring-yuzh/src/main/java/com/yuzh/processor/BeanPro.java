package com.yuzh.processor;

import com.alibaba.fastjson.JSON;
import com.yuzh.Annotation.MyService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

@Component
public class BeanPro implements BeanDefinitionRegistryPostProcessor {

	private static final Log log = LogFactory.getLog(BeanPro.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String s = JSON.toJSONString(beanFactory.getBeanDefinitionNames());

		log.info(String.format("获取所有的有BeanDefinitionNames：%S",s));


	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		log.info(registry);
		//自定义扫描器
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry);
		scanner.addIncludeFilter(new AnnotationTypeFilter(MyService.class));
		scanner.scan("com.yuzh");
	}
}
