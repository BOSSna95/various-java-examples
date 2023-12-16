package example12and13;

public class Main {
    public static void main(String[] args) {

        String word = "tallhlat";

        String reversedWord = reverseWord(word);

        printWordAndReversed(word, reversedWord);

        int numberOfMismatches = checkForMismatches(word, reversedWord);

        checkIfPalindromOrAlmostPalindrom(numberOfMismatches, word);

    }

    public static String reverseWord(String word) {

        StringBuilder reversedWord = new StringBuilder(word);
        return String.valueOf(reversedWord.reverse());
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

    public static void checkIfPalindromOrAlmostPalindrom(int numberOfMismatches, String word) {
        if (numberOfMismatches == 0) {
            System.out.println(word + " is a palindrom!");
        } else if (numberOfMismatches == 2) {
            System.out.println(word + " is almost a palindrom!");
        } else {
            System.out.println(word + " is not even close to being a palindrom!");
        }
    }
}
