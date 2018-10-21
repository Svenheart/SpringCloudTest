package com.example.eurekaclientfeign;

import org.springframework.stereotype.Component;

/**
 * @program:com.example.eurekaclientfeign
 * @description:
 * @class:HiHystrix
 * @author:SanCheng
 * @create:2018-10-21
 **/
@Component
public class HiHystrix implements EuerkaClientFeign {

	@Override
	public String sayHi() {
		return "hi,error";
	}
}