package com.yuzh.daotest;


import com.alibaba.fastjson.JSON;
import com.yuzh.app.*;
import com.yuzh.bean.CQ;
import com.yuzh.bean.SC;
import com.yuzh.beans.Dog;
import com.yuzh.beans.Jack;
import com.yuzh.beans.Rose;
import com.yuzh.innerBean.InnerBeanDome;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
		InnerBeanDome bean = annotationConfigApplicationContext.getBean(InnerBeanDome.class);
		InnerBeanDome bean2 = annotationConfigApplicationContext.getBean(InnerBeanDome.class);

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

		Jack jack = annotationConfigApplicationContext.getBean(Jack.class);
		Rose rose = annotationConfigApplicationContext.getBean(Rose.class);
		Dog dog = annotationConfigApplicationContext.getBean(Dog.class);

		log.info("jack 的狗 :{},rose的狗:{},dog:{}",jack.getPet(),rose.getPet(),dog);
	}


}
