package ThucHanh.Lan2;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<BigInteger> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            BigInteger x = sc.nextBigInteger();
            arr.add(x);
        }
        System.out.println(Collections.min(arr));
        System.out.println(Collections.max(arr));
        BigInteger sum = BigInteger.ZERO;
        for(BigInteger x: arr){
            sum = sum.add(x);
        }
        System.out.println(sum);
    }
}
