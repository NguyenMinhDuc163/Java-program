import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static boolean isPretty(String s){
        for(char x: s.toCharArray()){
            if((x - '0') % 2 != 0)
                return false;
        }
        String tmp = new StringBuilder(s).reverse().toString();
        return s.equals(tmp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0 ){
            String s = sc.nextLine();
            if(isPretty(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
