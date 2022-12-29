package com.dersler.oopproject.vehicles;

public abstract class Vehicles {

    private int vehicleYear;

    private EnumVehicleType vehicleType;

    public abstract float speed();

    public abstract void vehicleAttributes();

    public int getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }


    public EnumVehicleType getVehicleType() {return vehicleType;  }

    public void setVehicleType(EnumVehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
