package com.example.eurekaclientfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program:com.example.eurekaclientfeign
 * @description:
 * @class:EuerkaClientFeign
 * @author:SanCheng
 * @create:2018-10-21
 **/
@FeignClient(value = "EUREKA-CLIENT",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EuerkaClientFeign {
	@GetMapping(value = "/")
	String sayHi();
}
