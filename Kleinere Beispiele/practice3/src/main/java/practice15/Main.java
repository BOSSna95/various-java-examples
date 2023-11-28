package practice15;

import practice15.Output.Print;
import practice15.logic.FillBoard;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FillBoard fillboard = new FillBoard();

        String[][] chessboard = new String[8][8];
        Print print = new Print();


        /*
       for (String [] Array : chessboard) {
            fillboard.fillBoardWithBlack(Array);
      }

      fillboard.addWhiteSquaresToBoardOddNumbers(chessboard [0]);
      fillboard.addWhiteSquaresToBoardOddNumbers(chessboard [2]);
      fillboard.addWhiteSquaresToBoardOddNumbers(chessboard [4]);
      fillboard.addWhiteSquaresToBoardOddNumbers(chessboard [6]);

      fillboard.addWhiteSquaresToBoardEvenNumbers(chessboard [1]);
      fillboard.addWhiteSquaresToBoardEvenNumbers(chessboard [3]);
      fillboard.addWhiteSquaresToBoardEvenNumbers(chessboard [5]);
      fillboard.addWhiteSquaresToBoardEvenNumbers(chessboard [7]);
*/
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
