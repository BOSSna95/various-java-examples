import com.sun.source.doctree.SummaryTree;

public class Main {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i < 10; i++) {
            sum = sum * i;
            System.out.println(sum);
        }
    }
}