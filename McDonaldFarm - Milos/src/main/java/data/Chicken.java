package data;

import data.Animal;

public class Chicken extends Animal {
    private final int averageEggsPerDay;

    public Chicken(String name, int age, int averageEggsPerDay) {
        super(name, age);
        this.averageEggsPerDay = averageEggsPerDay;
    }

    public String getDetails() {
        return "Name: "+ getName() +", "+ "Age: "+ getAge() +", "+"Eggs per day: "+ averageEggsPerDay;
    }

    public int getAverageEggsPerDay() {
        return averageEggsPerDay;
    }
}
