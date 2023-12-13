package codeptit;
import java.io.*;
import java.util.*;

public class J07023 {
    public static boolean isReverse(String s){
        String tmp = new StringBuilder(s).reverse().toString();
        return tmp.equals(s);
    }
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list1 = (List<Integer>) in1.readObject();
        List<Integer> list2 = (List<Integer>) in2.readObject();
        int []cnt1 = new int[100005];
        int []cnt2 = new int[100005];
        Set<Integer> se1 = new TreeSet<>();
        Set<Integer> se2 = new TreeSet<>();
        for(int x: list1){
            if(isReverse(String.valueOf(x))){
                cnt1[x]++;
                se1.add(x);
            }
        }
        for(int x: list2){
            if(isReverse(String.valueOf(x)) && isPrime(x)){
                cnt2[x]++;
                se2.add(x);
            }
        }
        se1.retainAll(se2);
        for(int x: se1){
            System.out.println(x + " " + cnt1[x] + " " + cnt2[x]);
        }
    }
}
