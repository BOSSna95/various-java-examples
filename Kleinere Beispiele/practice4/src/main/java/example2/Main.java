package example2;


public class Main {
    public static void main(String[] args) {
        float sum = 0;
        int i = 1;
        while (i < 11) {
            sum += i;
            i++;
        }
        System.out.println("Durchschnitt: " + sum/10);
    }


}
