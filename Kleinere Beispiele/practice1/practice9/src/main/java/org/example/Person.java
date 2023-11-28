package org.example;

public class Person {
    private String firstName;
    private String secondName;

    private int age;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getSecondNameName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }
}
