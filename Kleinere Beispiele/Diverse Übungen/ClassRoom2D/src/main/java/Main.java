public class Main {
    public static void main(String[] args) {
        /*
        * Erstelle ein 2 Dimensionales 3x3 Array und gib alle Zahlen aus diesem Array aus
            Im zweiten Schritt gib die Summe aller Zahlen in dem Array aus.
        *
        * */
        String[][] names = {
                {"Andreas", "", "Monika", "Sara"},
                {"", "Milos", "", "Toni", "", ""},
                {"", "", "Niko", "Emu", ""},
                {"Kathi", "Hans", "Goofy", "", "", "", "Fred Feuerstein"}
        };

//        String missingPlaces = "";
        for(int i=0; i< names.length; i++) {
            for(int j=0; j<names[i].length; j++) {
//                System.out.println(names[i][j]);
                if(names[i][j].equals("") == false){
                    System.out.println(names[i][j] + " is sitting at " + i + "-" + j);
                }
            }
        }
//        System.out.println("missingPlaces = " + missingPlaces);
    }
}
