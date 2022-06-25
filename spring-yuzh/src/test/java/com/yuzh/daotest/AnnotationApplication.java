package com.yuzh.daotest;


import com.alibaba.fastjson.JSON;
import com.yuzh.app.*;
import com.yuzh.bean.Apple;
import com.yuzh.bean.Pear;
import com.yuzh.beans.MyDogs;
import com.yuzh.factorybean.YzhBean;
import com.yuzh.factorybean.YzhFactoryBean;
import com.yuzh.innerBean.InnerBeanDome;
import com.yuzh.proxy.IOrderService;
import com.yuzh.proxy.IUserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationApplication {

	public static final Logger log = LoggerFactory.getLogger(AnnotationApplication.class);

	@Test
	public void xmlComponetScanTest(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		InnerBeanDome bean = applicationContext.getBean(InnerBeanDome.class);

		log.info("==============="+JSON.toJSONString(applicationContext.getBeanDefinitionNames()));
	}

	@Test
	public void componentScanTest(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(InnerAppconfig.class);
		MyDogs bean = annotationConfigApplicationContext.getBean(MyDogs.class);

		log.info("==============="+JSON.toJSONString(annotationConfigApplicationContext.getBeanDefinitionNames()));
	}

	@Test
	public void factoryBeanTest(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanFactortConfig.class);
		Object yzhFactoryBean = annotationConfigApplicationContext.getBean("myFactoryBean");
		Object yzhFactoryBean1 = annotationConfigApplicationContext.getBean("&myFactoryBean");
		YzhBean bean = annotationConfigApplicationContext.getBean(YzhBean.class);
		YzhFactoryBean bean1 = annotationConfigApplicationContext.getBean(YzhFactoryBean.class);


		log.info("==============="+JSON.toJSONString(annotationConfigApplicationContext.getBeanDefinitionNames()));
	}

	@Test
	public void innerBeanTest() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(InnerAppconfig.class);

		log.info("===============" + annotationConfigApplicationContext);
	}

	@Test
	public void importTest() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);

		log.info("===============" + annotationConfigApplicationContext);
	}
	@Test
	public void conditionTest() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);

		log.info("===============" + annotationConfigApplicationContext);
	}

	@Test
	public void importResource(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportResourceConfig.class);

		log.info("===============" + annotationConfigApplicationContext);
	}

	@Test
	public void BeanTest() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);


		Pear bean = annotationConfigApplicationContext.getBean(Pear.class);
		Apple bean1 = annotationConfigApplicationContext.getBean(Apple.class);
		Apple bean2 = annotationConfigApplicationContext.getBean(Apple.class);
		Pear bean3 = annotationConfigApplicationContext.getBean(Pear.class);

		log.info("===============" + bean);
	}

	@Test
	public void aopTest() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);

		IUserService userService = applicationContext.getBean(IUserService.class);
		IOrderService orderService = applicationContext.getBean(IOrderService.class);

		userService.test1();
		userService.test2();

		orderService.test1();
		orderService.test2();;

	}
}
