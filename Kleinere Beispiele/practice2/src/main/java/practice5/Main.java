package practice5;

public class Main {
    public static void main(String[] args) {
        String word = "asd";

        checkWord(word);

    }

    public static void checkWord(String word) {

        // String lowerCaseWord = word.toLowerCase();
        // String upperCaseWord = word.toUpperCase();

        if (word.toLowerCase().equals(word)) {
            System.out.println("Word was typed in lower cases!");
        } else if (word.toUpperCase().equals(word)) {
            System.out.println("Word was typed in upper cases!");
        } else {
            System.out.println("Word was typed in different cases!");

        }

    }

}
