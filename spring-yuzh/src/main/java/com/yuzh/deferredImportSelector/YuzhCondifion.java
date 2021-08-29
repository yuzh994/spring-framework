package com.yuzh.deferredImportSelector;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class YuzhCondifion implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		/**
		 * 在这里实现逻辑
		 */

		return true;
	}
}
