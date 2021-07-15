package com.yuzh.services;

import com.yuzh.dao.IndexDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class MemberService {
	public static final Logger log = LoggerFactory.getLogger(MemberService.class);

//	@Autowired
//	IndexDao indexDao;

	public List<Map<String, Object>>getMember(){
//		List<Map<String, Object>> list = indexDao.list();
//		return list;
		return null;
	}
}
