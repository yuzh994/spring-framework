package com.yuzh.SpringTest;

import com.yuzh.app.Appconfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplicationTest {

	public static final Logger log = LoggerFactory.getLogger(AnnotationApplicationTest.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);

		System.out.println(annotationConfigApplicationContext);
	}
}
