package org.example;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        //    Schreibe ein Programm, das eine Liste von Zahlen durchläuft und deren Quadratzahlen berechnet.
        //    Verwende dabei die forEach Funktion. Gib das Ergebnis aus.

        ArrayList<Integer> numbersList = new ArrayList <>();
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
        numbersList.add(7);


    //  Consumer<Integer> getSquare = Integer -> System.out.println(Integer*Integer);

        numbersList.forEach(Integer -> System.out.println(Integer*Integer));
    }
}