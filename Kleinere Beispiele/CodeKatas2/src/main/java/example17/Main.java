package example17;

public class Main {
    public static void main(String[] args) {

        //    17) kleinstes gemeinsames Vielfaches – z.B. 50, 70 ==> 350

        int firstNumber = 20;
        int secondNumber = 60;
        int kleinstesGemeinsamesVielfaches = Math.max(firstNumber, secondNumber);
        ++kleinstesGemeinsamesVielfaches;

        while (kleinstesGemeinsamesVielfaches % firstNumber != 0 || kleinstesGemeinsamesVielfaches % secondNumber != 0) {
            ++kleinstesGemeinsamesVielfaches;
        }
        System.out.println("Das kleinste gemeinsame Vielfache ist: " + kleinstesGemeinsamesVielfaches);


    }
}
