package org.example;

import java.util.Scanner;

public class Main {

    static Scanner Scanner = new Scanner(System.in);

    StringBuilder reversedString = new StringBuilder(); // funktionierte vorher nicht, weil in Main war.

    public static void main(String[] args) {

        System.out.print("How many words? ");
        String[] array = new String[Integer.parseInt(getInput())];

        String[] arrayLowerCases = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Give me a word! ");
            array[i] = getInput();
        }

        System.out.println("_______________");

        getLowerCaseArray(array, arrayLowerCases);

        for (int i = 0; i < array.length; i++) {

            String test = getReversedString(arrayLowerCases, i);

            if (test.equals(array[i])) // equals geht bei "reversedString" nicht, weil Objekt?!?!?
            {
                System.out.println(array[i] + " + " + test);
                System.out.println("_______________");
            }
        }


        /* System.out.println("_______________");

        boolean palindromTest;

        for (int testedWord = 0; testedWord < arrayLowerCases.length; testedWord++) {

            for (int i = 0, y = arrayLowerCases[testedWord].length() - 1; i < y; i++, y--) {
                if (arrayLowerCases[testedWord].charAt(i) != arrayLowerCases[testedWord].charAt(y)) {
                    palindromTest = false;
                    break;
                }
                palindromTest = true;
                if (palindromTest == true) {
                    System.out.println(array[testedWord]);
                }
            }
        }*/
    }

    private static void getLowerCaseArray(String[] array, String[] arrayLowerCases) {
        for (int x = 0; x < array.length; x++) {
            arrayLowerCases[x] = array[x].toLowerCase();
        }
    }


    public static String getReversedString(String[] arrayLowerCases, int i) {

        StringBuilder reversedString = new StringBuilder(); // funktionierte vorher nicht, weil in Main war.
        reversedString.append(arrayLowerCases[i]);
        return String.valueOf(reversedString.reverse());
    }

    public static String getInput() {
        return Scanner.nextLine();
    }
}