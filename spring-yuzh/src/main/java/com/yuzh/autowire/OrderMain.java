package com.yuzh.autowire;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class OrderMain {


	/**
	 * @Autowired 1.根据类型找bean ，找到一个直接返回 ，没有找到则根据是否是required 是则报错
	 * 2.找到多个 ，先判断是否 运行被依赖 isAutowireCandidate
	 * 3.是否复合 @Qualefier ，如果还有多个
	 * 4.看是否有Bean 被打 @Primary ，有就选，没有继续
	 * 5.取一个优先级最高的bean ,有就选 ，没有就继续
	 * 6.根据名字筛选，属性注入就是属性名 ，如果是set方法，则是参数名字
	 * 7.名字也没有匹配到，则报错
	 *
	 * @Resource
	 * 1.Resource是否有name 属性 ，如果没有泽合 @Autowired 一样
	 * 2.如果有 ，则根据resource的name 去找，没有则报错
	 */
	@Resource(name = "acOrder")
	private OrderInterface orderInterface;
	@Resource(name = "abOrder")
	private OrderInterface orderInterface1;

	public void test() {
		System.out.println(orderInterface.toString());
		System.out.println(orderInterface1.toString());
	}
}
