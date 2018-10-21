package com.example.eurekaclientfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:com.example.eurekaclientfeign
 * @description:
 * @class:HiController
 * @author:SanCheng
 * @create:2018-10-21
 **/
@RestController
public class SayHiController {
	@Autowired
	HiService hiService;
	@GetMapping("/hi")
	public String sayHi(){
		return hiService.sayHi();
	}
}
