//package ThucHanh2;
//import java.io.*;
//import java.util.*;
//public class Bai7 {
//    public static int count(int []a){
//        int cnt = 0;
//        int max = a[0];
//        for(int i = 1; i < a.length; i++){
//            if(a[i] > max)
//                max = a[i];
//            else cnt++;
//        }
//        return cnt;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        sc.useLocale(Locale.US);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        System.out.println(count(a));
//    }
//}
