package com.yuzh.simpleAopTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;

public class DyAopTest {

	public static final Logger log = LoggerFactory.getLogger(MemberDaoImpl.class);

	public static void main(String[] args) {
		//生产动态代理对象
		IMemberDao iMemberDao = (IMemberDao)Proxy.newProxyInstance(IMemberDao.class.getClassLoader(),
				MemberDaoImpl.class.getInterfaces(),
				new MemberInvocationHandler(new MemberDaoImpl()));
		iMemberDao.getMember(1l);
		String clazzName = iMemberDao.getClass().getName();
		log.info("clazzName:{}",clazzName);

	}
}
