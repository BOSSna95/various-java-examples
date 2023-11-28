import logic.TranslateEveryA;
import logic.TranslateEveryE;
import logic.TranslateEveryO;
import logic.Translators;

public class Main {

    public static void main(String[] args) {
        Translators[] translators = {new TranslateEveryA(), new TranslateEveryE(), new TranslateEveryO()};

        String sourceText = "Hallo Welt und Ihre Bewohner!";

        String encodedText = "";

        char asc = 'a';

        for (int i = 0; i < translators.length; i++) {
            for (int x = 0; x < sourceText.length(); x++)

                encodedText = String.valueOf(sourceText.charAt(i));
        }


    }


}
