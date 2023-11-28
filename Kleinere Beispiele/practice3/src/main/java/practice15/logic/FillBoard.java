package practice15.logic;

public class FillBoard {


    public void fillArray(boolean isEven, String[] Array) {
        int i = 1;
        int j = 0;
        if (isEven) {
            i = 0;
            j = 1;
        }
        for (; j < Array.length; i += 2, j += 2) {
            Array[i] = "1";
            Array[j] = "0";
        }
    }
}
