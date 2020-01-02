package com.eureka.client.controller;

import com.eureka.client.dto.UserDetails;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    @RequestMapping(value= "/hi")
    public String hi(){
        return ( "hi, welcome to Server");

    }

    @RequestMapping(value= "/userdetails")
    public List<UserDetails> getALLUsers(){

        List<UserDetails> users = new ArrayList<>();
        users.add(new UserDetails(1, "name-1", "prokarma"));
        users.add(new UserDetails(2, "name-2", "prokarma"));
        users.add(new UserDetails(3, "name-3", "prokarma"));

        return users;
    }
}
