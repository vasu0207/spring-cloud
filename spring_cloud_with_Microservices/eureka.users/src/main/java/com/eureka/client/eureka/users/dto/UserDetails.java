package com.eureka.client.eureka.users.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDetails {

    private int id;
    private String name;
    private  String companyName;
    private List<VehicleDto> vehicles= new ArrayList();

    public UserDetails(int id, String name, String companyName) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<VehicleDto> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VehicleDto> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", vehicles='" + vehicles + '\'' +
                '}';
    }
}
