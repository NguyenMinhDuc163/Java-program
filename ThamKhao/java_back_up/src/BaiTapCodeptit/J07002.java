package BaiTapCodeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        sc.useLocale(Locale.US);
        long sum = 0;
        while(sc.hasNext()){
            try {
                sum += Integer.parseInt(sc.next());
            }catch (Exception e){

            }
        }
        System.out.println(sum);
    }
}
