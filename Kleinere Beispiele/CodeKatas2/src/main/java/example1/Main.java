package example1;

public class Main {
    public static void main(String[] args) {

        int month = -1;

        printMonth(month);
    }

    public static void printMonth(int monthNumber) {
        String monthName = switch (monthNumber) {
            case 1 -> monthName = "Jänner";
            case 2 -> monthName = "Februar";
            case 3 -> monthName = "März";
            case 4 -> monthName = "April";
            case 5 -> monthName = "Mai";
            case 6 -> monthName = "Juni";
            case 7 -> monthName = "Juli";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "Oktober";
            case 11 -> monthName = "November";
            case 12 -> monthName = "Dezember";
            default -> monthName = "No matching month!";
        };
        System.out.println(monthName);
    }
}