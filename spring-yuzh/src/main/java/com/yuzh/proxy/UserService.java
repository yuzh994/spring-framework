package com.yuzh.proxy;

import com.yuzh.proxy.advice.YzhAfterAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService {

	public static final Logger log = LoggerFactory.getLogger(UserService.class);
	@Override
	public void test1(){
		log.info("执行UserService ,test1");
	}
	@Override
	public void test2(){
		log.info("执行UserService ,test2");
	}
}
