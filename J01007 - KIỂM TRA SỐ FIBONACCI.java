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
    public static boolean isFibo(long n){
        long []f = new long[100]; f = Fibo();
        for(int i = 0; i <= 92; i++){
            if(n == f[i]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t -->0 ){
            long n = sc.nextLong();
            if(isFibo(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
