package com.yuzh.SpringTest;

import com.alibaba.fastjson.JSON;
import com.yuzh.app.Appconfig;
import com.yuzh.services.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

public class MemberTest {

	public static final Logger log = LoggerFactory.getLogger(YuzhTest.class);


	public static void main(String[] args) {
		/**
		 *
		 * 注入mapper对象
		 * <bean id="userMapper" class="org.mybatis.spring.mapper.MapperFactoryBean">
		 *   <property name="mapperInterface" value="com.UserMapper" />
		 *   <property name="sqlSessionFactory" ref="sqlSessionFactory" />
		 * </bean>
		 *
		 * MapperFactoryBean  --->com.UserMapper  ----Object --add  spring
		 */

		//显示的去得到applicationContext对象
		//书写格式
		AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(Appconfig.class);


		MemberService bean = applicationContext.getBean(MemberService.class);
		List<Map<String, Object>> member = bean.getMember();

		log.info(JSON.toJSONString(member));


//		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
//		genericBeanDefinition.setBeanClass(B.class);
//
//
//		AnnotatedGenericBeanDefinition ag= new AnnotatedGenericBeanDefinition(B.class);
//		AnnotationMetadata metadata = ag.getMetadata();
//		log.debug(Component.class.getSimpleName()+"");
//		System.out.println(metadata.hasAnnotation("org.springframework.stereotype.Component"));
//		log.debug("serviceName-{}");

	}
}
