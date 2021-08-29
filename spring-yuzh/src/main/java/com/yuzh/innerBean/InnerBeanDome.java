package com.yuzh.innerBean;

import com.yuzh.Annotation.MyService;
import com.yuzh.SpringTest.A;
import com.yuzh.deferredImportSelector.YuzhCondifion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;


//@Conditional(YuzhCondifion.class)
@Component
//@MyService
public class InnerBeanDome {

	@Component
	public class SpringA{

//		@Bean
//		public A getA(){
//			return new A();
//		}
	}

	@Component
	public class SpringB{

	}
}
