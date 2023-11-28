package BasicPoker.data;

public class Players {
    private final String name;
    private Cards card1;
    private Cards card2;
    private Cards card3;
    private Cards card4;
  private Cards card5;


    public Players(String name) {
        this.name = name;
    }

    public void setCard1(Cards card) {
        card1 = card;
    }

    public void setCard2(Cards card) {
        card2 = card;
    }

    public void setCard3(Cards card) {
        card3 = card;
    }

    public void setCard4(Cards card) {
        card4 = card;
    }

   public void setCard5(Cards card) {card5 = card;
    }


    public String getName() {
        return name;
    }

    public Cards getCard1() {
        return card1;
    }


    public Cards getCard2() {
        return card2;
    }

    public Cards getCard3() {
        return card3;
    }

    public Cards getCard4() {
        return card4;
    }

   public Cards getCard5() {
       return card5;
   }
}
