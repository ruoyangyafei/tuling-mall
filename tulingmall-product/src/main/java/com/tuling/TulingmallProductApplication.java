package com.tuling;

import com.tuling.tulingmall.dao.PortalProductDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication/*(exclude = GlobalTransactionAutoConfiguration.class)*/
@EnableDiscoveryClient
public class TulingmallProductApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(TulingmallProductApplication.class, args);
		PortalProductDao portalProductDao = (PortalProductDao)applicationContext.getBean("portalProductDao");
		System.out.println("portalProductDao = " + portalProductDao);


	}

}
