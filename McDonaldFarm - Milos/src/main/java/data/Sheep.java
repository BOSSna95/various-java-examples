package data;

import data.Animal;

public class Sheep extends Animal {
    private final double averageWoolInKg;

    public Sheep(String name, int age, double averageWoolInKg) {
        super(name, age);
        this.averageWoolInKg = averageWoolInKg;
    }

    public String getDetails() {
        return "Name: "+ getName() +", "+ "Age: "+ getAge() +", "+"Wool in kg: "+ averageWoolInKg;
    }

    public double getAverageWoolInKg() {
        return averageWoolInKg;
    }
}
