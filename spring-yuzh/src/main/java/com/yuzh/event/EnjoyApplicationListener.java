package com.yuzh.event;

import com.yuzh.SpringTest.Apple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


public class EnjoyApplicationListener implements ApplicationListener<EnjoyEvent>{

	public static final Logger log = LoggerFactory.getLogger(EnjoyApplicationListener.class);


	@Override
	public void onApplicationEvent(EnjoyEvent event) {
		if (event instanceof EnjoyEvent){
			Apple appleId =(Apple) event.getSource();
			log.info("苹果ID为：{}",appleId.getId());
		}
	}
}
