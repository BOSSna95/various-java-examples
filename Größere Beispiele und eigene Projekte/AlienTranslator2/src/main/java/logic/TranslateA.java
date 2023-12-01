package logic;

public class TranslateA implements Translators {

    String [] splitSourceText;

    public TranslateA(String[] splitSourceText) {
        this.splitSourceText = splitSourceText;
    }

    public String translate(char charToCheck) {
        String charToReturn = "";
        if (charToCheck == ('a')) {
            charToReturn = "4";
        }
        return charToReturn;
    }

    public String translate2(char charToCheck, String encodedText3) {
        if (charToCheck == 'a') {
            encodedText3 += "4";
        }
        return encodedText3;
    }


    public void translate3(int index) {
        if (splitSourceText[index].equalsIgnoreCase("a")) {
            splitSourceText[index] = "4";
        }
    }
}