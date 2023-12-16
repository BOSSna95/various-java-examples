package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String words[] = new String[2];

        Scanner Scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.println("Give me a word: ");
            String input = Scanner.nextLine();
            words[i] = input;
        }
        if (words[0].length() > words[1].length()) {
            System.out.println("Word " + words[1] + " is shorter!");
        } else {
            System.out.println("Word " + words[0] + " is shorter!");

        }
    }
}