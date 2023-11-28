package practice5.logic;

public class CalculateAverages {

    public double calculateAverage(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
