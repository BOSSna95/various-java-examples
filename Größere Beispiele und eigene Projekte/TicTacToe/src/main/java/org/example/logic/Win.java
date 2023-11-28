package org.example.logic;

import org.example.Prints;

import java.util.Arrays;

public class Win {

    private final Prints print;

    public Win(Prints print) {
        this.print = print;
    }

    public static boolean checkIfWin(String[] spielfeld, String player) {
        boolean won = false;
        if (spielfeld[0].matches(player) && spielfeld[1].matches(player) && spielfeld[2].matches(player)) {
            won = true;
        } else if (spielfeld[3].matches(player) && spielfeld[4].matches(player) && spielfeld[5].matches(player)) {
            won = true;
        } else if (spielfeld[6].matches(player) && spielfeld[7].matches(player) && spielfeld[8].matches(player)) {
            won = true;
        } else if (spielfeld[0].matches(player) && spielfeld[3].matches(player) && spielfeld[6].matches(player)) {
            won = true;
        } else if (spielfeld[1].matches(player) && spielfeld[4].matches(player) && spielfeld[7].matches(player)) {
            won = true;
        } else if (spielfeld[2].matches(player) && spielfeld[5].matches(player) && spielfeld[8].matches(player)) {
            won = true;
        } else if (spielfeld[0].matches(player) && spielfeld[4].matches(player) && spielfeld[8].matches(player)) {
            won = true;
        } else if (spielfeld[2].matches(player) && spielfeld[4].matches(player) && spielfeld[6].matches(player)) {
            won = true;
        }
        return won;
    }

    public void player1won(String[] spielfeld) {

        System.out.println("Player 1 won!");
        print.printSpielfeld(spielfeld);
    }

    public void player2won(String[] spielfeld) {

        System.out.println("Player 2 won!");
        print.printSpielfeld(spielfeld);
    }


    public void nikoCanNotLose() {
        String[] spielfeldFake = new String[9];
        Arrays.fill(spielfeldFake, "X");
        System.out.println("Player 1 won!");
        print.printSpielfeld(spielfeldFake);
    }


}
