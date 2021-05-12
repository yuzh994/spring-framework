package com.yuzh.simpleAopTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemberDaoImplProxy implements IMemberDao{
	public static final Logger log = LoggerFactory.getLogger(MemberDaoImpl.class);

	IMemberDao iMemberDao;

	public MemberDaoImplProxy(IMemberDao iMemberDao) {
		this.iMemberDao = iMemberDao;
	}

	@Override
	public String getMember(Long id) {
		log.debug("前置====");
		String member = null;
		try {
			member = iMemberDao.getMember(id);
			log.info("后置====");
			return member;
		}catch (Exception e){
			log.info("异常====");
		}
		log.info("后置====");
		return member;
	}
}
