package com.yuzh.daotest;


import com.yuzh.app.BeanConfig;
import com.yuzh.app.ImportConfig;
import com.yuzh.app.InnerAppconfig;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationApplication {

	public static final Logger log = LoggerFactory.getLogger(AnnotationApplication.class);


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
	public void BeanTest() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

		log.info("===============" + annotationConfigApplicationContext);
	}
}
