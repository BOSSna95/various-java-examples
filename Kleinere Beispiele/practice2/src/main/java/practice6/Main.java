package practice6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String word = "zzAAzz";

        swapCases(word);

    }

    public static void swapCases(String word) {

        String[] splittedWord = word.split("");

        for (int x = 0; x < word.length(); x++) {

            if (Character.isLowerCase(word.charAt(x))) {
                splittedWord[x] = splittedWord[x].toUpperCase();
            } else {
                splittedWord[x] = splittedWord[x].toLowerCase();
            }
        }
        for (int i=0; i < word.length(); i++){
        System.out.print((splittedWord[i]));
    }
}}