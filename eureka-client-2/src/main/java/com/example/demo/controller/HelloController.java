package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:com.example.demo.controller
 * @description:
 * @class:HelloController
 * @author:SanCheng
 * @create:2018-10-07-15-21
 **/

@RestController
public class HelloController {
	@Value("${server.port}")
	String port;
	@GetMapping("/")
	public String hello(){
		return "hello port "+port;
	}
}
