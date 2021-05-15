package com.yuzh.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface IndexDao {

	@Select({"select * from member"})
	public List<Map<String,Object>> list();


	@Select("select * from aaaa")
	public List<Map<String,Object>> xxxx();
}
