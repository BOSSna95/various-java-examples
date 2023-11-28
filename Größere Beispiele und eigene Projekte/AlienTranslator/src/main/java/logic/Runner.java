package logic;

public class Runner {

    private final Translate[] translations;

    private String sourceWord;

    private String translatedWord;

    public Runner(Translate[] translations, String sourceWord) {
        this.translations = translations;
        this.sourceWord = sourceWord;
    }

    public void runProgramm() {
        for (int i = 0; i < translations.length; i++) {
            translatedWord = translations[i].translate(sourceWord);
            translations[i].printTranslation(translatedWord);
        }


    }
}
