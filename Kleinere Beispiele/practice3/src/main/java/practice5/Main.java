package practice5;

import practice5.logic.CalculateAverages;

public class Main {
    public static void main(String[] args) {

        CalculateAverages calculateAverages = new CalculateAverages();

        System.out.println(calculateAverages.calculateAverage(1.5,2));
        System.out.println(calculateAverages.calculateAverage(1.1,2.2,3.3));
        System.out.println(calculateAverages.calculateAverage(1,2));
    }
}
