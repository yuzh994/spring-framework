package com.yuzh.SpringTest;

import com.alibaba.fastjson.JSON;
import com.yuzh.event.EnjoyApplicationListener;
import com.yuzh.event.EnjoyEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.stream.Collectors;

public class XMLapplicationTest2 {
	public static final Logger log = LoggerFactory.getLogger(XMLapplicationTest2.class);
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		//容器启动之后，添加 ApplicationLestenner
		applicationContext.addApplicationListener(new EnjoyApplicationListener());

		applicationContext.publishEvent(new EnjoyEvent(new Apple("123")));
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		log.info("获取所有BeanDefinition"+ JSON.toJSONString(Arrays.stream(beanDefinitionNames).collect(Collectors.toList())));
	}
}
