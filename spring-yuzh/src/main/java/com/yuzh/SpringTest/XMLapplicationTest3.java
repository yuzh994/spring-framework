package com.yuzh.SpringTest;

import com.alibaba.fastjson.JSON;
import com.yuzh.event.EnjoyApplicationListener;
import com.yuzh.event.EnjoyEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.stream.Collectors;

public class XMLapplicationTest3 {
	public static final Logger log = LoggerFactory.getLogger(XMLapplicationTest3.class);
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");


		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		log.info("获取所有BeanDefinition"+ JSON.toJSONString(Arrays.stream(beanDefinitionNames).collect(Collectors.toList())));
	}
}
