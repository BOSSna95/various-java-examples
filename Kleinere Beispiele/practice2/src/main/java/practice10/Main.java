package practice10;

public class Main {
    public static void main(String[] args) {

        // ) Schreibe eine Funktion, die überprüft ob ein String ein Isogramm ist (ein Wort, dass keinen Buchstaben 2 Mal enthält)

        String word = "jkpop";

        boolean isIsogram = true;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (String.valueOf(word.charAt(j)).equals(String.valueOf(word.charAt(i)))) {
                    isIsogram = false;
                    break;
                }
            }
            if (!isIsogram) {
                break;
            }
        }

        if (isIsogram) {
            System.out.println(word + " is an isogram!");
        } else {
            System.out.println(word + " is not an isogram!");
        }
    }
}