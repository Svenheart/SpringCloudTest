package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:com.example.demo
 * @description:
 * @class:controller
 * @author:SanCheng
 * @create:2018-10-09-19-13
 **/
@RestController
public class controller {
	@Value("${foo}")
	String foo;
	@RequestMapping("/")
	public String sayHello(){
		return "Hello "+foo;
	}
}
