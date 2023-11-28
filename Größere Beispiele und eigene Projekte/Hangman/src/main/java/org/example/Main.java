package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] countries = {"Austria", "Switzerland",
                "Australia", "Italy", "Hungary", "Sweden",
                "Japan", "Cambodia", "Canada", "Dschibuti"};

        String country = getRandomCountry(countries);
        String lowerCaseCountry = country.toLowerCase(); // Wozu war das in Loop?! Wird dann nicht jedes mal initalisiert?!
        String[] countryArr = country.split(""); // Wozu war das in Loop?! Wird dann nicht jedes mal initalisiert?!

        String[] guesses = initiateGuesses(country);

        System.out.println();

        int lives = chooseDifficulty(scanner);

        printLives(lives);

        System.out.println("Current guess: ");
        printGuess(guesses);
        System.out.println("______________________________");

        while (lives != 0) {

            System.out.println("If you want to guess the country type: yes. Otherwise press Enter! ");

            String fullGuess = "";
            while (input(scanner).equalsIgnoreCase("yes")) {

                System.out.println("What is your guess? ");
                fullGuess = input(scanner);

                if (fullGuess.equalsIgnoreCase(country)) {
                    break;
                } else {
                    printLives(lives);
                    lives = wrongGuess(lives);
                    printGuess(guesses);
                    System.out.println("______________________________");
                    System.out.println("If you want to guess the country type: yes. Otherwise press Enter! ");
                }
            }
            if (fullGuess.equalsIgnoreCase(country)) {
                break;
            }

            System.out.print("Enter a letter: ");
            String inputLetter = input(scanner);

            inputLetter = validatedInput(scanner, inputLetter);

            String lowerCaseLetter = inputLetter.toLowerCase();

            if (lowerCaseCountry.contains(lowerCaseLetter)) {

                ifGuessIsCorrect(countryArr, inputLetter, guesses);

                int i;
                for (i = 0; i < guesses.length; i++) {
                    if (guesses[i].equals("_")) {
                        break;
                    }
                }
                if (i == guesses.length) {
                    break;
                }
            } else {
                lives = wrongGuess(lives);
            }

            printLives(lives);
            System.out.println("Current guess: ");
            printGuess(guesses);
            System.out.println("______________________________");
        }
        winOrLoseInfo(lives, country);
    }


    private static int wrongGuess(int lives) {
        System.out.println("You lost a life!");
        return --lives;
    }


    private static void printLives(int lives) {
        if (lives == 1) {
            System.out.println("You have " + lives + " live!");
        } else {
            System.out.println("You have " + lives + " lives!");
        }
    }


    private static void winOrLoseInfo(int lives, String country) {
        if (lives > 0) {
            System.out.println("Correct! The country is: " + country);
        } else {
            System.out.println("You lost! The correct country was: " + country);
        }
    }


    private static int chooseDifficulty(Scanner scanner) {

        System.out.println("Please choose a difficulty: baby, normal, hard, god.");
        String difficulty = input(scanner).toLowerCase();
        while (!difficulty.equals("baby") &&
                !difficulty.equals("normal") &&
                !difficulty.equals("hard") &&
                !difficulty.equals("god")) {
            System.out.println("Input is not valid. Try again!");
            difficulty = input(scanner).toLowerCase();
        }
        return switch (difficulty) {
            case "baby" -> 9;
            case "normal" -> 6;
            case "hard" -> 4;
            case "god" -> 1;
            default -> 0;
        };
    }

    private static void ifGuessIsCorrect(String[] countryArr, String inputLetter, String[] guesses) {
        for (int i = 0; i < countryArr.length; i++) {
            if (countryArr[i].equalsIgnoreCase(inputLetter)) { // IgnoreCase nicht möglich für Eingabe?
                guesses[i] = countryArr[i];
            }
        }
    }

    private static String input(Scanner scanner) {
        return scanner.nextLine();
    }

    private static String validatedInput(Scanner scanner, String inputLetter) {
        while (!inputLetter.matches("[a-zA-Z]")) {
            System.out.print("Input invalid. Enter a letter: ");
            inputLetter = scanner.nextLine();
        }
        return inputLetter;
    }

    private static String[] initiateGuesses(String country) {

        String[] guesses = new String[country.length()];
        Arrays.fill(guesses, "_");
        return guesses;
    }

    private static String getRandomCountry(String[] countries) {
        Random random = new Random();
        int randomNumber = random.nextInt(countries.length);
        return countries[randomNumber];
    }

    private static void printGuess(String[] guesses) {
        for (String i : guesses) {
            System.out.print(i);
        }
        System.out.println();
    }
}