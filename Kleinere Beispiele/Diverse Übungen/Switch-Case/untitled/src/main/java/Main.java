import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {


        int hour = LocalDateTime.now().getHour();
        String gruss = switch (hour) {
            case 22, 23, 0, 1, 2, 3, 4 -> "Gute Nacht!";
            case 5, 6, 7, 8, 9, 10 -> "Guten Morgen!";
            case 18, 19, 20, 21 -> "Guten Abend!";
            default -> "Guten Tag!";
        };
        System.out.println(gruss);


        int i=2;

        switch(i){
            case 0:
                System.out.println("i ist null");
                break;
            case 1:
                System.out.println("i ist eins");
                break;
            case 2:
                System.out.println("i ist zwei");
                break;
            case 3:
                System.out.println("i ist drei");
                break;
            default:
                System.out.println("i liegt nicht zwischen null und drei");
                break;
        }





    }
}
