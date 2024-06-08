package ThucHanh.Lan4;

import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String s = sc.nextLine();
        while(s.length() > 1){
            s = new BigInteger(s.substring(0,s.length() / 2)).add(new BigInteger(s.substring(s.length() / 2))).toString();
            System.out.println(s);
        }
    }
}
