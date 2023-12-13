package codeptit;

import java.io.*;
import java.util.*;


public class J07011 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> mp = new LinkedHashMap<>();
        String tmp = "";
        for(int i = 1; i <= n; i++){
            tmp += sc.nextLine().toLowerCase().trim() + " ";
        }
        String []s =tmp.split("\\W\\s*");
        for(String x: s){
            if (!x.equals(""))
                if (mp.containsKey(x)) {
                    mp.put(x, mp.get(x) + 1);
                } else {
                    mp.put(x, 1);
                }
        }
        mp.entrySet().stream().sorted((x, y) -> {
            if(!x.getValue().equals(y.getValue())) return Integer.compare(y.getValue(), x.getValue());
            else return x.getKey().compareTo(y.getKey());
        }).forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));

    }
}
