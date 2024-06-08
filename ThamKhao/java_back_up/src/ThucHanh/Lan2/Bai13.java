package ThucHanh.Lan2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
public class Bai13 {
    public static boolean []used = new boolean[1005];
    public static int n;
    public static int []a = new int[1005];
    public static int []b = {2, 3, 5, 7};
    public static ArrayList<String> ans = new ArrayList<>();

    public static void solve(){
        String s = "";
        for(int i = 1; i <= n; i++){
            s += b[a[i] % 4];
        }
        ans.add(s);
    }
    public static void Try(int i){
        for(int j = 1; j <= n; j++){
            if(!used[j]){
                a[i] = j; used[j] = true;
                if(i == n){
                    solve();
                }else {
                    Try(i + 1);
                }
                used[j] = false;
            }
        }
    }
    public static void init(){
        for(int i = 4; i < 10; i++){
            n = i;
            Try(1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int k = sc.nextInt();
        init();
        Set<BigInteger> se = new TreeSet<>();
        for(String x: ans){
            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger("2");
            if(x.length() <= k && a.mod(b).equals(BigInteger.ONE))
                se.add(new BigInteger(x));
        }
        se.forEach(System.out::println);
    }
}
