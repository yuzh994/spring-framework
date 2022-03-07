package com.yuzh.proxy.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

public class YzhThrowsAdvice implements ThrowsAdvice {

	public static final Logger log = LoggerFactory.getLogger(YzhThrowsAdvice.class);

	public void afterThrowing(Exception ex){
		log.info("YzhThrowsAdvice,afterThrowing");
	}

	public void afterThrowing(NullPointerException ex){
		log.info("执行YzhThrowsAdvice,afterThrowing NullPointerException");
	}
}
