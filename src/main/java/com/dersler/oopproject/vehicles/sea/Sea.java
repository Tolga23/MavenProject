package com.dersler.oopproject.vehicles.sea;

import com.dersler.oopproject.vehicles.EnumVehicleType;
import com.dersler.oopproject.vehicles.Movable;
import com.dersler.oopproject.vehicles.Vehicles;

public abstract class Sea extends Vehicles implements Movable {
    private EnumVehicleType enumVehicleType;

    public EnumVehicleType getEnumVehicleType() {
        return enumVehicleType;
    }

    public void setEnumVehicleType(EnumVehicleType enumVehicleType) {
        this.enumVehicleType = enumVehicleType;
    }
}
