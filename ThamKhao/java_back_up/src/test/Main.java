package test;

import java.io.*;
import java.util.*;

public class Main {

    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    static boolean check(int a, int b){
        if(a>=b) return false;
        return gcd(a, b) == 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) o.readObject();
        Collections.sort(a);
        HashSet<String> h = new HashSet<>();
        for(Pair i:a){
            if(check(i.getFirst(), i.getSecond()) && !h.contains(i.toString())){
                h.add(i.toString());
                System.out.println(i);
            }
        }
    }
}