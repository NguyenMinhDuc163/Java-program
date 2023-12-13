import java.io.*;
import java.util.*;

public class Main {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return n >  1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list1 = (List<Integer>) in1.readObject();
        List<Integer> list2 = (List<Integer>) in2.readObject();
        Set<Integer> se1 = new TreeSet<>();
        HashSet<Integer> se2 = new HashSet<>();
        se1.addAll(list1);
        se2.addAll(list2);
        for(Integer x : se1){
            if(x * 2 >= 1000000) break;
            if(isPrime(x) && se2.contains(1000000 - x) && isPrime(1000000 - x))
                System.out.println(x + " "  + (1000000 - x));
        }
    }
}
