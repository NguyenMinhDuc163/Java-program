package ThucHanh.Lan1;

import java.io.*;
import java.util.*;

public class Bai4 {
    public static final int MAXN = 1000006;
    public static boolean[] siven(){
        boolean []p = new boolean[MAXN + 1];
        p[0] = p[1] = true;
        for(int i = 2; i <= Math.sqrt(MAXN); i++){
            if(!p[i]){
                for(int j = i * i; j <= MAXN; j+=i)
                    p[j] = true;
            }
        }
        return p;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        List<Integer> list = (List<Integer>) in.readObject();
        boolean []p = new boolean[MAXN + 1];
        p = siven();
        Set<Integer> se = new TreeSet<>();
        for(int x: list){
            if(!p[x] && String.valueOf(x).length() >= 3){
                se.add(x);
            }
        }
        for (int x: se)
            System.out.println(x);
    }
}
