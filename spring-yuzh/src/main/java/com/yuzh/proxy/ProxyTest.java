package com.yuzh.proxy;

import com.yuzh.proxy.advice.YzhPointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;

public class ProxyTest {
	public static void main(String[] args) {
		UserService target = new UserService();
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);
//		proxyFactory.addInterface(IUserService.class);
		proxyFactory.addAdvisor(new YzhPointcutAdvisor());
		UserService proxy =(UserService) proxyFactory.getProxy();
		proxy.test1();
		proxy.test2();
	}
}
