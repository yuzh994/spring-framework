package com.yuzh.simpleAnnotationTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	public static final Logger log = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {
		Class<Member> clazz = Member.class;
		if ( clazz.isAnnotationPresent(ZH.class)){
			log.debug("存在@ZH注解");
			ZH zh = clazz.getAnnotation(ZH.class);
			String method = zh.method();
			String value = zh.value();
			log.debug("method={},value={}",method,value);
		}
	}
}
