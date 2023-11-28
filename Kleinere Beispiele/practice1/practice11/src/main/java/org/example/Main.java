package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberArray[] = new int[10];

        Scanner numberScanner = new Scanner(System.in);


        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Give me a number! ");
            String input = numberScanner.nextLine();
            int convertedNunmber = Integer.parseInt(input);

            numberArray[i] = convertedNunmber;

        }

        float arraySum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            arraySum = arraySum + numberArray[i];
        }

        System.out.println(arraySum/numberArray.length);
    }
}