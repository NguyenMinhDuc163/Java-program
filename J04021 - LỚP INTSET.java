import java.io.*;
import java.util.*;

class IntSet{
    private TreeSet<Integer> se ;

    public IntSet(int []a) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int x: a)
            list.add(x);
        se = new TreeSet<>(list);
    }
    public IntSet(List<Integer> a){
        this.se = new TreeSet<>(a);
    }
    public IntSet union(IntSet a){
        List<Integer> res = new ArrayList<>();
        res.addAll(a.se);
        res.addAll(this.se);
        return new IntSet(res);
    }

    @Override
    public String toString() {
        String res = "";
        for(Integer x: se){
            res  += x  + " ";
        }
        return res.trim();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
    public static void main5505886(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
