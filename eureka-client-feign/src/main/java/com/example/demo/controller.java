package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:com.example.demo
 * @description:
 * @class:controller
 * @author:SanCheng
 * @create:2018-10-08-09-45
 **/
@RestController
public class controller {
	@Autowired
	HiService hiService;
	@GetMapping("/")
	public String sayHi(){
		return hiService.sayHi();
	}
}
