package org.example;

import org.example.Output.Print;
import org.example.logic.FillBoard;

public class Main {
    public static void main(String[] args) {

        FillBoard fillboard = new FillBoard();

        String[][] chessboard = new String[8][8];
        Print print = new Print();

        boolean flag = true;

        for (String[] strings : chessboard) {
            fillboard.fillArray(flag, strings);
            flag = !flag;

        }

        for (String [] Array : chessboard) {
            print.printArrays(Array);
        }
    }
}
