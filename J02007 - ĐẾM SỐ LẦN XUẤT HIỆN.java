import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
        for(int k = 1; k <= t; k++){
            System.out.println("Test " + k + ":");
            mp.clear();
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                int x = sc.nextInt();
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            mp.forEach((x, y) -> {
                System.out.println(x + " xuat hien " + y + " lan");
            });
        }
    }
}
