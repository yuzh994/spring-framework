package com.yuzh.SpringTest;

import com.alibaba.fastjson.JSON;
import com.yuzh.services.MemberService;
import com.yuzh.services.MemberServiceV2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.stream.Collectors;

public class XMLapplicationTest {

	public static final Logger log = LoggerFactory.getLogger(XMLapplicationTest.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Object apple = applicationContext.getBean("apple");
		Object memberService = applicationContext.getBean(MemberServiceV2.class);

		log.info(JSON.toJSONString(memberService));
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		log.info("获取所有BeanDefinition"+JSON.toJSONString(Arrays.stream(beanDefinitionNames).collect(Collectors.toList())));
	}

}
