public class Main {
    public static void main(String[] args) {
        String name1 = "Monika";
        String name2 = "Milos";
        String name3 = "Toni";
        String name4 = "Sara";
        String name5 = "Andreas";

        System.out.println("Following persons are still motivated " + name1 + ", " + name2 + ", " + name3 + ", " + name4 + ", " +name5);
        String output = "%s, %s, %s, %s, %s";
        System.out.println(String.format("Following persons are still motivated " + output, name1, name2, name3, name4, name5));
    }
}
