package data;

import data.Animal;

public class Cow extends Animal {
    private final double averageMilkInL;

    public Cow(String name, int age, double averageMilkInL) {
        super(name, age);
        this.averageMilkInL = averageMilkInL;
    }

    public String getDetails() {
        return "Name: "+ getName() +", "+ "Age: "+ getAge() +", "+"Milk in L: "+ averageMilkInL;
    }

    public double getAverageMilkInL() {
        return averageMilkInL;
    }
}
