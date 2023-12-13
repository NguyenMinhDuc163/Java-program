import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static long [] Fibo(){
        long []F = new long[100];
        F[0] = 0; F[1] = 1;
        for(int i = 2; i <= 93; i++)
            F[i] = F[i - 1] + F[i - 2];
        return F;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        long []f = new long[100]; f = Fibo();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
