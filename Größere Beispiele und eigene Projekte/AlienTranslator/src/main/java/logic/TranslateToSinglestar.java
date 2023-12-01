package logic;

public class TranslateToSinglestar implements Translate {

    String translatedWord = "";

    public String translate(String sourceWord) {
        for (int i = 0; i < sourceWord.length(); i++) {
            translatedWord += (sourceWord.charAt(i)) + "*";
        }
        return translatedWord.substring(0, translatedWord.length() - 1);
    }

    public void printTranslation(String translatedWord) {
        System.out.println("The Word in doublesternian is: " + translatedWord);
    }


}




