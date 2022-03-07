package com.yuzh.proxy.aspect;

import com.yuzh.proxy.advice.YzhBeforeAdvice;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class YzhAspect {
	public static final Logger log = LoggerFactory.getLogger(YzhAspect.class);

	@Before("execution(public void com.yuzh.proxy.UserService.test1())")
	public void yzhBefore(JoinPoint joinPoint){
		log.info("执行BeforeAdvice,before()");
	}
}
