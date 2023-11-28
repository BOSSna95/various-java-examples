package BasicPoker.Outprint;

import BasicPoker.data.Players;

public class PlayersHand {

    public void printPlayersHand (Players player) {
        System.out.println("Karten von " + player.getName() + ":");
        System.out.println(player.getCard1().getCardIndex());
        System.out.println(player.getCard2().getCardIndex());
        System.out.println(player.getCard3().getCardIndex());
        System.out.println(player.getCard4().getCardIndex());
        System.out.println(player.getCard5().getCardIndex());
    }
}
