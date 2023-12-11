package org.example.logic;

import org.example.Prints;
import org.example.data.Inputs;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static String[] field;

    public static void main(String[] args) {

        field = new String[9];
        fillFields(field);
        Scanner scanner = new Scanner(System.in);
        Inputs input1 = new Inputs(scanner);
        Validations validation = new Validations(input1);
        Prints print = new Prints();
        Draw draw = new Draw();
        Win win = new Win(print);


        String input;
        String player1 = "X";
        String player2 = "O";


        while (true) {

            print.printSpielfeld(field);

            System.out.println("Where would you like to place the X?!");
            boolean validatedInput = validation.inputValidator(input = input1.getInput());

            int validatedPlacement = validation.placementValidator(input, validatedInput, field);
            field[validatedPlacement - 1] = "X";


            if (win.checkIfWin(field, player1)) {
                win.player1won(field);
                break;
            }


            if (draw.checkIfDraw(field)) {
                System.out.println("The game was a draw. Better luck next time!");
                print.printSpielfeld(field);
                break;
            }

            print.printSpielfeld(field);

            System.out.println("Where would you like to place the O?!");
            validatedInput = validation.inputValidator(input = input1.getInput());

            validatedPlacement = validation.placementValidator(input, validatedInput, field);
            field[validatedPlacement - 1] = "O";

            if (win.checkIfWin(field, player2)) {

    //        win.nikoCanNotLose();
              win.player2won(field);

                break;
            }
        }
    }


    public static void fillFields(String[] field) {
        Arrays.fill(field, " ");
    }
}
