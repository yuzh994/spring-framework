package com.yuzh.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuzh
 * @date 2021/5/12 16:46
 */
@Component
public class A {

	@Autowired
	private B b;
}
