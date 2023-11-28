package org.example.data;

import java.util.Scanner;

public class Inputs {

    private final Scanner scanner;

    public Inputs(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        return scanner.nextLine();
    }


}
