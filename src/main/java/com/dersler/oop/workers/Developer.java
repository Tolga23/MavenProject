package com.dersler.oop.workers;

public class Developer extends Worker implements Codable {


    private float maas;

    public String workerRole() {
        return "Develop Apps";
    }

    public float workerSalary(float _maas) {
        this.maas = _maas;
        _maas += 8000;
        return _maas;
    }

    public float getMaas() {
        return maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }

    public String writeCode() {
        String codeWriter = "He/She can write codes.";
        return codeWriter;
    }
}
