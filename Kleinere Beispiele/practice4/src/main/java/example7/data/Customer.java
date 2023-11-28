package example7.data;

public class Customer {

    public int lendCounter = 0;

    public void lendABook () {
        lendCounter++;
        if (lendCounter >= 3) {
            System.out.println("You can not lend more than three books!");
        } else {
            System.out.println(String.format("You can still lend %d books", 3-lendCounter));
        }
    }


}
