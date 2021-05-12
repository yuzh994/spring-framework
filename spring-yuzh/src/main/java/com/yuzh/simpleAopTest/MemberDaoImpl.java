package com.yuzh.simpleAopTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemberDaoImpl implements IMemberDao{
	public static final Logger log = LoggerFactory.getLogger(MemberDaoImpl.class);

	@Override
	public String getMember(Long id) {
		log.info("getMember() 执行成功");
		return "getMember() 执行成功";
	}
}
