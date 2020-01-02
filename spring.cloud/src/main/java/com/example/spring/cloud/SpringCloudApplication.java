package com.example.spring.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class SpringCloudApplication
{




	public static void main(String[] args) {

        System.out.println("99999999999999999999999999");
        SpringApplication.run(SpringCloudApplication.class, args);
	}

	/*@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        System.out.println("**************************************");
		return builder.sources(SpringCloudApplication.class);

	}*/


}
