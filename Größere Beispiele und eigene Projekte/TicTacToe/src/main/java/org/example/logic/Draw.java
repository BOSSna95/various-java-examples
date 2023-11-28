package org.example.logic;

public class Draw {

    public boolean checkIfDraw(String[] spielfeld) {
        boolean draw = true;
        for (String position : spielfeld) {
            if (position.matches(" ")) {
                draw = false;
                break;
            }
        }
        return draw;
    }






}
