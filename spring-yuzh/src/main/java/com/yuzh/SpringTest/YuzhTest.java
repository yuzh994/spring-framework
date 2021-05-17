package com.yuzh.SpringTest;


import com.yuzh.app.Appconfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;


@ComponentScan
public class YuzhTest {

	public static final Logger log = LoggerFactory.getLogger(YuzhTest.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		log.info("1");
		Arrays.stream(beanDefinitionNames).forEach(beanDefinitionName ->log.info(beanDefinitionName));
	}
}
