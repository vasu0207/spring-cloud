package com.eureka.client.eureka.users.controller;

import com.eureka.client.eureka.users.dto.UserDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(url = "http://localhost:8084/eureka",name = "feignUserDetails")
public interface FeignClientInterface {
    @RequestMapping(value = "/getuserdetails", method = RequestMethod.GET)
    public List<UserDetails> getUSers();

}
