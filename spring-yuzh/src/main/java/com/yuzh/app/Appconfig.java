package com.yuzh.app;

import com.yuzh.selectimport.DeferredImportSelectorDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author yuzh
 * @date 2021/5/12 17:09
 */
@Configuration
@ComponentScan("com.yuzh.circuar")
@Import(DeferredImportSelectorDemo.class)
public class Appconfig {

}
