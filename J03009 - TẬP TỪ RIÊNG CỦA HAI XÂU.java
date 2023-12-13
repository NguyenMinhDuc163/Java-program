import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] a = sc.nextLine().split("\\s+");
            String[] b = sc.nextLine().split("\\s+");
            TreeMap<String, Integer> mp = new TreeMap<>();
            for (String x : a) mp.put(x, mp.getOrDefault(x, 1));
            for (String x : b) mp.put(x, mp.getOrDefault(x, 1) + 1);
            mp.forEach((x, y) -> {
                if (y == 1) System.out.print(x + " ");
            });
            System.out.println();
        }
    }
}
