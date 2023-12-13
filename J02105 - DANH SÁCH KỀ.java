import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        ArrayList<Integer>[] adj = new ArrayList[1005 + 1];
        for (int i = 1; i <= 1005; i++) {
            adj[i] = new ArrayList<>();
        }

        int n = sc.nextInt();
        int[][] a = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i][j] == 1) {
                    adj[i].add(j);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("List(" + i +") = ");
            for (int x : adj[i]) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
