package com.yuzh.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
//@Component
public class YuzhBeanFactory {

	@Bean
	public Rose getRose() {
		Rose rose = new Rose();
		rose.setPet(getDog());
		return rose;
	}

	@Bean
	public Jack getJack() {
		Jack jack = new Jack();
		jack.setPet(getDog());
		return jack;
	}

	@Bean
	public Dog getDog() {
		return new Dog();
	}
}
