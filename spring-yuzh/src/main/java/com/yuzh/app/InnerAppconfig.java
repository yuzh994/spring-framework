package com.yuzh.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yuzh.innerBean")
//@ComponentScans({@ComponentScan("com.yuzh.innerBean") ,@ComponentScan("circuar")})
public class InnerAppconfig {
}
