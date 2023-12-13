import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t --> 0){
            long n = sc.nextInt();
            System.out.println(n * (n + 1) / 2);
        }
    }
}
