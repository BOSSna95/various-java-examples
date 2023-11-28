package practice12.logic;

public class SumGenerator {

    public void getSum (int [] numberArray) {
        int sum = 0;
        for (int number : numberArray) {
            sum += number;
        }
        System.out.println("The sum of the array is: " + sum);
    }

}
