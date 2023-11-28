package org.example;

public class Main {

    public static int addition(int first, int second) {
        int result = first+second;
        return result;
    }

    public static void main(String[] args) {
        int result = addition(4, 8);
        System.out.println(result);
    }
}