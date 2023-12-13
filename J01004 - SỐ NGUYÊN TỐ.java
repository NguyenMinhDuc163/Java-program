import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n){
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0)
                return false;
        }
        return n > 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t -->0 ){
            int n = sc.nextInt();
            if(isPrime(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
