package org.example;

public class Main {

    public static void main(String[] args) {

        double result = calculationplus(4, 2);
        System.out.println(result);
        double result1 = calculationminus(4, 2);
        System.out.println(result1);
        double result2 = calculationmal(4, 2);
        System.out.println(result2);
        double result3 = calculationdurch(4, 2);
        System.out.println(result3);

    }

    public static double calculationplus(double first, double second) {
        return first + second;
    }

    public static double calculationminus(double first, double second) {
        return first - second;
    }

    public static double calculationmal(double first, double second) {
        return first * second;
    }

    public static double calculationdurch(double first, double second) {
        return first / second;

    }
}