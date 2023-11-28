package logic;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public String searchThisAnimal() {
        System.out.println("Type in the animal you are looking for: ");
        return scanner.nextLine();
    }
}
