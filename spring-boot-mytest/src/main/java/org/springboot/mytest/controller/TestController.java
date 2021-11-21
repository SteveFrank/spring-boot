package org.springboot.mytest.controller;

import org.springboot.mytest.pojo.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author frankq
 * @date 2021/11/21
 */
@RestController
public class TestController {

	@Autowired
	private SimpleBean simpleBean;

	@RequestMapping("/test")
	public String test(){
		System.out.println("源码环境构建成功...");
		System.out.println(simpleBean);
		return "源码环境构建成功";
	}






/*	@Value("${com.name}")
	private String name;

	@Value("${com.location}")
	private String location;

	@RequestMapping("/profile")
	public String profileTest(){
		System.out.println(name + "hello springboot ! " + location);
		return name + "hello springboot ! " + location;
	}*/


}
