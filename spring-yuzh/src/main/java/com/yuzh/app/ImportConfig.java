package com.yuzh.app;

import com.yuzh.SpringTest.A;
import com.yuzh.deferredImportSelector.YuzhDeferredImportSelector;
import com.yuzh.deferredImportSelector.YuzhImportBeanDefinitionRegistrar;
import com.yuzh.deferredImportSelector.YuzhSelectImport;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(A.class)
//@Import(YuzhSelectImport.class)
//@Import(YuzhImportBeanDefinitionRegistrar.class)
//@Import(YuzhDeferredImportSelector.class)
public class ImportConfig {
}
