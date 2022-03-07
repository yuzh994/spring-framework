package com.yuzh.app;

import com.yuzh.proxy.IUserService;
import com.yuzh.proxy.UserService;
import com.yuzh.proxy.advice.YzhAroundAdvice;
import com.yuzh.proxy.advice.YzhPointcutAdvisor;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.yuzh.proxy")
@EnableAspectJAutoProxy
//@Import(DefaultAdvisorAutoProxyCreator.class)
@EnableTransactionManagement
public class AopConfig {

	@Bean
	public MethodInterceptor yzhAroundAdvice(){
		return new YzhAroundAdvice();
	}
//	@Bean
//	public ProxyFactoryBean userService(){
//		UserService userService = new UserService();
//		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//		proxyFactoryBean.setTarget(userService);
//		proxyFactoryBean.setInterceptorNames("yzhAroundAdvice");
//		return proxyFactoryBean;
//	}
//	@Bean
//	public BeanNameAutoProxyCreator beanNameAutoProxyCreator() {
//		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//		beanNameAutoProxyCreator.setBeanNames("userSe*");
//		beanNameAutoProxyCreator.setInterceptorNames("yzhAroundAdvice");
//		beanNameAutoProxyCreator.setProxyTargetClass(true);
//		return beanNameAutoProxyCreator;
//	}

//	@Bean
//	public DefaultPointcutAdvisor defaultPointcutAdvisor(){
//		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
//		pointcut.addMethodName("test1");
//		DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor();
//		defaultPointcutAdvisor.setPointcut(pointcut);
//		defaultPointcutAdvisor.setAdvice(new YzhAroundAdvice());
//		return defaultPointcutAdvisor;
//	}
//	@Bean
//	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
//		DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new
//				DefaultAdvisorAutoProxyCreator();
//		return defaultAdvisorAutoProxyCreator;
//	}

}