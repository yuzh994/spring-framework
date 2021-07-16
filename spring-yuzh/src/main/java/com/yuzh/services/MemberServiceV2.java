package com.yuzh.services;

import com.yuzh.Annotation.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

@MyService
public class MemberServiceV2 {
	public static final Logger log = LoggerFactory.getLogger(MemberServiceV2.class);


//	@Autowired
//	IndexDao indexDao;
	public List<Map<String, Object>> getMember(){
//		List<Map<String, Object>> list = indexDao.list();
//		return list;
		return null;
	}
}
