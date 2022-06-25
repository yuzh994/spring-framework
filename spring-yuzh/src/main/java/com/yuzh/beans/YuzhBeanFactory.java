package com.yuzh.beans;

import org.springframework.context.annotation.Bean;

//@Configuration
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
	public MyDogs getDog() {
		return new MyDogs();
	}
}
