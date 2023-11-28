package view;

public class FieldOutput {
    public void printField(String[][] fields) {
        System.out.println("     |     |      ");
        System.out.println(String.format("  %s  |  %s  |  %s", fields[0][0], fields[0][1], fields[0][2]));
        System.out.println("_____|_____|_____ ");
        System.out.println("     |     |      ");
        System.out.println(String.format("  %s  |  %s  |  %s", fields[1][0], fields[1][1], fields[1][2]));
        System.out.println("_____|_____|_____ ");
        System.out.println("     |     |      ");
        System.out.println(String.format("  %s  |  %s  |  %s", fields[2][0], fields[2][1], fields[2][2]));
        System.out.println("     |     |      ");
        System.out.println();


    }
}
