package com.yuzh.proxy.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YzhAroundAdvice implements MethodInterceptor {
	public static final Logger log = LoggerFactory.getLogger(YzhAroundAdvice.class);

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		log.info("执行AroundAdvice,before()");
		Object proceed = invocation.proceed();
		log.info("执行AroundAdvice,after()");
		return proceed;
	}
}
