package ThucHanh.Lan1;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Bai5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0 ){
            BigInteger n = sc.nextBigInteger();
            BigInteger a = new BigInteger("7");
            BigInteger b = new BigInteger("13");
            if(n.mod(a).equals(BigInteger.ZERO) && n.mod(b).equals(BigInteger.ZERO))
                System.out.println("Both");
            else if(n.mod(a).equals(BigInteger.ZERO))
                System.out.println("Div 7");
            else if(n.mod(b).equals(BigInteger.ZERO))
                System.out.println("Div 13");
            else System.out.println("None");
        }
    }
}
