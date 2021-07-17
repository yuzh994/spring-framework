package com.yuzh.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {


	public static final Logger log = LoggerFactory.getLogger(EnjoyApplicationListener.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		log.info("容器刷新完成");
	}
}
