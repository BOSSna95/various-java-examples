package example5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Give me a word: ");
        String word = scanner.nextLine();

        printEncodedWord(word);

    }
    public static void printEncodedWord (String word) {

        char[] wordArray = new char[word.length()];
        for (int x = 0; x < wordArray.length; x++) {
            switch (word.charAt(x)) {
                case 'a' -> wordArray[x] = '4';
                case 'e' -> wordArray[x] = '3';
                case 's' -> wordArray[x] = '5';
                case 'o' -> wordArray[x] = '0';
                case 'i' -> wordArray[x] = '1';
                default -> wordArray[x] = word.charAt(x);
            }
        }
        System.out.println(wordArray);
    }
}
