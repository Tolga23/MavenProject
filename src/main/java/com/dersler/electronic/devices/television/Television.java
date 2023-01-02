package com.dersler.electronic.devices.television;

import com.dersler.electronic.Plugable;
import com.dersler.electronic.Turnable;
import com.dersler.electronic.devices.ElectronicDevice;
import com.dersler.electronic.devices.EnumElectronicBrand;

public class Television extends ElectronicDevice implements Turnable, Plugable {
    public void turnOn() {
        System.out.println("Turn On Television.");
    }

    public void turnOff() {
        System.out.println("Turn off Television.");
    }

    public void electronicAtrributes() {
        EnumElectronicBrand televisionBrand = getElectronicBrand();


        System.out.println("TV Brand: "+ televisionBrand);
        connectCable();

    }

    public void connectCable() {
        System.out.println("TV connected Cable.");
    }

    public void disconnectCable() {
        System.out.println("TV disconnected Cable");
    }
}
