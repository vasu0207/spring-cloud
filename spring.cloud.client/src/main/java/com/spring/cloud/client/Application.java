package com.spring.cloud.client;

import com.spring.cloud.client.dao.TestDAO;
import com.spring.cloud.client.dto.Address;
import com.spring.cloud.client.dto.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application  {

	private UserDetails userDetails;
	@Autowired
	private TestDAO testDAO;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder){

		return  builder.sources(Application.class);
	}*/

	@PostConstruct
	public void init(){
		System.out.println("SampleController.init");
		userDetails = new UserDetails();
		userDetails.setfName("first name");
		userDetails.setlName("last name");
		Address address = new Address();
		address.setCity("city");
		address.setPincode("500029");
		address.setState("state");
		address.setStreet("street");

		userDetails.getAddresses().add(address);
		testDAO.save(userDetails);


	}
}
