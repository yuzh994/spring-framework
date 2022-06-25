package com.yuzh.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.yuzh.bean")
@EnableAspectJAutoProxy
public class BeanConfig {

}
