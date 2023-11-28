public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        for (i = 1; i < 1000; sum = sum + i++);{
            System.out.println(sum);
        }
    }
}

/* Kursleiterlösung:
int sum = 0
for (int 1=0; 1 <1000; i++) {
sum=sum+1;
System.out.rintln(
 */
