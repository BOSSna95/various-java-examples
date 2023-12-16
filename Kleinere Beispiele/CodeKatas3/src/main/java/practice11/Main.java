package practice11;

public class Main {
    public static void main(String[] args) {

        int[][] numberArray = new int[3][3];
        numberArray[0][0] = 1;
        numberArray[0][1] = 1;
        numberArray[0][2] = 1;
        numberArray[1][0] = 2;
        numberArray[1][1] = 2;
        numberArray[1][2] = 2;
        numberArray[2][0] = 3;
        numberArray[2][1] = 3;
        numberArray[2][2] = 3;

        printArray(numberArray[0]);
        printArray(numberArray[1]);
        printArray(numberArray[2]);

    }
    public static void printArray(int[] numberArray) {
        String line="";
        for (int number : numberArray) {
            line += number + " ";
        }
        System.out.println(line);


    }
}
