package logic;

public class TranslateO implements Translators {

    String [] splitSourceText;

    public TranslateO(String[] splitSourceText) {
        this.splitSourceText = splitSourceText;
    }

    public String translate(char charToCheck) {
        String charToReturn = "";
        if (charToCheck == ('o')) {
            charToReturn = "9";
        }
        return charToReturn;
    }

    public String translate2(char charToCheck, String encodedText3) {
        if (charToCheck == 'o') {
            encodedText3 += "9";
        }
        return encodedText3;
    }

    public void translate3(int index) {
        if (splitSourceText[index].equalsIgnoreCase("o")) {
            splitSourceText[index] = "9";
        }
    }
}