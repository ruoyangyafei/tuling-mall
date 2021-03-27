package com.tuling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient  // springboot高版本已经能够自动添加，不加也是可以的
@SpringBootApplication
public class TulingmallAuthcenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TulingmallAuthcenterApplication.class, args);
	}

}
