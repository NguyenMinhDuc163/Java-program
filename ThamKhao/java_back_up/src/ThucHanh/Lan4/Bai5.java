package ThucHanh.Lan4;
import java.io.*;
import java.util.*;
public class Bai5 {
    public static long calc(long  a, long b, String c){
        if(c.equals("+")) return a + b;
        if(c.equals("-")) return a - b;
        if(c.equals("*")) return a * b;
        if(c.equals("/")) return a / b;
        return 0;
    }

    public static boolean isDigit(String s){
        try {
            int x = Integer.parseInt(s);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public static void solve(String []a){
        Stack<Long> st = new Stack<>();
        for(int i = a.length - 1; i>= 0; i--){
            if(isDigit(a[i])){
                st.push(Long.parseLong(a[i]));
            }
            else {
                long x = st.pop();
                long y = st.pop();
                long res = calc(x, y, a[i]);
                st.push(res);
            }
        }
        System.out.println(st.pop());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            int n = Integer.parseInt(sc.nextLine());
            String []s = sc.nextLine().trim().split("\\s+");
            solve(s);
        }
    }
}
