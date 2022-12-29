package com.dersler.oopproject.vehicles.air;

import com.dersler.oopproject.vehicles.EnumVehicleType;

public class Plane extends Air {
    public float speed() {
        return 500f;
    }

    public void vehicleAttributes() {
        int year = getVehicleYear();
        EnumVehicleType enumVehicleType = getVehicleType();
        float planeSpeed = speed();

        System.out.println("Year: " + year);
        System.out.println("Type: " + enumVehicleType + " Plane");
        System.out.println("Speed: "+ planeSpeed);
    }

    public void fly() {
        System.out.println("Plane can fly.");
    }

    public void move() {
        System.out.println("Plane is a movable vehicle.");
    }
}
