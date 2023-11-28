package logic;

public class CheckService {

    public boolean isFieldFull(String[][] fields, String sign) {
        for (String[] row : fields) {
            for (String fieldSign : row) {
                if (fieldSign.equals(sign)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean didPlayerWin(String[][] fields, String symbol) {
        if (fields[0][0].equals(symbol) && fields[0][1].equals(symbol) && fields[0][2].equals(symbol)) {
            return true;

        }
        return false;

    }


}
