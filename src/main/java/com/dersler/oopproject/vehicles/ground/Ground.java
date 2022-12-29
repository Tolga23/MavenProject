package com.dersler.oopproject.vehicles.ground;

import com.dersler.oopproject.vehicles.EnumVehicleType;
import com.dersler.oopproject.vehicles.Movable;
import com.dersler.oopproject.vehicles.Vehicles;

public abstract class Ground extends Vehicles implements Movable {

    private EnumModel model;
    private EnumVehicleType vehicleType;

    public abstract void carModel();

    public EnumModel getModel() {
        return model;
    }

    public void setModel(EnumModel model) {
        this.model = model;
    }

    @Override
    public EnumVehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public void setVehicleType(EnumVehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
