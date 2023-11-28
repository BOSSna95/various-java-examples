package BasicPoker.data;

public class Cards {

    private final int cardIndex;

    private final int value;

    private final String color;


    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public int getCardIndex() {
        return cardIndex;
    }

    public Cards ( int cardIndex, int value, String color) {
        this.cardIndex = cardIndex;
        this.value = value;
        this.color = color;
    }


}
