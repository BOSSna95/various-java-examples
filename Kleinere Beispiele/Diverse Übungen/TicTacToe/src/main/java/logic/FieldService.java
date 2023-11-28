package logic;

public class FieldService {

    public void initField(String[][] fields, String sign) {
        for (int i=0; i< fields.length; i++) {
            for (int j=0; j<fields[i].length; j++){
                fields[i][j] = sign;
            }
        }
    }

    public void insertSymbol(String [][] fields, String move, String symbol) {
        String [] moves = move.split("");
        int column = Integer.parseInt(moves[0]);
        int row = Integer.parseInt(moves[1]);
        fields[column][row] = symbol;
    }


}
