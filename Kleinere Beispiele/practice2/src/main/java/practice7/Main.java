package practice7;

public class Main {
    public static void main(String[] args) {

        String word = "TesT";

        returnIndexOfUpperCases(word);

    }

    public static void returnIndexOfUpperCases(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.println(i + 1);
            }
        }
    }
}
