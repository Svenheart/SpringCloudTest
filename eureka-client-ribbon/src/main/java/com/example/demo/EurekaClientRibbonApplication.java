package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @program:com.example.demo.service
 * @description:hystrix熔断器ribbon负载均衡
 * @class:RibbonService
 * @author:SanCheng
 * @create:2018-10-07-17-39
 **/
@EnableEurekaClient
@EnableHystrix
@SpringBootApplication
public class EurekaClientRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientRibbonApplication.class, args);
	}
}
