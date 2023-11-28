package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Erste Zahl? ");
        String number1 = scanner.nextLine();
        int convertedNumber1 = Integer.parseInt(number1);

        System.out.print("Zweite Zahl? ");
        String number2 = scanner.nextLine();
        int convertedNumber2 = Integer.parseInt(number2);

        if (convertedNumber1 > convertedNumber2) {
            System.out.println(convertedNumber1);
        } else {
            System.out.println(convertedNumber2);
        }
    }

}