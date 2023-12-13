import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static boolean isDivEleven(String s){
        int odd = 0, even = 0;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0) even += s.charAt(i) - '0';
            else odd += s.charAt(i) - '0';
        }
        return (odd - even) % 11 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0 ){
           String s = sc.nextLine();
           if(isDivEleven(s)) System.out.println("1");
           else System.out.println("0");
        }
    }
}
