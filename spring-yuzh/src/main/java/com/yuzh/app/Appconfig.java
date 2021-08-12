package com.yuzh.app;

import com.yuzh.selectimport.DeferredImportSelectorDemo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author yuzh
 * @date 2021/5/12 17:09
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.yuzh.circuar")
public class Appconfig {

}
