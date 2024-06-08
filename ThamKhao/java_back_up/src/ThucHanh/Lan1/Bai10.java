package ThucHanh.Lan1;
import java.io.*;
import java.util.*;
public class Bai10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<String> list1 = (List<String>) in1.readObject();
        List<Integer> list2 = (List<Integer>) in2.readObject();
        Set<String> se1 = new TreeSet<>(list1);
        Set<String> se2 = new TreeSet<>();
        for(Integer x: list2) se2.add(String.valueOf(x));
        Set<String> ans = new TreeSet<>();
        for(String x: se1){
            for (String y: se2){
                ans.add(x + y);
            }
        }
        for (String x: ans) System.out.println(x);
    }
}