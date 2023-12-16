package example18;

public class Main {
    public static void main(String[] args) {

        String word = "jkiüp";

        boolean isIsogram = true;

        for (int i = 0; i < word.length() - 1; i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (String.valueOf(word.charAt(j)).equals(String.valueOf(word.charAt(i)))) {
                    isIsogram = false;
                    break;
                }
            }
        }
        if (isIsogram) {
            System.out.println(word + " is an isogram!");
        } else {
            System.out.println(word + " is not an isogram!");
        }
    }
}