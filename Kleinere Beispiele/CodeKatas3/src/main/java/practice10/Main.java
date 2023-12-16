package practice10;

public class Main {
    public static void main(String[] args) {


        int[] numberArray = {1, 2, 5, 2, 4, 5, 2, 3};
        int numberToBeSearched = 2;


        int numberOfMatches = 0;
        for (int number : numberArray) {
            if (number == numberToBeSearched) {
                numberOfMatches += 1;
            }
        }
        System.out.println("Number of matches: " + numberOfMatches);


    }
}
