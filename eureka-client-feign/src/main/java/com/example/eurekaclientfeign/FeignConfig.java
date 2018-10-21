package com.example.eurekaclientfeign;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @program:com.example.eurekaclientfeign
 * @description:
 * @class:FeignConfig
 * @author:SanCheng
 * @create:2018-10-21
 **/
@Configuration
public class FeignConfig {
	@Bean
	public Retryer feignRetryer(){
		return new Retryer.Default(100,SECONDS.toMillis(1),5);
	}
}
