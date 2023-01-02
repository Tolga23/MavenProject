package com.dersler.electronic.devices;

public abstract class ElectronicDevice {

    private EnumElectronicBrand electronicBrand;

    public abstract void electronicAtrributes();

    public EnumElectronicBrand getElectronicBrand() {
        return electronicBrand;
    }

    public void setElectronicBrand(EnumElectronicBrand electronicBrand) {
        this.electronicBrand = electronicBrand;
    }

}
