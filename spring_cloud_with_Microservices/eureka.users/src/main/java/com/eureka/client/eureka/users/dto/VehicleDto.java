package com.eureka.client.eureka.users.dto;

public class VehicleDto {

    private int vehicleId;
    private int ChasisNumber;
    private String model;
    private int userId;

    public VehicleDto(int vehicleId, int chasisNumber, String model, int userId) {
        this.vehicleId = vehicleId;
        ChasisNumber = chasisNumber;
        this.model = model;
        this.userId = userId;
    }

    public VehicleDto() {
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getChasisNumber() {
        return ChasisNumber;
    }

    public void setChasisNumber(int chasisNumber) {
        ChasisNumber = chasisNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "VehicleDto{" +
                "vehicleId=" + vehicleId +
                ", ChasisNumber=" + ChasisNumber +
                ", userId=" + userId +
                ", model='" + model + '\'' +
                '}';
    }
}
