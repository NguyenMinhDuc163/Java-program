package codeptit;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class J07022 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        sc.useLocale(Locale.US);
        List<String> a = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try {
                int n = Integer.parseInt(s);
            }catch (Exception e){
                a.add(s);
            }
        }
        String ans = a.stream().sorted(String::compareTo).collect(Collectors.joining(" "));
        System.out.println(ans);
    }
}
