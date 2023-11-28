package BasicPoker.logic;

import BasicPoker.data.Cards;
import BasicPoker.data.Players;

import java.util.Random;

public class CardDealer {

    private final Cards[] cardArray;
    private final Random random;
    private String previouslyDealtCards;
    private int randomCardIndex;


    public void setPreviouslyDealtCards(String previouslyDealtCards) {
        this.previouslyDealtCards = previouslyDealtCards;
    }

    public void setRandomCardIndex(int randomCardIndex) {
        this.randomCardIndex = randomCardIndex;
    }

    public int getRandomCardIndex() {
        return randomCardIndex;
    }

    public String getPreviouslyDealtCards() {
        return previouslyDealtCards;
    }

    public CardDealer(Random random, String previouslyDealtCards, Cards[] cardArray) {
        this.random = random;
        this.previouslyDealtCards = previouslyDealtCards;
        this.cardArray = cardArray;
    }

    public void dealCards(Players player) {

        while (ckeckIfRandomCardDealtBefore()) {
        }
        updateDealtCards();
        player.setCard1(cardArray[randomCardIndex]);

        while (ckeckIfRandomCardDealtBefore()) {
        }
        updateDealtCards();
        player.setCard2(cardArray[randomCardIndex]);

        while (ckeckIfRandomCardDealtBefore()) {
        }
        updateDealtCards();
        player.setCard3(cardArray[randomCardIndex]);

        while (ckeckIfRandomCardDealtBefore()) {
        }
        updateDealtCards();
        player.setCard4(cardArray[randomCardIndex]);

        while (ckeckIfRandomCardDealtBefore()) {
        }
        updateDealtCards();
        player.setCard5(cardArray[randomCardIndex]);

    }


    private boolean ckeckIfRandomCardDealtBefore() {
        setRandomCardIndex(randomCardGenerator());
        return getPreviouslyDealtCards().contains("." + getRandomCardIndex() + ".");
    }

    private void updateDealtCards() {
        setPreviouslyDealtCards(getPreviouslyDealtCards() + "." + randomCardIndex + ".");
    }


    public int randomCardGenerator() {
        return random.nextInt(0, cardArray.length);
    }
}



