package com.yuzh.simpleAopTest;

public class SimpleAopTest {
	public static void main(String[] args) {
		IMemberDao iMemberDao = new MemberDaoImplProxy(new MemberDaoImpl());
		iMemberDao.getMember(1l);
	}
}
