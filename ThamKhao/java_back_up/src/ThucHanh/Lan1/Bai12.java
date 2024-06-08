package thuchanh;
import java.io.*;
import java.util.*;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t -->0 ){
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            Map<Integer, Integer> mp = new HashMap<>();
            for(int i = 1; i <= n; i++){
                int x = sc.nextInt();
                list.add(x);
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            list.sort((x, y) -> Integer.compare(mp.get(y), mp.get(x)));
            LinkedHashSet<Integer> se = new LinkedHashSet(list);
            for (Integer x: se){
                for(int i = 0; i < mp.get(x); i++)
                    System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
