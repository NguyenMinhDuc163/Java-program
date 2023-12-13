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
    public String toString(){
        String ans = "";
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++)
                ans += String.valueOf(this.data[i][j] + " ");
            ans += "\n";
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
    public static void main3974403(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }

}
