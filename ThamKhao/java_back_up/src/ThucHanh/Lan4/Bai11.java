package ThucHanh.Lan4;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Scanner;

public class Bai11 {
    public static boolean isCheck(String s){
        for (int i = 1; i < s.length(); i++){
            if(s.charAt(i) < s.charAt(i - 1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(isCheck(s))
                mp.put(s, mp.getOrDefault(s, 0) + 1);
        }
        mp.entrySet().stream().sorted((x, y) -> {
            return Integer.compare(y.getValue(), x.getValue());
        }).forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    }
}
