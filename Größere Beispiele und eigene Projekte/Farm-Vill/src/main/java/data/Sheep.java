package data;

public class Sheep extends Animal {

    private int averageWoolProduction;


    public Sheep(String name, int age,int averageWoolProduction) {
        super(name, age);
        this.averageWoolProduction = averageWoolProduction;
    }
    public void setAverageWoolProduction(int averageWoolProduction) {
        this.averageWoolProduction = averageWoolProduction;
    }
    public int getAverageWoolProduction() {
        return averageWoolProduction;
    }








}
