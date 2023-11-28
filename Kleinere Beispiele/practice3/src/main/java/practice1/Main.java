package practice1;

public class Main {
    public static void main(String[] args) {

        int[] numberArray = new int[5];
        numberArray [0] = 1;
        numberArray [1] = 1;
        numberArray [2] = 2;
        numberArray [3] = 1;
        numberArray [4] = 1;

        int sum=0;

        for (int number : numberArray) {
            sum += number;
        }
        System.out.println("The sum is: " + sum);

    }

}
