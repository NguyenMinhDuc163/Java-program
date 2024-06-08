package ThucHanh.Lan4;

import java.io.*;
import java.util.*;

public class Bai18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []a = {2, 3, 5, 7};
        Set<Integer> ans = new TreeSet<>();
        boolean []check = {false, false, false, false};
        Try(check, "",  a, ans, n);
        ans.stream().sorted().forEach(System.out::println);
    }
    public static boolean ok(boolean []check){
        for(boolean x: check){
            if(!x) return false;
        }
        return true;
    }
    public static void Try(boolean []check, String s, int []a, Set<Integer> ans, int n){
        if(s.length() >= 4 && ok(check) &&s.charAt(s.length() - 1) != '2'){
            ans.add(Integer.parseInt(s));
        }
        if(s.length() == n) return;
        for (int i = 0; i < 4; i++){
            boolean[] tmp = check.clone();
            tmp[i] = true;
            Try(tmp, s + a[i], a, ans, n);
        }
    }
}
