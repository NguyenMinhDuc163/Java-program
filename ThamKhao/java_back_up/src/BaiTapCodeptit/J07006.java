package BaiTapCodeptit;

import java.io.*;
import java.util.*;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (List<Integer>)in.readObject();
        int []a = new int[10005];
        for(int x: list){
            a[x]++;
        }
        for(int i = 0; i < 1000; i++){
            System.out.println(i + " " + a[i]);
        }
    }
}
