package com.example.eurekaclientfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program:com.example.eurekaclientfeign
 * @description:
 * @class:HiService
 * @author:SanCheng
 * @create:2018-10-21
 **/
@Service
public class HiService {
	@Autowired
	EuerkaClientFeign euerkaClientFeign;
	public String sayHi(){
		return euerkaClientFeign.sayHi();
	}
}
