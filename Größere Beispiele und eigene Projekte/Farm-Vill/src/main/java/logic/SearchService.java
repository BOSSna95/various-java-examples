package logic;

import data.Animal;


public class SearchService {

    private Animal[] animals;

    private Input input;

    public SearchService(Animal[] animals, Input input) {
        this.animals = animals;
        this.input = input;
    }


    public Animal findAnimal() {
        String animalToBeSearched = input.searchThisAnimal();
        Animal foundAnimal = null;

        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(animalToBeSearched)) {
                foundAnimal = animal;
            }
        }
        return foundAnimal;
    }
}