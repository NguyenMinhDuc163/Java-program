package BaiTapCodeptit;
import java.io.*;
import java.util.*;
public class J07012 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (List<String>) in.readObject();
        Map<String, Integer> mp = new LinkedHashMap<>();
        String tmp = "";
        for(String x: list){
            tmp += x.toLowerCase() + " ";
        }
        String []s =tmp.split("\\W\\s*");
        for(String x: s){
            if(!x.isEmpty())
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        mp.entrySet().stream().sorted((x, y) -> {
            if(!x.getValue().equals(y.getValue())) return Integer.compare(y.getValue(), x.getValue());
            else return x.getKey().compareTo(y.getKey());
        }).forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));

    }
}
