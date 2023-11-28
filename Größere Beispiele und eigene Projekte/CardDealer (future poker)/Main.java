package BasicPoker;

import BasicPoker.Outprint.PlayersHand;
import BasicPoker.data.Cards;
import BasicPoker.data.Players;
import BasicPoker.logic.CardDealer;
import BasicPoker.logic.HandValueCheck;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Random random = new Random();
        HandValueCheck handValueCheck = new HandValueCheck();

        Players player1 = new Players("Niko");
        Players player2 = new Players("Milos");
        Players player3 = new Players("Tony");
        Players player4 = new Players("Sara");
        Players player5 = new Players("Emad");
        Players player6 = new Players("Andreas");
        Players player7 = new Players("Monika");
        Players player8 = new Players("d");
        Players player9 = new Players("e");
        Players player10 = new Players("f");
        Players player11 = new Players("g");
        Players player12 = new Players("h");
        Players player13 = new Players("i");


        Cards card1 = new Cards(0, 2, "diamond");
        Cards card2 = new Cards(1, 2, "heart");
        Cards card3 = new Cards(2, 2, "spade");
        Cards card4 = new Cards(3, 2, "pike");
        Cards card5 = new Cards(4, 3, "diamond");
        Cards card6 = new Cards(5, 3, "heart");
        Cards card7 = new Cards(6, 3, "spade");
        Cards card8 = new Cards(7, 3, "pike");
        Cards card9 = new Cards(8, 4, "diamond");
        Cards card10 = new Cards(9, 4, "heart");
        Cards card11 = new Cards(10, 4, "spade");
        Cards card12 = new Cards(11, 4, "pike");
        Cards card13 = new Cards(12, 5, "diamond");
        Cards card14 = new Cards(13, 5, "heart");
        Cards card15 = new Cards(14, 5, "spade");
        Cards card16 = new Cards(15, 5, "pike");
        Cards card17 = new Cards(16, 6, "diamond");
        Cards card18 = new Cards(17, 6, "heart");
        Cards card19 = new Cards(18, 6, "spade");
        Cards card20 = new Cards(19, 6, "pike");
        Cards card21 = new Cards(20, 7, "diamond");
        Cards card22 = new Cards(21, 7, "heart");
        Cards card23 = new Cards(22, 7, "spade");
        Cards card24 = new Cards(23, 7, "pike");
        Cards card25 = new Cards(24, 8, "diamond");
        Cards card26 = new Cards(25, 8, "heart");
        Cards card27 = new Cards(26, 8, "spade");
        Cards card28 = new Cards(27, 8, "pike");
        Cards card29 = new Cards(28, 9, "diamond");
        Cards card30 = new Cards(29, 9, "heart");
        Cards card31 = new Cards(30, 9, "spade");
        Cards card32 = new Cards(31, 9, "pike");
        Cards card33 = new Cards(32, 10, "diamond");
        Cards card34 = new Cards(33, 10, "heart");
        Cards card35 = new Cards(34, 10, "spade");
        Cards card36 = new Cards(35, 10, "pike");
        Cards card37 = new Cards(36, 11, "diamond");
        Cards card38 = new Cards(37, 11, "heart");
        Cards card39 = new Cards(38, 11, "spade");
        Cards card40 = new Cards(39, 11, "pike");
        Cards card41 = new Cards(40, 12, "diamond");
        Cards card42 = new Cards(41, 12, "heart");
        Cards card43 = new Cards(42, 12, "spade");
        Cards card44 = new Cards(43, 12, "pike");
        Cards card45 = new Cards(44, 13, "diamond");
        Cards card46 = new Cards(45, 13, "heart");
        Cards card47 = new Cards(46, 13, "spade");
        Cards card48 = new Cards(47, 13, "pike");
        Cards card49 = new Cards(48, 14, "diamond");
        Cards card50 = new Cards(49, 14, "heart");
        Cards card51 = new Cards(50, 14, "spade");
        Cards card52 = new Cards(51, 14, "pike");

        Cards[] cardArray = {card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13,
                card14, card15, card16, card17, card18, card19, card20, card21, card22, card23, card24, card25, card26, card27,
                card28, card29, card30, card31, card32, card33, card34, card35, card36, card37, card38, card39, card40, card41,
                card42, card43, card44, card45, card46, card47, card48, card49, card50, card51, card52};

        CardDealer cardDealer = new CardDealer(random, "", cardArray);

        PlayersHand playersHand = new PlayersHand();


        cardDealer.dealCards(player1);
        playersHand.printPlayersHand(player1);
        cardDealer.dealCards(player2);
        playersHand.printPlayersHand(player2);
        cardDealer.dealCards(player3);
        playersHand.printPlayersHand(player3);
        cardDealer.dealCards(player4);
        playersHand.printPlayersHand(player4);
        cardDealer.dealCards(player5);
        playersHand.printPlayersHand(player5);
        cardDealer.dealCards(player6);
        playersHand.printPlayersHand(player6);
        cardDealer.dealCards(player7);
        playersHand.printPlayersHand(player7);
    /*  cardDealer.dealCards(player8);
        playersHand.printPlayersHand(player8);
        cardDealer.dealCards(player9);
        playersHand.printPlayersHand(player9);
        cardDealer.dealCards(player10);
        playersHand.printPlayersHand(player10);
        cardDealer.dealCards(player11);
        playersHand.printPlayersHand(player11);
        cardDealer.dealCards(player12);
        playersHand.printPlayersHand(player12);
        cardDealer.dealCards(player13);
        playersHand.printPlayersHand(player13);
*/


    }
}