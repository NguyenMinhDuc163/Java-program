package codeptit;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class J07031 {
    public static final int maxn = 1000006;
    public static boolean []p = new boolean[maxn + 1];
    public static void sieve(){
        p[0] = p[1] = true;
        for(int i = 2; i <= Math.sqrt(maxn); i++){
            if(!p[i]){
                for(int j = i * i; j <= maxn; j += i)
                    p[j] = true;
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list1 = (List<Integer>) in1.readObject();
        List<Integer> list2 = (List<Integer>) in2.readObject();
        sieve();
        Set<Integer> se1 = list1.stream().filter(x -> !p[x]).collect(Collectors.toCollection(TreeSet::new));
        Set<Integer> se2 = list2.stream().filter(x -> !p[x]).collect(Collectors.toCollection(HashSet::new));

        final int sum = 1000000;
        for(int x: se1){
            if(x >= sum - x) break;
            if(!se2.contains(x) && !se2.contains(sum - x)&& se1.contains(sum - x)){
                System.out.println(x + " " + (sum - x));
            }
        }

    }
}
