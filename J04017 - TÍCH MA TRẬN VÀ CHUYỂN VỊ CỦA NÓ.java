import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

 class Matrix {
    private int n, m;
    private int [][]data;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.data = new int[n][m];
    }
    public void nextMatrix(Scanner sc){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                data[i][j] = sc.nextInt();
        }
    }
    public Matrix mul(Matrix a){
        Matrix ans = new Matrix(this.n, a.m);
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < a.m; j++){
                int sum = 0;
                for(int k = 0; k < this.m; k++){
                    sum += this.data[i][k] * a.data[k][j];
                }
                ans.data[i][j] = sum;
            }
        }
        return ans;
    }
    public Matrix trans(){
        Matrix ans = new Matrix(m, n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                ans.data[j][i] = data[i][j];
        }
        return ans;
    }
    public String toString(){
        String ans = "";
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++)
                ans += String.valueOf(this.data[i][j]) + " ";
            ans += "\n";
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
    public static void main1750520(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n,m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }

}
