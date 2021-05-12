package com.yuzh.simpleAopTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MemberInvocationHandler implements InvocationHandler {

	public static final Logger log = LoggerFactory.getLogger(MemberDaoImpl.class);

	Object target;

	public MemberInvocationHandler(Object object) {
		this.target = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		log.info("befer----------");
		Object invoke = method.invoke(target, args);
		log.info("after----------");
		return invoke;
	}
}
