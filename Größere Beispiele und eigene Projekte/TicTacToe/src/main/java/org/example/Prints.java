package org.example;

public class Prints {
    public void printSpielfeld(String[] spielfeld) {

        System.out.println(" --- --- --- ");
        System.out.println(String.format("| %s | %s | %s |",spielfeld[6], spielfeld[7], spielfeld[8] ));
        System.out.println(" --- --- --- ");
        System.out.println(String.format("| %s | %s | %s |",spielfeld[3], spielfeld[4], spielfeld[5] ));
        System.out.println(" --- --- --- ");
        System.out.println(String.format("| %s | %s | %s |",spielfeld[0], spielfeld[1], spielfeld[2] ));
        System.out.println(" --- --- --- ");
    }
}
