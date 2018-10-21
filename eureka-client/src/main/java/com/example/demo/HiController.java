package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:com.example.demo
 * @description:
 * @class:HiController
 * @author:SanCheng
 * @create:2018-10-20
 **/
@RestController
public class HiController {
	@Value("${server.port}")
	String port;
	@GetMapping("/")
	public String home(){
		return "hi "+port;
	}
}
