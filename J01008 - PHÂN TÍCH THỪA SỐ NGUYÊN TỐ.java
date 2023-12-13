import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void solve(int n){
        for(int i = 2; i * i <= n ; i++){
            if(n % i == 0){
                int cnt = 0;
                while(n % i == 0){
                    cnt++;
                    n /= i;
                }
                System.out.print(i + "(" + cnt + ")");
                if(n > 1) System.out.print(" ");
            }
        }
        if(n > 1) System.out.print(n + "(" + 1 + ")");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
       for(int i = 1; i <= t; i++){
            System.out.print("Test " + i + ": ");
            int n = sc.nextInt();
            solve(n);
        }
    }
}
