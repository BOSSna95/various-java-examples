package org.example;

import java.util.Scanner;

public class Main {

    static Scanner newScanner = new Scanner(System.in);

    public static void main(String[] args) {

        String wordArray[] = new String[Integer.parseInt(tellArraylength())];

        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = giveWord();
        }
        int i = 0;
        while (i < wordArray.length) {
            if (wordArray[i].length() > 4) {
                System.out.println(wordArray[i]);
            }
            i++;
        }
    }

    public static String tellArraylength() {
        System.out.println("How many words you have? ");
        return newScanner.nextLine();
    }

    public static String giveWord() {
        System.out.println("Give me a word: ");
        return newScanner.nextLine();
    }
}