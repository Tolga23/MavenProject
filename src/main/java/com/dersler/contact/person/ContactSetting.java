package com.dersler.contact.person;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ContactSetting {

    private EnumChoose choose;
    int id;
    String name;
    long tel;
    String town;

    List<Person> _person = new ArrayList<Person>();
    Scanner sc = new Scanner(System.in);


    public void selectThing(EnumChoose choose) {

        switch (choose) {
            case Add:
                System.out.println("Name: ");
                name = sc.next();
                System.out.println("Tel: ");
                tel = sc.nextLong();
                System.out.println("Town: ");
                town = sc.next();

                _person.add(new Person(name, tel, town));
                break;

            case Remove:
                System.out.println("Enter ID for Remove Person");
                int removeId = sc.nextInt();
                //deleteById(_person,removeId);
                deleteByIdWithEquals(removeId);
                break;
            case Update:
                System.out.println("ID Search: ");
                id = sc.nextInt();
                System.out.println("Name: ");
                name = sc.next();
                System.out.println("Tel: ");
                tel = sc.nextLong();
                System.out.println("Town: ");
                town = sc.next();

                updatePerson(_person, id, name, tel, town);
                break;
            case List:
                System.out.println("Person Lists");
                for (Person person : _person) {
                    person.printPerson();
                }
                break;
        }
    }

    public Person searchById(List<Person> people, int id) {
        System.out.println("Search your ID");
        for (Person person : people) {
            if (person.getId() == id) {
                return person;
            }
        }
        System.out.println("Person NOT found");
        return null;
    }

    public void deleteById(List<Person> people, int _id) {
        people.removeIf(person -> person.getId() == _id);
    }

    public void deleteByIdWithEquals(int _id) {
        Person deleteObject = new Person();
        deleteObject.setId(_id);
        _person.remove(deleteObject);

    }

    public void updatePerson(List<Person> people, int _id, String name, long tel, String town) {
        searchById(people, _id);
        System.out.println("Update Information");
        ListIterator<Person> iterator = people.listIterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == _id) {
                iterator.set(new Person(name, tel, town));
            }
        }
    }

    public EnumChoose getChoose() {
        return choose;
    }

    public void setChoose(EnumChoose choose) {
        this.choose = choose;
    }
}
