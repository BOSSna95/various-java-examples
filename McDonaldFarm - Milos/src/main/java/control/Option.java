package control;

import data.Animal;
import data.Chicken;
import data.Cow;
import data.Sheep;

import java.util.Scanner;

public class Option {

    private final Scanner scanner;

    boolean animalFound = false;

    public Option(Scanner scanner) {
        this.scanner = scanner;
    }

    public void optionA(String animalType, Animal[] animals) {
        System.out.print("Enter the animals name: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getClass().toString().equalsIgnoreCase("class data." + animalType)
                    && name.equalsIgnoreCase(animal.getName())) {
                System.out.println(animal.getDetails());
                animalFound = true;
                break;
            }
        }
        if (!animalFound) {
            System.out.println(String.format("There is no " + animalType + " with the name %s!", name));
        }
    }

    public void optionB(String animalType, Animal[] animals) {
        System.out.print("Enter the age: ");
        int age;

        while (true) {
            try {
                age = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception NumberFormatException) {
                System.out.print("Please enter an integer number: ");
            }
        }

        for (Animal animal : animals) {
            if (animal.getClass().toString().equalsIgnoreCase("class data." + animalType) && age == animal.getAge()) {
                System.out.println(animal.getDetails());
                animalFound = true;
                break;
            }
        }
        if (!animalFound) {
            System.out.println(String.format("There are no " + animalType + " with the age %d!", age));
        }
    }


    public void optionC(String animalType, Animal[] animals) {

        double animalProduction;

        switch (animalType) {
            case "cow":
                System.out.print("Enter how much milk the cow produces in Liters: ");
                break;
            case "sheep":
                System.out.print("Enter how much wool the sheep produces in kg: ");
                break;
            case "chicken":
                System.out.print("Enter how much eggs the chicken produces: ");
                break;
        }

        while (true) {
            try {
                animalProduction = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception NumberFormatException) {
                System.out.println("Please enter a number: ");
            }
        }

        for (Animal animal : animals) {
            if (animalType.equalsIgnoreCase("cow")) {
                if (animal.getClass().equals(Cow.class) && animalProduction == ((Cow) animal).getAverageMilkInL()) {
                    System.out.println(animal.getDetails());
                    animalFound = true;
                    break;
                }
            }
            if (animalType.equalsIgnoreCase("sheep")) {
                if (animal.getClass().equals(Sheep.class) && animalProduction == ((Sheep) animal).getAverageWoolInKg()) {
                    System.out.println(animal.getDetails());
                    animalFound = true;
                    break;
                }
            }
            if (animalType.equalsIgnoreCase("chicken")) {
                if (animal.getClass().equals(Chicken.class) && animalProduction == ((Chicken) animal).getAverageEggsPerDay()) {
                    System.out.println(animal.getDetails());
                    animalFound = true;
                    break;
                }
            }
        }
        if (!animalFound) {
            switch (animalType) {
                case "cow":
                    System.out.print("There is no such cow which produces that amount of milk!");
                    break;
                case "sheep":
                    System.out.print("There is no such sheep which produces that amount of wool!");
                    break;
                case "chicken":
                    System.out.print("There is no such chicken which lays that amount of eggs!");
                    break;
            }
        }
    }

    public void optionD(String animalType, Animal[] animals) {
        {
            for (Animal animal : animals) {
                if (animal.getClass().toString().equalsIgnoreCase("class data." + animalType)) {
                    System.out.println(animal.getDetails());
                }
            }
        }
    }
}