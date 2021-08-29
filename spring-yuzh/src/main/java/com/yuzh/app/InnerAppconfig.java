package com.yuzh.app;

import com.yuzh.Annotation.MyService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan(value = "com.yuzh.innerBean")
@ComponentScan(value = "com.yuzh.innerBean",
		includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
				value = {MyService.class})}, useDefaultFilters = false)
//@ComponentScans({@ComponentScan("com.yuzh.innerBean") ,@ComponentScan("circuar")})
public class InnerAppconfig {
}
