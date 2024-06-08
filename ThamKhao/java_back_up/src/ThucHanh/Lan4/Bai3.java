package ThucHanh.Lan4;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int [][]a = new int[n][m];
            int [][]b = new int[m][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m ; j++){
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }

            Arrays.sort(b[k - 1]);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m ; j++){
                    System.out.print(b[j][i] + " ");
                }
                System.out.println();
            }
        }

    }
}