package com.yuzh.AnnotationTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@ZH(value = "123",method = "123")
public class Member {

	public static final Logger log = LoggerFactory.getLogger(Test.class);

	public void memberMethod(){
		log.info("xxx");
	}
}
