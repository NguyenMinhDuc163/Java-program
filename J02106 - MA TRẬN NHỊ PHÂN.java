import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        int [][]a = new int[n + 1][3 + 1];
        int ans = 0;
        for(int i = 1; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <= 3; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1)
                    cnt++;
            }
            if(cnt >= 2) ans++;
        }
        System.out.println(ans);
    }
}
