package com.yuzh.configuration;


import com.yuzh.bean.CQ;
import com.yuzh.bean.SC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Component
public class ConfigurationBean {

	@Bean
	public CQ getCq (){
		return new CQ();
	}

	@Bean
	public SC getSc (){
		SC sc = new SC();
		/**
		 * 调用 getCq () ，beanFatory.getBean(id)
		 */
		sc.setCq(getCq ());
		return sc;
	}
}
