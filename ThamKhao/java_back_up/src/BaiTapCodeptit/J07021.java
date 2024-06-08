package BaiTapCodeptit;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class J07021 {
    public static String stdName(String s){
        String res = "";
        String []tmp = s.trim().split("\\s+");
        for(String x: tmp){
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        sc.useLocale(Locale.US);
        String s = "";
        while(!(s = sc.nextLine()).equals("END")){
            String ans = stdName(s);
            System.out.println(ans);
        }
    }
}
