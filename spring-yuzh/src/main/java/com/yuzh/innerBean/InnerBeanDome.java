package com.yuzh.innerBean;

import com.yuzh.SpringTest.A;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InnerBeanDome {

	@Component
	public class SpringA{

		@Bean
		public A getA(){
			return new A();
		}
	}

	@Component
	public class SpringB{

	}
}
