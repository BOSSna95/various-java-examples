import logic.TranslateA;
import logic.TranslateE;
import logic.TranslateO;
import logic.Translators;

public class Main {

    public static void main(String[] args) {

        String sourceText = "Hallo Welt und Ihre Bewohner!";
        String[] splitSourceText = sourceText.split("");
        String sourceTextLowerCase = sourceText.toLowerCase();

        Translators[] translators = {new TranslateA(splitSourceText), new TranslateE(splitSourceText), new TranslateO(splitSourceText)};

        String encodedText1 = "";
        String encodedText2 = "";
        String encodedText3 = "";


        //Methode ohne Interface
        for (int x = 0; x < sourceText.length(); x++) {
            if (sourceTextLowerCase.charAt(x) == 'a') {
                encodedText1 += "4";
            } else if (sourceTextLowerCase.charAt(x) == 'e') {
                encodedText1 += "7";
            } else if (sourceTextLowerCase.charAt(x) == 'o') {
                encodedText1 += "9";
            } else {
                encodedText1 += sourceText.charAt(x);
            }
        }
        System.out.println("encodedText1: " + encodedText1);


        //Methode mit Interface1
        for (int z = 0; z < sourceTextLowerCase.length(); z++) {
            for (Translators translator : translators) {
                encodedText2 += translator.translate(sourceText.charAt(z));
            }

            if (sourceTextLowerCase.charAt(z) != 'a' &&
                    sourceTextLowerCase.charAt(z) != 'e' &&
                    sourceTextLowerCase.charAt(z) != 'o') {
                encodedText2 += sourceText.charAt(z);
            }
        }
        System.out.println("encodedText2: " + encodedText2);


        //Methode mit Interface2
        for (int z = 0; z < sourceTextLowerCase.length(); z++) {
            for (Translators translator : translators) {
                encodedText3 = translator.translate2(sourceText.charAt(z), encodedText3);
            }
            if (sourceTextLowerCase.charAt(z) != 'a' &&
                    sourceTextLowerCase.charAt(z) != 'e' &&
                    sourceTextLowerCase.charAt(z) != 'o') {
                encodedText3 += sourceText.charAt(z);
            }
        }
        System.out.println("encodedText3: " + encodedText3);


        // Methode mit Interface3
        for (int i = 0; i < splitSourceText.length; i++) {
            for (Translators translator : translators) {
                translator.translate3(i);
            }
        }
        System.out.print("encodedText4: ");
        for (String i : splitSourceText) {
            System.out.print(i);
        }
    }
}