package ThucHanh.Lan1;
import java.io.*;
import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while (t --> 0){
            String s = sc.next();
            String ans = "";
            int cnt = 0;
            for(char x: s.toCharArray()){
                if(Character.isDigit(x))
                    cnt += x - '0';
                else ans += x;
            }
            char []res = ans.toCharArray();
            Arrays.sort(res);
            for(char x: res){
                System.out.print(x);
            }
            System.out.println(cnt);
        }
    }
}
