package example15;

public class Main {
    public static void main(String[] args) {

        //    15) Schreibe eine Funktion, die Berechnen kann, wie hoch meine Gewinnchancen bei Lotteriespielen ist,
        //    bei denen man aus einer bestimmten Menge an Zahlen bestimmte Zahlen auswählen muss (zum Beispiel 6 aus 45)
        //    kleiner Tipp– man braucht den Binomialkoeffizienten

        double totalNumbers = 50;
        double numbersPicked = 6;
        double winningChances = 0;

        calculateWinningChance(totalNumbers, numbersPicked, winningChances);

    }

    public static void calculateWinningChance(double totalNumbers, double numbersPicked, double winningChances) {
        winningChances = numbersPicked / totalNumbers;
        if (numbersPicked > 0) {
            calculateWinningChance(--totalNumbers, --numbersPicked, winningChances);
        }
        System.out.println(winningChances);
    }
}
