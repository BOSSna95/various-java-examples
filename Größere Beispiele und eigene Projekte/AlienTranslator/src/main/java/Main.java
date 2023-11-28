import com.sun.java.accessibility.util.Translator;
import logic.Runner;
import logic.Translate;
import logic.TranslateToDoublestar;
import logic.TranslateToSinglestar;

public class Main {

    public static void main(String[] args) {


        Translate [] translations = {new TranslateToSinglestar(),new TranslateToDoublestar()} ;
        String sourceWord = "Hallo";

        Runner myRun = new Runner (translations, sourceWord);

        myRun.runProgramm();

    }
}