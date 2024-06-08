package ThucHanh.Lan2;
import java.io.*;
import java.util.*;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = Integer.parseInt(sc.nextLine());
        while(n --> 0){
            String []s = sc.nextLine().split(" ");
            for(int i = s.length - 1; i >= 0; i--){
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }
}
