package com.dersler.oop.workers;

public abstract class Worker {


    private String name;
    private Gender gender;

    public abstract String workerRole();

    public float workerSalary(float maas) {
        maas += 8000f;
        return maas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
