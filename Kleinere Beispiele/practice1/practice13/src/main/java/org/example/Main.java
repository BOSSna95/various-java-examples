package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Wie viele Zahlen sind im Array? ");
        String input = Scanner.nextLine();
        int convertedNumber = Integer.parseInt(input);

        int numberArray[] = new int[convertedNumber];

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Give me a number. ");
            input = Scanner.nextLine();
            convertedNumber = Integer.parseInt(input);
            numberArray[i] = convertedNumber;
        }
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 == 0) {
            System.out.println(numberArray[i]);}
        }
    }
}
