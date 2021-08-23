package com.yuzh.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yuzh
 * @date 2021/5/12 17:09
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.yuzh.circuar")
public class Appconfig {

}
