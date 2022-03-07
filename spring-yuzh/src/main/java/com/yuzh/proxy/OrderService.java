package com.yuzh.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class OrderService implements IOrderService{
	public static final Logger log = LoggerFactory.getLogger(OrderService.class);
	@Override
	public void test1(){
		log.info("执行UserService ,test1");
	}
	@Override
	public void test2(){
		log.info("执行UserService ,test2");
	}
}
