import java.io.*;
import java.util.*;

class IntSet{
   private TreeSet<Integer> se;

    public IntSet(int a[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int x: a) list.add(x);
        this.se = new TreeSet<>(list);
    }
    public IntSet(ArrayList<Integer> a) {
        this.se = new TreeSet<>(a);
    }
    public IntSet intersection(IntSet a){
        ArrayList<Integer> list = new ArrayList<>();
        for(int  x: se){
            if(a.se.contains(x))
                list.add(x);
        }
        return new IntSet(list);
    }

    @Override
    public String toString() {
        String res = "";
        for(int x: se){
            res += x + " ";
        }
        return res.trim();
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
    public static void main5958101(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
