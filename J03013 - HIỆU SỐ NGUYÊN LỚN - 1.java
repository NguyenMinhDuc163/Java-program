import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static BigInteger subBigNum(BigInteger a, BigInteger b){
        return a.subtract(b).abs();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t -->0 ){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            String ans = String.format("%0" + Math.max(a.toString().length(), b.toString().length()) + "d", subBigNum(a,  b));
            System.out.println(ans);
        }
    }
}
