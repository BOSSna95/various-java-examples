package practice9;

public class Main {
    public static void main(String[] args) {

        double[] numberArray = {1.7, 4.5, 6.7, 3.1};
        double biggestNumber = 0;

        for (double number : numberArray) {
            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }
        System.out.println(biggestNumber);
    }
}