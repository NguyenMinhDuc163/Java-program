package codeptit;

import java.io.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class J07085 {
    public static int sum(String tmp){
        int s = 0;
        for(char x: tmp.toCharArray()){
            s += x - '0';
        }
        return s;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (List<String>)in.readObject();
        for(String x: list){
            String res = x.replaceAll("[^0-9]", "").replaceFirst("^0+", "");
            System.out.println(res + " " + sum(res));
        }
    }
}
