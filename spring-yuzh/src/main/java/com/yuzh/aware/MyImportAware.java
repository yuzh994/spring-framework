package com.yuzh.aware;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

@Component
public class MyImportAware implements ImportAware , InitializingBean {
	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		System.out.println("importMetadata"+importMetadata);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
}
