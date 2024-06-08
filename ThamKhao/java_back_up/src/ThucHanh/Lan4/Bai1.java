package ThucHanh.Lan4;

import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t-->0){
            TreeSet<Integer> odd = new TreeSet<>();
            TreeSet<Integer> even = new TreeSet<>(Comparator.reverseOrder());
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                int x = sc.nextInt();
                if(x % 2 == 0) odd.add(x);
                else even.add(x);
            }
            for (int x: odd) System.out.print(x + " ");
            System.out.println();
            for (int x: even) System.out.print(x + " ");
            System.out.println();
        }
    }
}
