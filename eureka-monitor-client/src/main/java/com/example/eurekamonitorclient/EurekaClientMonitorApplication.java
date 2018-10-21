package com.example.eurekamonitorclient;


import com.netflix.turbine.streaming.servlet.TurbineStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;


@EnableTurbine
@SpringBootApplication
public class EurekaClientMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientMonitorApplication.class, args);
	}

}
