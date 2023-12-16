package example8;

public class Main {
    public static void main(String[] args) {

        int startingNumber = 5;
        int sum = 0;
        int finalSum = calculate(startingNumber, sum);
        System.out.println(finalSum);
    }

    public static int calculate(int startingNumber, int sum) {
        while (startingNumber > 0) {
            sum = sum + startingNumber;
            startingNumber--;
            calculate(startingNumber, sum);
        }
        return sum;
    }
}
