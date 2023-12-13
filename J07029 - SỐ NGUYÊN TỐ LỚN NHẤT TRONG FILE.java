package codeptit;

import java.io.*;
import java.util.*;

public class J07029 {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (List<Integer>) in.readObject();
        Map<Integer, Integer> mp = new TreeMap<>(Comparator.reverseOrder());
        for(Integer x: list){
            if(isPrime(x))
                mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        mp.entrySet().stream().limit(10).forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
