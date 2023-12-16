package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] Array = {
                "Heute ist ein echt sonniger Tag",
                "Sendet bitte Hilfe, weil Arrays sind echt doof!",
                "Hey du geile Sau.",
        };

        int[] StringSplited = new int[3];

        for (int i = 0; i < Array.length; i++) {
            StringSplited[i] = (Array[i].split(" ").length);
        }

        int longestSentence = 0;
        for (int i = 0; i < StringSplited.length - 1; i++) {
            longestSentence = StringSplited[i];
            if (StringSplited[i] < StringSplited[i + 1]) {
                longestSentence = StringSplited[i + 1];
            }
        }
        System.out.println(longestSentence);
    }
}