package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        String number = scanner.nextLine();
        int convertedNumber = Integer.parseInt(number);
        String curentResult = "";
        for (int i = 1; i <= convertedNumber; i++) {
            curentResult = curentResult + i + " ";
            System.out.println(curentResult);
        }
    }
}