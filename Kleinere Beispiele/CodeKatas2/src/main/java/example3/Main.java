package example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String fullName = scanner.nextLine();
        System.out.println(fullName);

        printInvertedName(fullName);

    }

    public static void printInvertedName (String fullName) {
       String[] nameSplitted =  fullName.split(" ");
        System.out.println(nameSplitted[1] + " " + nameSplitted[0]);

    }
}
