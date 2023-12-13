package codeptit;

import java.io.*;
import java.util.*;

public class J07078 {
    public static void solve(String a, String b){
        int k = 0;
        while(true){
            k = a.indexOf(b, k);
            if(k == -1) break;
            System.out.print(++k + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = sc.nextInt();
        while(t --> 0){
            String a = sc.next();
            String b = sc.next();
            solve(a, b);
        }
    }
}
