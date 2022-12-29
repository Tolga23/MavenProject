package com.dersler.oopproject.vehicles.ground;

import com.dersler.oopproject.vehicles.EnumVehicleType;

public class Car extends Ground {


    public float speed() {
        return 100;
    }

    public void vehicleAttributes() {
        int year = getVehicleYear();
        EnumModel model = getModel();
        EnumVehicleType vehicleType = getVehicleType();
        float carSpeed = speed();


        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
        System.out.println("Type: " + vehicleType + " Car");
        System.out.println("Speed: " + carSpeed);
    }

    public void carModel() {
        System.out.println("");
    }

    @Override
    public void setModel(EnumModel model) {
        super.setModel(model);
    }

    public void move() {
        System.out.println("Car is a movable vehicle.");
    }
}
