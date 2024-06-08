package BaiTapCodeptit;

import java.io.*;
import java.util.List;

public class J07015 {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (List<Integer>) inputStream.readObject();
        int []cnt = new int[10000];
        for(int x: list){
            if(isPrime(x))
                cnt[x]++;
        }
        for(int i = 0; i < 10000; i++){
            if(cnt[i] > 0)
                System.out.println(i + " " + cnt[i]);
        }
    }
}
