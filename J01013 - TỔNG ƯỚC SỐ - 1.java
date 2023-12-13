import java.util.Scanner;

public class Main {
    public static final int maxn = 2000006;

    public static long[] sang() {
        long p[] = new long[maxn + 1];
        for (int i = 2; i <= maxn; i++) {
            p[i] = i;
        }
        for (int i = 2; i * i <= maxn; i++) {
            if (p[i] == i) {
                for (int j = i * i; j <= maxn; j += i) {
                    if (p[j] == j)
                        p[j] = i;
                }
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] p = sang();

        int n = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            while (num > 1) {
                sum += p[num];
                num /= p[num];
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
