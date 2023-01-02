package com.dersler.contact;

import com.dersler.contact.person.ContactSetting;
import com.dersler.contact.person.EnumChoose;
import com.dersler.contact.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactApp {
    public static void main(String[] args) {

        ContactSetting app = new ContactSetting();
        Scanner sc = new Scanner(System.in);
        ;
        boolean isAvtive = true;


        while (isAvtive) {
            System.out.println("Select your action: \n 1. ADD \n 2. Remove \n 3. Update \n 4. List ");
            int select= sc.nextInt();
            switch (select) {
                case 1:
                    app.selectThing(EnumChoose.Add);
                    break;
                case 2:
                    app.selectThing(EnumChoose.Remove);
                     break;
                case 3:
                    app.selectThing(EnumChoose.Update);
                    break;
                case 4:
                    app.selectThing(EnumChoose.List);
                    break;
                default:

            }
        }



    }
}
