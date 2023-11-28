package logic;

public class TranslateEveryA implements Translators {

    public char translate(char characterToCheck) {
        if (characterToCheck == ('A') || characterToCheck == ('a')) {
            return '4';
        }
        return characterToCheck;
    }


}
