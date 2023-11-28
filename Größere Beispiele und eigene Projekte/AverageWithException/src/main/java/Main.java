import Input.InputService;
import logic.AverageService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputService inputService = new InputService(scanner);
        AverageService averageService = new AverageService(inputService);

        averageService.setAmountOfNumbersToAdd();

        System.out.println("The average of the given numbers is: " + averageService.calculateAverage());

    }
}
