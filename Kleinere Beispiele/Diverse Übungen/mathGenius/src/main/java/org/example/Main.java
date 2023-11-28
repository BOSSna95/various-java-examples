package org.example;

public class Main {

    public static long faculty(int limit) {
        int result = 1;
        for (int startingNumber = 1; startingNumber <= limit; startingNumber++) {
            result = result * startingNumber;
        }
        return result;
    }

    public static boolean isPrimeNumber(int prime) {
        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String calculateCollatz(int number) {
        String result = number + ", ";
        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
            result += number + ",";
        }
        return result;
    }


    public static void main(String[] args) {
        String collatzSerie = calculateCollatz(10);
        System.out.println(collatzSerie);
        long facultyResult = faculty(5);
        System.out.println(facultyResult);
        boolean isPrime = isPrimeNumber(9);
        System.out.println(isPrime);
    }
}