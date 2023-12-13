import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> se = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            se.add(x);
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            se.add(x);
        }

        se.forEach(x -> System.out.print(x + " "));
    }
}
