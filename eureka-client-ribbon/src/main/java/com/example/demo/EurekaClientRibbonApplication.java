package com.example.demo;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @program:com.example.demo.service
 * @description:hystrix熔断器ribbon负载均衡
 * @class:RibbonService
 * @author:SanCheng
 * @create:2018-10-07-17-39
 **/
@EnableHystrix
@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
public class EurekaClientRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientRibbonApplication.class, args);
	}
	@Bean
	public ServletRegistrationBean hystrixMetricsStreamServlet() {
		ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
		registration.addUrlMappings("/actuator/hystrix.stream");
		return registration;
	}//解决打不开http://localhost:8764/hystrix.stream的问题

}
