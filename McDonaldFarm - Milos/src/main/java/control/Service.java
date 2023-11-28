package control;

import data.Animal;

import java.util.Scanner;

public class Service {
    private Scanner scanner;

    public Service(Scanner scanner) {
        this.scanner = scanner;
    }

    public String chooseAnimalType() {
        System.out.print("Which animal type are you looking for: ");
        String animalType = scanner.nextLine();
        while (!animalType.equalsIgnoreCase("COW") && !animalType.equalsIgnoreCase("SHEEP") && !animalType.equalsIgnoreCase("CHICKEN")) {
                System.out.print("Please enter COW, SHEEP or CHICKEN: ");
                animalType = scanner.nextLine();
        }
            return animalType;
    }

    public String chooseSearchOption() {
        System.out.println("How do you want to search after the animal: ");
        System.out.println("A: via name");
        System.out.println("B: via age");
        System.out.println("C: via function of animal");
        System.out.println("D: print all animals with that type");
        System.out.print("Please enter A, B, C or D: ");
        String chosenOption = scanner.nextLine();
        while (!chosenOption.equalsIgnoreCase("A") && !chosenOption.equalsIgnoreCase("B") && !chosenOption.equalsIgnoreCase("C") && !chosenOption.equalsIgnoreCase("D")) {
            System.out.print("Please enter A, B, C or D: ");
            chosenOption = scanner.nextLine();
        }
        return chosenOption;
    }

    public void getResult(String animalType, String searchOption, Animal[] animals, Option option) {
        if (searchOption.equalsIgnoreCase("A")) {
            option.optionA(animalType, animals);
        } else if (searchOption.equalsIgnoreCase("B")) {
            option.optionB(animalType, animals);
        } else if (searchOption.equalsIgnoreCase("C")) {
            option.optionC(animalType, animals);
        } else if (searchOption.equalsIgnoreCase("D")) {
            option.optionD(animalType, animals);
        }
    }
}

