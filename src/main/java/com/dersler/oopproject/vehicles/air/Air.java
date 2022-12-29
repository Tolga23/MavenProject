package com.dersler.oopproject.vehicles.air;

import com.dersler.oopproject.vehicles.EnumVehicleType;
import com.dersler.oopproject.vehicles.Movable;
import com.dersler.oopproject.vehicles.Vehicles;

public abstract class Air extends Vehicles implements Flyable, Movable{

    private EnumVehicleType vehicleType;

    @Override
    public EnumVehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public void setVehicleType(EnumVehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

}
