package com.yuzh.proxy.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class YzhAfterAdvice implements AfterReturningAdvice {
	public static final Logger log = LoggerFactory.getLogger(YzhAfterAdvice.class);

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		log.info("执行AfterReturningAdvice,afterReturning()");
	}
}
