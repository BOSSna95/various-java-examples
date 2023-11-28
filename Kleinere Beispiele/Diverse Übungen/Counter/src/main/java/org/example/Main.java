package org.example;

public class Main {

    public static void count(int limit) {
        for (int i = 0; i <= limit; i++) {
            out(i);
        }
    }

    private static void out(int output) {
        System.out.println(output);
    }


    public static void main(String[] args) {
        count( 1000);
        count( 50);
        count( 5);
    }
}