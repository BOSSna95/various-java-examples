package practice8;

public class Main {

    public static void main(String[] args) {

        int [] numberArray = {1, 3, 2, 3, 1};

        int sum = 0;
        for (int number : numberArray) {
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}
