package ThucHanh.Lan4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.List;

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
        HashSet<Integer> se1 = new HashSet<>();
        HashSet<Integer> se2 = new HashSet<>();
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
        se1.stream().sorted((x, y)-> x.compareTo(y)).forEach(x -> System.out.println(x + " " + cnt1[x] + " " + cnt2[x]));
    }
}