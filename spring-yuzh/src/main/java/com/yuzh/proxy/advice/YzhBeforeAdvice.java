package com.yuzh.proxy.advice;

import com.yuzh.simpleAopTest.MemberDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class YzhBeforeAdvice implements MethodBeforeAdvice {
	public static final Logger log = LoggerFactory.getLogger(YzhBeforeAdvice.class);


	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		log.info("执行BeforeAdvice,before()");
}
}
