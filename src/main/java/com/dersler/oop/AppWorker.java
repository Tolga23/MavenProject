package com.dersler.oop;

import com.dersler.oop.workers.Cleaner;
import com.dersler.oop.workers.Developer;

public class AppWorker {
    public static void main(String[] args) {

        Developer dev = new Developer();
        dev.setMaas(500);
        float devMaas = dev.getMaas();

        float currentSalary = dev.workerSalary(devMaas);
        String coder = dev.writeCode();
        System.out.println(coder);
        System.out.println("Maas: " + currentSalary);

        Cleaner cleaner = new Cleaner();
        float cleanerSalary = cleaner.workerSalary(0);
        System.out.println("Cleaner Salary: " + cleanerSalary);

    }
}
