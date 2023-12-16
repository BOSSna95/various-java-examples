package example7;

public class Main{
    public static void main(String[] args) {

        int numberOfReputations = 5;
        String wordToPrint = "Halliahllo";

        printWordAmountOfTimes(numberOfReputations, wordToPrint);

    }

    public static void printWordAmountOfTimes (int numberOfReputations, String wordToPrint) {
        if (numberOfReputations > 0) {
            System.out.println(wordToPrint);
            numberOfReputations--;
            printWordAmountOfTimes(numberOfReputations, wordToPrint);
        }
    }
}
