package example3;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int sum =0 ;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Durchschnitt: " + sum/ numbers.length);


    }
}
