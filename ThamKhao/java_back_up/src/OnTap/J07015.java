package OnTap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Map;

public class J07015 {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (List<Integer>) in.readObject();
        int []cnt = new int[10005];
        for(int x: list){
            if(isPrime(x)){
                cnt[x]++;
            }
        }
        for(int i = 0; i < 10005; i++){
            if(cnt[i] != 0){
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}
