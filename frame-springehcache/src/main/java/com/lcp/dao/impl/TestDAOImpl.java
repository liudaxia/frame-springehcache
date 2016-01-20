package com.lcp.dao.impl;

import org.springframework.stereotype.Repository;

import com.lcp.dao.TestDAO;
@Repository
public class TestDAOImpl implements TestDAO {

	public String testCache(String key) {
		System.out.println("TestDAOImpl testCache start....Means not hit cache ");
		return key+" I'back";
	}

}
