package practice4.logic;

public class StringManipulator {

    public String joinStrings(String... words) {
        StringBuilder joinedString = new StringBuilder();
        for (String word : words) {
            joinedString.append(word);
        }
        return joinedString.toString();
    }
}
