package ThucHanh.Lan3;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            BigInteger n = sc.nextBigInteger();
            int cnt = 0;
            while(!n.mod(new BigInteger("13")).equals(BigInteger.ZERO) && cnt != 1000){
                String tmp = n.toString();
                StringBuilder sb = new StringBuilder(tmp);
                String m = sb.reverse().toString();
                n = n.add(new BigInteger(m));
                cnt++;
            }
            System.out.println(n);
        }
    }
}
