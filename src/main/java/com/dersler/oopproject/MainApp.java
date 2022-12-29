package com.dersler.oopproject;

import com.dersler.oopproject.vehicles.EnumVehicleType;
import com.dersler.oopproject.vehicles.air.Plane;
import com.dersler.oopproject.vehicles.ground.Car;
import com.dersler.oopproject.vehicles.ground.EnumModel;
import com.dersler.oopproject.vehicles.sea.Ship;

public class MainApp {
    public static void main(String[] args) {

        Ship sp = new Ship();
        sp.setVehicleYear(1992);
        sp.setEnumVehicleType(EnumVehicleType.Transport);
        sp.vehicleAttributes();
        sp.move();

        System.out.println("----------------------------------");

        Car car = new Car();
        car.setVehicleYear(1800);
        car.setModel(EnumModel.BMW);
        car.setVehicleType(EnumVehicleType.Passanger);
        car.vehicleAttributes();
        car.move();

        System.out.println("----------------------------------");
        Plane plane = new Plane();
        plane.setVehicleYear(2000);
        plane.setVehicleType(EnumVehicleType.Passanger);
        plane.vehicleAttributes();
        plane.fly();


    }
}
