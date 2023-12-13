import java.io.*;
import java.util.*;

public class Main {
    public static boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        if (!sb.toString().equals(s)) {
            return false;
        }

        if (s.length() % 2 == 0 || s.length() == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list1 = (List<Integer>) in1.readObject();
        List<Integer> list2 = (List<Integer>) in2.readObject();
        Set<Integer> se1 = new TreeSet<>();
        Set<Integer> se2 = new TreeSet<>();
        int []cnt1 = new int[1000005];
        int []cnt2 = new int[1000005];
        for(Integer x: list1){
            if(isValid(String.valueOf(x))){
                se1.add(x);
                cnt1[x]++;
            }
        }
        for(Integer x: list2){
            if(isValid(String.valueOf(x))){
                se2.add(x);
                cnt2[x]++;
            }
        }
        se1.retainAll(se2);
        int cnt = 0;
        for(Integer x: se1){
            if(cnt == 10) break;
            System.out.println(x + " " + (cnt1[x]  + cnt2[x]));
            cnt++;
        }
    }
}
