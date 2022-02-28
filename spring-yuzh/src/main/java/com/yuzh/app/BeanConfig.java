package com.yuzh.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.yuzh.circuar")
@EnableAspectJAutoProxy
public class BeanConfig {

}
