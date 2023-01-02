package com.dersler.differences;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class diffApp {
    public static void main(String[] args) {
        int numElements = 100000;

        // Test ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList add time: " + (endTime - startTime) + " ms");

        long _startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        long _endTime = System.currentTimeMillis();
        System.out.println("ArrayList get time: " + (_endTime - _startTime) + " ms");

        long removeRandomArray = System.currentTimeMillis();
        Random rnd = new Random();
        for (int i = 0; i < 10000; i++) {
            int randomIndex = rnd.nextInt(arrayList.size());
            arrayList.remove(randomIndex);
        }
        long endRemoveRandomArray = System.currentTimeMillis();
        System.out.println("ArrayList Remove Random number time: " + (endRemoveRandomArray - removeRandomArray) + " ms");

        long removeTime = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(i);
        }
        long endRemoveTime = System.currentTimeMillis();
        System.out.println("ArrayList remove time: " + (endRemoveTime - removeTime) + " ms");


        // Test LinkedList
        List<Integer> linkedList = new LinkedList<>();
        long linkedStart = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(i);
        }
        long linkedEnt = System.currentTimeMillis();
        System.out.println("LinkedList add time: " + (linkedEnt - linkedStart) + " ms");

        long getLinkedStart = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        long getLinkedEnd = System.currentTimeMillis();
        System.out.println("LinkedList get time: " + (getLinkedEnd - getLinkedStart) + " ms");

        long removeRandomLinked = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int randomIndex = rnd.nextInt(linkedList.size());
            linkedList.remove(randomIndex);
        }
        long endRemoveRandomLinked = System.currentTimeMillis();
        System.out.println("LinkedList Remove Random number time: " + (endRemoveRandomLinked - removeRandomLinked) + " ms");

        long removelinkedStart = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(i);
        }
        long endRemovelinkedEnt = System.currentTimeMillis();
        System.out.println("LinkedList remove time: " + (endRemovelinkedEnt - removelinkedStart) + " ms");

    }

}
