package BaiTapCodeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        sc.useLocale(Locale.US);
        int []a = new int[100005];
        while(sc.hasNext()){
            a[sc.nextInt()]++;
        }
        for(int i = 0; i < 100005; i++){
            if(a[i] != 0)
                System.out.println(i + " " + a[i]);
        }
    }
}
