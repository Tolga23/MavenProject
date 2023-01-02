package com.dersler.electronic;

import com.dersler.electronic.devices.ElectronicDevice;

import java.util.List;

public class Controller {
    List<ElectronicDevice> devices;

    public Controller(List<ElectronicDevice> devices) {
        this.devices = devices;
    }

    void allDeviceInformation(){
        for (ElectronicDevice device: devices) {
            device.electronicAtrributes();
            System.out.println("--------------------------");
        }

    }
}
