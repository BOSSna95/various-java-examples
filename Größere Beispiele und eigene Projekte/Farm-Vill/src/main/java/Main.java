import Output.AnimalInfo;
import data.Animal;
import data.Chicken;
import data.Cow;
import data.Sheep;
import logic.Input;
import logic.SearchService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);

        Sheep sheep1 = new Sheep("Freddy", 4, 4);
        Sheep sheep2 = new Sheep("Marry", 3, 5);
        Sheep sheep3 = new Sheep("Jane", 2, 3);
        Cow cow1 = new Cow("Marie", 8, 25);
        Cow cow2 = new Cow("Gertrud", 7, 30);
        Cow cow3 = new Cow("Annabel", 10, 31);
        Chicken chicken1 = new Chicken("Susi", 2, 4);
        Chicken chicken2 = new Chicken("Bibi", 1, 8);
        Chicken chicken3 = new Chicken("Lara", 3, 6);

        Animal[] animals = {sheep1, sheep2, sheep3, cow1, cow2, cow3, chicken1, chicken2, chicken3};

        AnimalInfo animalInfo = new AnimalInfo(animals);
        SearchService searchService = new SearchService(animals, input);

        animalInfo.showDetails(searchService.findAnimal());
    }
}
