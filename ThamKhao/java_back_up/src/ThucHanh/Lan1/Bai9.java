package thuchanh;

import java.io.*;
import java.util.*;

public class Bai9 {
    public static boolean isCheck(int n){
        String s = String.valueOf(n);
        for(int i = 1; i < s.length(); i++){
            if((s.charAt(i - 1) - '0') < (s.charAt(i) - '0'))
                return false;
        }
        return s.length() > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list1 = (List<Integer>) in1.readObject();
        List<Integer> list2 = (List<Integer>) in2.readObject();
        TreeSet<Integer> se1 = new TreeSet<>();
        TreeSet<Integer> se2 = new TreeSet<>();
        int []cnt1 = new int[100005];
        int []cnt2 = new int[100005];
        for(int x: list1){
            if(isCheck(x)){
                se1.add(x);
                cnt1[x]++;
            }
        }
        for(int x: list2){
            if(isCheck(x)){
                se2.add(x);
                cnt2[x]++;
            }
        }
        se1.retainAll(se2);
        for(int x: se1){
            System.out.println(x + " " + cnt1[x] + " " + cnt2[x]);
        }
    }
}
