package com.yuzh.beans;

import com.yuzh.SpringTest.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YuzhBeanFactory {
	@Bean
	public A getA(){
		return new A();
	}
}
