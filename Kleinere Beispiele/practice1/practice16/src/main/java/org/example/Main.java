package org.example;

public class Main {
    public static void main(String[] args) {
        Student[] studentArray = new Student[2];

        studentArray[0] = new Student("Paul", 19238);
        studentArray[1] = new Student("Peter", 999);

        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].getMatrikelnummer() > 1000) {
                System.out.println(studentArray[i].getName() + " has Matrikelnumber greater than 1000.");
            }
        }
    }
}