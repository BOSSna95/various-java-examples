package logic;

public class TranslateToDoublestar implements Translate {

    String translatedWord = "";

    public String translate(String sourceWord) {
        for (int i = 0; i < sourceWord.length(); i++) {
            translatedWord +=  (sourceWord.charAt(i));
            if (i < sourceWord.length() - 1) {
                translatedWord +=   "**";
            }
        }
        return translatedWord;
    }

    public void printTranslation(String translatedWord) {
        System.out.println("The Word in doublesternian is: " + translatedWord);
    }

}


