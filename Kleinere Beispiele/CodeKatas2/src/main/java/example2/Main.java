package example2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int No1 = 2;
        int No2 = 2;
        int No3 = 3;
        int No4 = 4;
        int No5 = 5;
        int No6 = 20;
        int No7 = 7;
        int No8 = 8;
        int No9 = 10;
        int No10 = 1;

        ArrayList<Integer> number2 = new ArrayList<>();

        int[] numbers1 = {No1, No2, No3, No4, No5, No6, No7, No8, No9, No10};
        int biggestNumber = numbers1[0];
        int smallestNumber = numbers1[0];

        for (int number : numbers1) {
                if (number > biggestNumber) {
                    biggestNumber = number;
                }
                if (number < smallestNumber) {
                    smallestNumber = number;
                }
            }

        System.out.println(biggestNumber);
        System.out.println(smallestNumber);
    }
}