import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        ArrayList<AbstractMap.SimpleEntry<Integer, Integer>> edge = new ArrayList<>();
        int n = sc.nextInt();
        int [][]a = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(a[i][j] == 1 && i < j)
                    edge.add(new AbstractMap.SimpleEntry<>(i, j));
            }
        }
        edge.forEach(e -> System.out.println("(" + e.getKey() + "," + e.getValue() + ")"));
    }
}
