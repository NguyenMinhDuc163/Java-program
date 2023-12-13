import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt(), m = sc.nextInt();
        if(n * m <= 0) System.out.println("0");
        else System.out.println(2 * (n + m) + " " + n * m);
    }
}
