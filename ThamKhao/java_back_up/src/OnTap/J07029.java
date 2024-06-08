package OnTap;

import java.io.*;
import java.util.*;
public class J07029 {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (List<Integer>) in.readObject();
        int []cnt = new int[1000006];
        for(int x: list){
            if(isPrime(x))
                cnt[x]++;
        }
        int dem = 0;
        for(int i = 1000005; i >= 0; i--){
            if(cnt[i] != 0){
                System.out.println(i + " " + cnt[i]);
                dem++;
            }
            if(dem == 10){
                break;
            }
        }
    }
}
