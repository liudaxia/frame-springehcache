package com.lcp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.lcp.dao.TestDAO;
import com.lcp.service.TestService;
@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDAO testDAO;

	public String TestName(String name) {
		System.out.println("TestServiceImpl TestName params:"+name);
		String word=name+":I'm coming";
		return word;
	}
	@Cacheable(value="myehcache",key="'aa'")
	public String testCache(String key){
		return testDAO.testCache(key);
	}
	
	@Cacheable(value="cache2",key="#key")
	public String testCache2(String key){
		System.out.println("this is cache2");
		return "I'm cache2";
	}

}
