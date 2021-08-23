package com.yuzh.deferredImportSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class YuzhSelectImport implements ImportSelector {

	/**
	 *
	 *
	 * @param importingClassMetadata
	 * @return
	 */
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {

		/**
		 * 返回类的完整限定名
		 */
		return new String[]{"com.yuzh.SpringTest.A"};
	}
}
