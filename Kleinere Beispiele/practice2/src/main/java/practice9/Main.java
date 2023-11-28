package practice9;

public class Main {
    public static void main(String[] args) {

        String word = "taliat";

        String reversedWord = reverseWord(word);

        printWordAndReversed(word, reversedWord);

        int numberOfMismatches = checkForMismatches(word, reversedWord);

        boolean almostPalindrom = checkIfPalindrom(numberOfMismatches);

        if (almostPalindrom) {
            System.out.println(word + " is almost a palindrom!");
        } else {
            System.out.println(word + " is not almost a palindrom");
        }
    }


    public static String reverseWord(String word) {

        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();
        return String.valueOf(reversedWord);
    }

    private static void printWordAndReversed(String word, String reversedWord) {
        System.out.println(word);
        System.out.println(reversedWord);
    }

    public static int checkForMismatches(String word, String reversedWord) {
        int numberOfMismatches = 0;
        for (int i = 0; i < word.length(); ++i) {
            if (word.charAt(i) != (reversedWord.charAt(i))) {
                ++numberOfMismatches;
            }
        }
        return numberOfMismatches;
    }

    public static boolean checkIfPalindrom(int numberOfMismatches) {
        if (numberOfMismatches == 2) {
            return true;
        } else {
            return false;
        }
    }


}
