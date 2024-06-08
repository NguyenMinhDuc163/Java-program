package BaiTapCodeptit;

import java.io.*;
import java.util.*;

public class J07072 {
    public static String stdName(String tmp){
        String []s = tmp.trim().split("\\s+");
        String res = "";
        for(String x: s){
            res += x.substring(0,1).toUpperCase()+ x.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }
    public static String cmpName(String tmp){
        String []s = tmp.trim().split("\\s+");
        String ans = s[s.length - 1] + s[0];
        for(int i = 1; i < s.length - 1; i++){
            ans += s[i];
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<String> name = new ArrayList<>();
        while(sc.hasNext()){
            name.add(stdName(sc.nextLine()));
        }
        name.stream().sorted((x, y) -> cmpName(x).compareTo(cmpName(y))).forEach(System.out::println);
    }
}
