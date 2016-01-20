package com.lcp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lcp.service.TestService;

@Controller
@RequestMapping(value="/test")
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/testName.do")
	public void testName(HttpServletRequest req,HttpServletResponse resp,String name){
		System.out.println("TestController testName params:"+name);
		String word=testService.TestName(name);
		System.out.println("TestController testName returns:"+word);
	};
	
	
	@RequestMapping(value="/testCache.do")
	public void testCache(HttpServletRequest req,HttpServletResponse resp,String key){
		System.out.println("TestController testCache params:"+key);
		String word=testService.testCache(key);
		System.out.println("TestController testCache returns:"+word);
	};
	
	@RequestMapping(value="/testCache2.do")
	public void testCache2(HttpServletRequest req,HttpServletResponse resp,String key){
		System.out.println("TestController testCache2 params:"+key);
		String word=testService.testCache2(key);
		System.out.println("TestController testCache2 returns:"+word);
	};
	
	
}
