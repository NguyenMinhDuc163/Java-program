package OnTap;

import java.io.*;
import java.util.*;

public class J07030 {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list1 = (List<Integer>) in1.readObject();
        List<Integer> list2 = (List<Integer>) in2.readObject();
        int sum = 1000000;
        Set<Integer> se1 = new TreeSet<>(list1);
        Set<Integer> se2 = new HashSet<>(list2);
        for(int x: se1){
            if(x * 2 > sum) break;
            if(se2.contains(sum - x) && isPrime(x) && isPrime(sum - x)){
                System.out.println(x + " " + (sum - x));
            }
        }
    }
}
