package com.spring.cloud.client;

import com.spring.cloud.client.dao.TestDAO;
import com.spring.cloud.client.dto.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private TestDAO testDAO;


    @RequestMapping(value="/hi")
    public UserDetails printHTML(){
        UserDetails byId = testDAO.findByfName("first name");
        System.out.println(":::::::::::::: "+byId.toString());



        return byId;

    }

}
