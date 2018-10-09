package com.example.demo.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



/**
 * @program:com.example.demo.service
 * @description:
 * @class:RibbonService
 * @author:SanCheng
 * @create:2018-10-07-17-39
 **/
@Service
public class RibbonService {
	@Autowired
	RestTemplate restTemplate;
	@HystrixCommand(fallbackMethod = "hiError")
	public String hi(){
		return restTemplate.getForObject("http://eureka-client/"/*确定请求应用名（application.properties中spring.application.name的值）*/
				,String.class/*确定响应数据的类型*/);
	}
	public String hiError(){
		return "sorry,error!";
	}
}
