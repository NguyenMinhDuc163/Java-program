import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static boolean isSymmetry(int []a, int n){
        int i = 0, j = n - 1;
        while(i < j){
            if(a[i] != a[j]) return false;
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t -->0 ){
            int n = sc.nextInt();
            int []a = new int[n + 5];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            if(isSymmetry(a, n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
