package data;

public class Cow extends Animal{

    private int averageMilkProduction;

    public Cow(String name, int age,int averageMilkProduction) {
        super(name, age);
        this.averageMilkProduction = averageMilkProduction;
    }

    public void setAverageMilkProduction(int averageMilkProduction) {
        this.averageMilkProduction = averageMilkProduction;
    }

    public int getAverageMilkProduction() {
        return averageMilkProduction;
    }
}
