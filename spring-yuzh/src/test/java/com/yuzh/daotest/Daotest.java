package com.yuzh.daotest;


import com.alibaba.fastjson.JSON;
import com.yuzh.services.MemberService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;


public class Daotest {

	public static final Logger log = LoggerFactory.getLogger(MemberService.class);

	@Autowired
	MemberService memberService;

	@Test
	public void memberTest(){
		List<Map<String, Object>> member = memberService.getMember();

		log.info(JSON.toJSONString(member));
	}
}
