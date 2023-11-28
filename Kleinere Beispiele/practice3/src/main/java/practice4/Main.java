package practice4;

import practice4.logic.StringManipulator;

public class Main {
    public static void main(String[] args) {


        StringManipulator stringManipulator = new StringManipulator();

        System.out.println(stringManipulator.joinStrings("Hallo", " " + "du", "."));

        System.out.println(stringManipulator.joinStrings());
        System.out.println(stringManipulator.joinStrings("Test " + "war " + "erfolgreich!"));

    }
}
