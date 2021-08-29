package com.yuzh.SpringTest;

import com.yuzh.deferredImportSelector.YuzhCondifion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @author yuzh
 * @date 2021/5/12 16:46
 */
//@Component
@Conditional(YuzhCondifion.class)
public class A {
//
//	@Autowired
//	private B b;
}
