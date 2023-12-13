import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
       int t = sc.nextInt();
       while(t -->0 ){
           BigInteger a = sc.nextBigInteger();
           BigInteger b = sc.nextBigInteger();
           if(a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO))
               System.out.println("YES");
           else System.out.println("NO");
       }
    }
}
