package com.eureka.client.vehicle.controller;

import com.eureka.client.vehicle.dto.VehicleDto;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@EnableEurekaClient
public class VehicleController {

    List<VehicleDto> vehicles = new ArrayList<>();

    @RequestMapping(value="/getVehiclesById/{id}")
    public List<VehicleDto>  getVehicles(@PathVariable int id){
        System.out.println("Vehicle-id = [" + id + "]");
        return  vehicles.stream().filter(vehicle -> vehicle.getUserId() == id).collect(Collectors.toList());
    }

    @PostConstruct
    public void init(){

        vehicles.add(new VehicleDto(1,1234,"Hundai",1));
        vehicles.add(new VehicleDto(2,4567,"WoksVagon",1));
        vehicles.add(new VehicleDto(3,8901,"Maruthi",2));
    }

}
