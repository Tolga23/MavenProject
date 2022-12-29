package com.dersler.oopproject.vehicles.sea;

import com.dersler.oopproject.vehicles.EnumVehicleType;

public class Ship extends Sea {

    private float shipSpeed;

    public float speed() {
        return 50f;
    }

    public void vehicleAttributes() {
        int age = getVehicleYear();
        EnumVehicleType enumVehicleType = getEnumVehicleType();
        float shipSpeed = speed();

        System.out.println("Year: " + age);
        System.out.println("Type: " + enumVehicleType + " Ship");
        System.out.println("Speed: " + shipSpeed);
    }

    public void move() {
        System.out.println("Ship is a movable vehicle.");
    }
}
