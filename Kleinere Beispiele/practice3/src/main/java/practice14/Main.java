package practice14;

public class Main {

    public static void main(String[] args) {

        double [] prices = {12, 12.2, 15.2423, 16};

        for (double price : prices)
            System.out.println(String.format("%.2f", price));

    }
}
