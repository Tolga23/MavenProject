package com.dersler.electronic.devices.telefon;

import com.dersler.electronic.ConnectableWifi;
import com.dersler.electronic.devices.ElectronicDevice;
import com.dersler.electronic.devices.EnumElectronicBrand;

public class MobilePhone extends ElectronicDevice implements ConnectableWifi {

    public void electronicAtrributes() {
        EnumElectronicBrand mobileBrand = getElectronicBrand();

        System.out.println("Mobile Brand: " + mobileBrand);
        disconnectWifi();
    }

    public void connectWifi() {
        System.out.println("Mobile connected WIFI");
    }

    public void disconnectWifi() {
        System.out.println("Mobile disconnected WIFI");
    }
}
