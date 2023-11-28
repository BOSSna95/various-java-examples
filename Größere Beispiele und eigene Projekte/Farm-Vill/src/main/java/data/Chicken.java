package data;

public class Chicken extends Animal{

    private int averageEggProduction;


    public Chicken(String name, int age,int averageEggProduction) {
        super(name, age);
        this.averageEggProduction = averageEggProduction;
    }

    public void setAverageEggProduction(int averageEggProduction) {
        this.averageEggProduction = averageEggProduction;
    }

    public int getAverageEggProduction() {
        return averageEggProduction;
    }
}