import control.Option;
import control.Service;
import data.Animal;
import data.Chicken;
import data.Cow;
import data.Sheep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        animals[0] = new Cow("Milka", 5, 5.7);
        animals[1] = new Cow("Borka", 4, 8.0);
        animals[2] = new Sheep("Belka", 2, 2.3);
        animals[3] = new Chicken("Graorka", 3, 2);
        animals[4] = new Sheep("Sarka", 3, 3.4);
        animals[5] = new Cow("Ruska", 2, 3.6);
        animals[6] = new Chicken("Golosijaknka", 2, 4);
        animals[7] = new Chicken("Morkinja", 6, 6);
        animals[8] = new Cow("Rogonja", 9, 5.3);
        animals[9] = new Sheep("Mica", 4, 4.2);

        Scanner scanner = new Scanner(System.in);
        Service service = new Service(scanner);
        String animalType = service.chooseAnimalType().toLowerCase();
        String searchOption = service.chooseSearchOption();

        Option option = new Option(scanner);
        service.getResult(animalType, searchOption, animals, option);
    }
}
