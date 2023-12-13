import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static int solve(int n){
        int cnt = 0;
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0 ){
               if(i % 2 == 0) cnt++;
               if(i != n / i && (n / i) % 2 == 0) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t -->0 ){
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
}
