package example4;

import java.util.Scanner;

//import static practice9.Main.checkFastPalindrom;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a word: ");
        String word = scanner.next().toLowerCase();

        int numberOfVowels = checkNumberOfVowels(word);

        printNumberOfVowels(numberOfVowels);
    }


    public static int checkNumberOfVowels(String word) {
        int numberOfVowels = 0;
        for (int x = 0; x < word.length(); x++) {
            switch (String.valueOf(word.charAt(x))) {
                case "a", "e", "i", "o", "u" -> ++numberOfVowels;
            }
        }
        return numberOfVowels;
    }

    public static void printNumberOfVowels(int numberOfVowels) {
        if (numberOfVowels == 1) {
            System.out.println("Your word has " + numberOfVowels + " vowel!");
        } else {
            System.out.println("Your word has " + numberOfVowels + " vowels!");
        }
    }
}