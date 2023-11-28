package practice8;

public class Main {
    public static void main(String[] args) {

        String word = "Halo";

        returnMiddleChar(word);

    }

    public static void returnMiddleChar(String word) {

        System.out.println(word.length());
        double wordmiddle = word.length() / 2;

        if (word.length() % 2 == 0) {
            System.out.println(word.charAt((int) (wordmiddle - 0.5)));   // Cast argument to 'int' ?!?!?!
            System.out.println(word.charAt((int) (wordmiddle + 0.5)));   // Cast argument to 'int' ?!?!?!

        } else {
            System.out.println(word.charAt((word.length() / 2)));
        }
    }
}
