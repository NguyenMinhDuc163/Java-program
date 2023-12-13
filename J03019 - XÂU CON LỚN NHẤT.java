package codeptit;

import java.util.Locale;
import java.util.Scanner;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String s = sc.nextLine();
        String res = "";
        char k = 'a';
        for(int i = s.length() - 1; i >= 0; i--){
            if(k <= s.charAt(i)){
                k = s.charAt(i);
                res = k + res;
            }
        }
        System.out.println(res);
    }
}
