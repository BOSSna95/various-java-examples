package practice12;

import practice12.logic.SumGenerator;

public class Main {

    public static void main(String[] args) {

        int[][] numberArray = {{1, 1, 1}, {2, 2, 2,}, {3, 3, 3}};

        SumGenerator sumGenerator = new SumGenerator();

        sumGenerator.getSum(numberArray[0]);
        sumGenerator.getSum(numberArray[1]);
        sumGenerator.getSum(numberArray[2]);


    }
}
