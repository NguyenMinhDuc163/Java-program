package ThucHanh.Lan3;

import java.io.*;
import java.util.*;
public class Bai2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<String> list1 =(List<String>) in1.readObject();
        List<Integer> list2 =(List<Integer>) in2.readObject();
        TreeSet<String> se1 = new TreeSet<>(list1);
        TreeSet<Integer> se2 = new TreeSet<>(list2);
        for(String x: se1){
            for(Integer y: se2){
                System.out.println(x + y);
            }
        }
    }
}
