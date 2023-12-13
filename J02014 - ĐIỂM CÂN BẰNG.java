
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t -->0 ){
            int n = sc.nextInt();
            int []a = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int res = 0; boolean ok = true;
            for(int i = 0; i < n ;i ++){
                res += a[i];
                if(res == sum){
                    System.out.println(i + 1);
                    ok = false;
                    break;
                }
                sum -= a[i];
            }
            if(ok) System.out.println("-1");
        }
    }
}
