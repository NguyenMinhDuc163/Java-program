import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static BigInteger subBigNum(BigInteger a, BigInteger b){
        return a.subtract(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(subBigNum(a, b));
    }
}
