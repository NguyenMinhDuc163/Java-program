import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a = sc.nextInt(), b = sc.nextInt();
        if( a == 0 ) {
            if(b == 0) System.out.println("VSN");
            else
                System.out.println("VN");
        }
        else
            System.out.printf("%.2f", -b / a);
    }
}
