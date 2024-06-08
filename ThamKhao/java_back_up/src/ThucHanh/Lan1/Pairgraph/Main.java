//package thuchanh.Pairgraph;
//
//import java.io.*;
//import java.util.*;;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        sc.useLocale(Locale.US);
//        List<Pair<Integer, Integer>> edge = new ArrayList<>();
//        int [][]a = new int[1005][1005];
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                if(a[i][j] == 1 && i < j)
//                    edge.add(new Pair<>(i, j));
//            }
//        }
//        edge.forEach(x -> {
//            System.out.println("(" + x + ")");
//        });
//    }
//}
