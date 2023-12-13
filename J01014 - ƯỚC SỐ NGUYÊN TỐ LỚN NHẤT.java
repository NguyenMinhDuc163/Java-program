import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void solve(long n){
        long maxPrime = 1;
        for(long i = 2; i * i <= n; i++){
            while(n % i == 0){
                maxPrime = i;
                n /= i;
            }
        }
        if(n > 1) maxPrime = n;
        System.out.println(maxPrime);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t --> 0){
            long n = sc.nextLong();
            solve(n);
        }
    }
}
