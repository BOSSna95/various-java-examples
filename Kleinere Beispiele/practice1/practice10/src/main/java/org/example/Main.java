package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberArray[] = new int[5];

        for (int i = 0; i < numberArray.length; i++) {
            Scanner numberScanner = new Scanner(System.in);
            System.out.println("Give me a number: ");
            String input = numberScanner.nextLine();
            int convertedNumber = Integer.parseInt(input);
            numberArray[i] = convertedNumber;
        }
            int arraysum = numberArray[0] + numberArray[1] +numberArray[2] +numberArray[3] +numberArray[4];
        System.out.println("The sum is " +arraysum);
        }
    }