import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static long [] factorial(){
        long []gt = new long[100];
        gt[0] = 1;
        for(int i = 1; i <= 20; i++)
            gt[i] = gt[i - 1] * i;
        return gt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
//        int t = sc.nextInt();
        long []gt = new long[100]; gt = factorial();
//        while(t -->0 ){
            long n = sc.nextLong();
            long sum = 0;
            for(int i = 1; i <= n; i++)
                sum += gt[i];
            System.out.println(sum);
//        }
    }
}
