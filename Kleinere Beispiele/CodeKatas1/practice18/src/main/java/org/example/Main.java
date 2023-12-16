package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Personen[] Array = {new Personen("Alex", 30),
                new Personen("Tim", 14),
                new Personen("Jill", 20)};

        for (int i = 0; i < Array.length; i++) {
            if (Array[i].getAge() > 18) {
                System.out.println(Array[i].getName());
            }
        }
    }
}