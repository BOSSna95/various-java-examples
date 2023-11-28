
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte zahl eingeben: ");
        String number = scanner.nextLine();
        int convertedNumber = Integer.parseInt(number);

        if (convertedNumber >= 0) {
            System.out.println("Zahl ist positiv!");
        } else {
            System.out.println("Zahl ist negativ!");
        }

    }

}
