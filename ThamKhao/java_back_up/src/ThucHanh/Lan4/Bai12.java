package ThucHanh.Lan4;

import java.io.*;
import java.util.*;
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        ArrayList<ArrayList<Integer>> m = new ArrayList<>();
        ArrayList<Integer> z = new ArrayList<>(new HashSet<>(a));
        Collections.sort(z);
        for(int i = 0; i < z.size(); i++){
            m.add(new ArrayList<>());
        }
        int []first = new int[z.size()];
        for(int i = 0; i < n; i++){
            a.set(i, low(z, 0, a.get(i)));
            m.get(a.get(i)).add(i);
        }

//        for(int i = 0; i < n; i++){
//            a.set(i, low(z, 0, a.get(i)));
//            m.get(a.get(i)).add(i);
//        }

        int [] l = new int[n];
        int [] r = new int[n];

        get(l, 0, n, 1, -1, a);
        get(r, n - 1, -1, -1, n, a);

        int  res = 0;
        for(int i = 0; i < n; i++){
            if(l[i] != -1) res++;
            if(r[i] != n) res++;
            int x =  count(m.get(a.get(i)), first[a.get(i)], r[i] - 1);
            res += (x - 1) * x / 2;
            first[a.get(i)] += x;
        }
        System.out.println(res);
    }

    public static int low(ArrayList<Integer> arr, int l, int x){
        int R = arr.size() - 1;
        while(l < R){
            int mid = (l + R) >> 1;
            if(arr.get(mid) < x) l = mid + 1;
            else R = mid;
        }
        return l;
    }
    public static void get(int [] arr, int start, int end, int step, int root, ArrayList<Integer> a){
        ArrayList<Integer> st = new ArrayList<>();
        for(int i = start; i != end; i += step){
            while(!st.isEmpty() &&  a.get(st.get(st.size() - 1)) <= a.get(i)) st.remove(st.size() -1);
            arr[i] = st.isEmpty() ? root : st.get(st.size() - 1);
            st.add(i);
        }
    }

    public static int count(ArrayList<Integer> arr, int start, int end){
        if(start >= arr.size() || end < arr.get(start)) return 0;
        int pos = low(arr, start, end);
        if(arr.get(pos) > end) pos--;
        return pos - start + 1;
    }
}
