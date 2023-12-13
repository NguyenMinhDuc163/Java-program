import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static long[] f = new long[93];

    public static void fibo() {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 93; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    public static char solve(int n, long k) {
        if (n == 1) {
            return '0';
        }
        if (n == 2) {
            return '1';
        }
        if (k <= f[n - 2]) {
            return solve(n - 2, k);
        } else {
            return solve(n - 1, k - f[n - 2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        fibo();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(solve(n, k));
        }
    }
}
