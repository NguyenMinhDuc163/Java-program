package BaiTapCodeptit;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class J07030 {
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
        Set<Integer> se1 = list1.stream().filter(J07030::isPrime).collect(Collectors.toCollection(TreeSet::new));
        Set<Integer> se2 = list2.stream().filter(J07030::isPrime).collect(Collectors.toCollection(TreeSet::new));
        final int sum = 1000000;
        for(int x: se1){
            if(x * 2 >= sum) break;
            else{
                if(se2.contains(sum - x)) System.out.println(x + " " + (sum - x));
            }
        }
    }
}
