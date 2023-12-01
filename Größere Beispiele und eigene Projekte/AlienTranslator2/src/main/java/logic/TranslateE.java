package logic;

public class TranslateE implements Translators {

    String [] splitSourceText;

    public TranslateE(String[] splitSourceText) {
        this.splitSourceText = splitSourceText;
    }

    public String translate(char charToCheck) {
        String charToReturn = "";
        if (charToCheck == ('e')) {
            charToReturn = "7";
        }
        return charToReturn;
    }

    public String translate2(char charToCheck, String encodedText3) {
        if (charToCheck == 'e') {
            encodedText3 += "7";
        }
        return encodedText3;
    }

    public void translate3(int index) {
        if (splitSourceText[index].equalsIgnoreCase("e")) {
            splitSourceText[index] = "7";
        }
    }
}