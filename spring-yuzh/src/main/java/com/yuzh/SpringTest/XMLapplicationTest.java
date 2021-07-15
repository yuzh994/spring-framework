package com.yuzh.SpringTest;

import com.alibaba.fastjson.JSON;
import com.yuzh.services.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLapplicationTest {

	public static final Logger log = LoggerFactory.getLogger(XMLapplicationTest.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Object apple = applicationContext.getBean("apple");
		Object memberService = applicationContext.getBean(MemberService.class);

		log.info(JSON.toJSONString(memberService));
		log.info("获取所有BeanDefinition"+JSON.toJSONString(	applicationContext.getBeanDefinitionNames()));
	}

}
