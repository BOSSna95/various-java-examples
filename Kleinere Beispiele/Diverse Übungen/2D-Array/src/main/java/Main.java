public class Main {
    public static void main(String[] args) {

        int[][] numbers = new int[3][3];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (i + 1) + (j + 1);
                System.out.println("Number at " + i + "/" + j + " is " + numbers[i][j]);

                sum += numbers[i] [j];
            }
            System.out.println("The sum is " + sum + "!");
        }
    }
}
