package org.example;

import java.util.Scanner;

public class Main {/*

    public static String compliment(String name, String compliment) {
        String sentence = name + compliment ;
        return sentence;
    }

    public static void main(String[] args) {

        System.out.println(compliment("Peter"," du bist Spitze!"));
    }*/

    public static String compliment(String name) {
        return name + " ist echt cool!";
    }

    public static void main(String[] args) {
        String result = compliment("Markus");
        System.out.println(result);
        result = compliment("Hans");
        System.out.println(result);

    }

}
