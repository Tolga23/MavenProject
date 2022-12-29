package com.dersler.oop.workers;

public class DevLead extends Worker implements Codable {
    public String writeCode() {
        return "He cna write code";
    }

    public String workerRole() {
        return "Lead Dev";
    }
}
