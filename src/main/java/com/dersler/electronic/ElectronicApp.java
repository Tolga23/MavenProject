package com.dersler.electronic;

import com.dersler.electronic.devices.ElectronicDevice;
import com.dersler.electronic.devices.EnumElectronicBrand;
import com.dersler.electronic.devices.bilgisayar.Computer;
import com.dersler.electronic.devices.telefon.MobilePhone;
import com.dersler.electronic.devices.television.Television;

import java.util.ArrayList;
import java.util.List;

public class ElectronicApp {
    public static void main(String[] args) {
       /* Computer computer = new Computer();
        computer.setElectronicBrand(EnumElectronicBrand.LG);
        computer.electronicAtrributes();

        System.out.println("-------------------------------------");

        MobilePhone phone = new MobilePhone();
        phone.setElectronicBrand(EnumElectronicBrand.Samsung);
        phone.electronicAtrributes();


        System.out.println("-------------------------------------");

        Television tv = new Television();
        tv.setElectronicBrand(EnumElectronicBrand.Arcelik);
        tv.electronicAtrributes();*/

        List<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
        devices.add(new MobilePhone());
        devices.add(new Computer());

        Controller controller = new Controller(devices);
        controller.allDeviceInformation();


    }
}
