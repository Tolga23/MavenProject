package com.dersler.contact.person;

public class Person {

    private int id;
    private static int incID = 0;
    private String name;
    private long tel;
    private String town;

    ContactSetting cs;

    public Person() {

    }

    public Person(String name, long tel, String town) {
        this.id = incID++;
        this.name = name;
        this.tel = tel;
        this.town = town;
    }

    public void printPerson() {
        System.out.println("Id:\t" + id + "\tName: " + name + "\tTel: " + tel + "\tTown: " + town);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id == 0) {
            id = 1;
        } else if (cs != null) {
            incID++;
        }

        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
