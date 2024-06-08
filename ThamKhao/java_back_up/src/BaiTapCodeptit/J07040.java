package BaiTapCodeptit;
import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc = new Scanner(new File("VANBAN.in"));
        List<String> list1 = (List<String>) in.readObject();
        Set<String> se = new HashSet<>();
        for(String x: list1){
            String []tmp = x.trim().toLowerCase().split("\\s+");
            se.addAll(Arrays.asList(tmp));
        }
        List<String> list2 = new ArrayList<>();
        while(sc.hasNext()){
            String tmp = sc.next().toLowerCase();
            if(se.contains(tmp)){
                System.out.println(tmp);
                se.remove(tmp);
            }

        }
    }
}
