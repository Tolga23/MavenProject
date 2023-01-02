package com.dersler.electronic.devices.bilgisayar;

import com.dersler.electronic.ConnectableWifi;
import com.dersler.electronic.Turnable;
import com.dersler.electronic.devices.ElectronicDevice;
import com.dersler.electronic.devices.EnumElectronicBrand;

public class Computer extends ElectronicDevice implements Turnable, ConnectableWifi {

    public void turnOn() {
        System.out.println("Turn on Computer");
    }

    public void turnOff() {
        System.out.println("Turn Off Computer.");
    }


    public void electronicAtrributes() {
        EnumElectronicBrand computerBrand = getElectronicBrand();

        System.out.println("Computer Brand: " + computerBrand);
        connectWifi();
    }


    public void connectWifi() {
        System.out.println("Computer connected WIFI");
    }

    public void disconnectWifi() {
        System.out.println("Computer disconnected WIFI");
    }
}
