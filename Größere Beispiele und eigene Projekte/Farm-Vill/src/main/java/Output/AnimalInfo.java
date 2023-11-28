package Output;

import data.Animal;
import data.Chicken;
import data.Cow;
import data.Sheep;

public class AnimalInfo {

    private Animal[] animals;

    public AnimalInfo(Animal[] animals) {
        this.animals = animals;
    }

    public void showDetails(Animal animal) {
        try {
            System.out.println("The animals name is: " + animal.getName());
            System.out.println("The animals age is: " + animal.getAge());
            if (animal.getClass().equals(Cow.class)) {
                System.out.print("The average milkproduction per day is: " + ((Cow) animal).getAverageMilkProduction());
            } else if (animal.getClass().equals(Chicken.class)) {
                System.out.print("The average eggproduction per day is: " + ((Chicken) animal).getAverageEggProduction());
            } else if (animal.getClass().equals(Sheep.class)) {
                System.out.print("The average woolproduction per day is: " + ((Sheep) animal).getAverageWoolProduction());
            }
        } catch (NullPointerException e) {
            System.out.println("The animal you were looking for could not be found!");
        }
    }
}
