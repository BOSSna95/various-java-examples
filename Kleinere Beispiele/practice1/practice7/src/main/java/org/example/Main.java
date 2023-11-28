package org.example;

public class Main {
    public static void main(String[] args) {
        animal dog = new animal();
        animal cat = new animal();

        dog.setName("Charles");
        cat.setName("Bibi");

        System.out.println(dog.getName());
        System.out.println(cat.getName());
    }
}