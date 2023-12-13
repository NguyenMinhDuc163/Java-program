package codeptit;

import java.util.*;
import java.io.*;

/**
 *
 * @author DELL
 */
public class J03020 {
    public static boolean isRevese(String s){
        String tmp = new StringBuilder(s).reverse().toString();
        return tmp.equals(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> mp = new LinkedHashMap<>();
        int max = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(isRevese(s)){
                mp.put(s, mp.getOrDefault(s, 0) + 1);
                max = Math.max(max, s.length());
            }
        }
        int finalMax = max;
        mp.entrySet().stream().sorted((x, y) -> y.getKey().length() - x.getKey().length()).filter(x -> x.getKey().length() == finalMax).
                forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
