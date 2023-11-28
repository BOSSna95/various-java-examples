package org.example;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arrayLength = getInput();

        int[] numberArray = new int[arrayLength];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = getInput();
        }

        //Arrays.sort(numberArray);

        int[] sortedNumbers = new int [arrayLength];

        for (int i = 0; i < arrayLength ; i++) {
            for (int j = 1; j < arrayLength; j++) {
                if (numberArray[i] < numberArray[j]) {
                    sortedNumbers[i] = numberArray[j];
                }
            }

        }


        printSortedNumbers(sortedNumbers);
    }



    public static void printSortedNumbers(int[] sortedNumbers) {
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.println(sortedNumbers[i]);
        }
    }

    public static int getInput() {
        System.out.println("Give me a number: ");
        return Integer.parseInt(Scanner.nextLine());
    }
}
