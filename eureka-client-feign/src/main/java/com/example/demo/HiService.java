package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program:com.example.demo
 * @description:
 * @class:HiService
 * @author:SanCheng
 * @create:2018-10-08-09-42
 **/
@Service
public class HiService {
	@Autowired
	EurekaClientFeign eurekaClientFeign;
	public String sayHi(){
		return eurekaClientFeign.sayHiFromClientEureka();
	}
}
