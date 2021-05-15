package com.yuzh.simpleAopTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DyAopTest {

	public static final Logger log = LoggerFactory.getLogger(MemberDaoImpl.class);

	public static void main(String[] args) throws ClassNotFoundException {
		/**
		 * 生产动态代理对象
		 *
		 */
		IMemberDao iMemberDao = (IMemberDao)Proxy.newProxyInstance(IMemberDao.class.getClassLoader(),
				MemberDaoImpl.class.getInterfaces(),
				new MemberInvocationHandler(new MemberDaoImpl()));
		String result = iMemberDao.getMember(1l);

		String ProxyName = iMemberDao.getClass().getName();

		log.info(String.format("代理对象，类名：%s",ProxyName));

		
		log.info("返回结果{}",result);

	}
}
