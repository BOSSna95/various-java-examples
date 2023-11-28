package practice6.logic;

public class Printer {

    public void print(String... words) {
        String sentence = "";
        for (String word : words) {
            sentence += word + ", ";
        }
        sentence = sentence.substring(0, sentence.length() - 2) + "!";
        System.out.println(sentence);

    }

    public void print(int... numbers) {
        String sentence = "";
        for (int number : numbers) {
            sentence += number + " ";
        }
        System.out.println(sentence + " ");

    }

}
