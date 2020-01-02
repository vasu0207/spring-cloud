package com.eureka.client.eureka.users.controller;

import com.eureka.client.eureka.users.dto.UserDetails;
import com.eureka.client.eureka.users.dto.VehicleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.http.RestTemplateEurekaHttpClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping(value = "/user")
public class UserController {

    String url ="http://localhost:8084/getVehiclesById/1";

    private RestTemplate restTemplate = new RestTemplate();

    RestTemplateEurekaHttpClient restTemplateEurekaHttpClient = new RestTemplateEurekaHttpClient(new RestTemplate(), url);


    List<UserDetails> users = new ArrayList<>();

    @RequestMapping(value= "/userdetails")
    public List<UserDetails> getALLUsers(){



        return users;
    }

    @PostConstruct
    public void intit(){  users.add(new UserDetails(1, "name-1", "prokarma"));
        users.add(new UserDetails(2, "name-2", "prokarma"));
        users.add(new UserDetails(3, "name-3", "prokarma"));}


    @RequestMapping(value= "/vehiclesById")
    @LoadBalanced
    public UserDetails welcome(){
        UserDetails  userDetails =users.get(1);


        ResponseEntity<List<VehicleDto>> response =
                restTemplate.exchange(url,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<VehicleDto>>(){} );
        userDetails.setVehicles(response.getBody());
        System.out.println(userDetails.toString());
        return userDetails;
    }


}
