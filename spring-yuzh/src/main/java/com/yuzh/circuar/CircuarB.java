package com.yuzh.circuar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircuarB {
	@Autowired
	private CircuarA circuarA;
}
