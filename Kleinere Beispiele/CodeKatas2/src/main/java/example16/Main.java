package example16;

public class Main {
    public static void main(String[] args) {
        //    16) Größter gemeinsamer Nenner 2er Zahlen – z.B. 24, 100 ==> 4

        int firstNumber = 4;
        int secondNumber = 8;
        int groesterNenner = Math.min(firstNumber, secondNumber);
        --groesterNenner;

        while (firstNumber % groesterNenner != 0 || secondNumber % groesterNenner != 0) {
            --groesterNenner;
            if (groesterNenner == 1) {
                break;
            }
        }
        System.out.println("Der groesste gemeinsame Nenner ist: " + groesterNenner);


    }
}
