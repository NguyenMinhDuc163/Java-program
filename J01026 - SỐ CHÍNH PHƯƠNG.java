import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static boolean ChinhPhuong(int n){
        int k = (int) Math.sqrt(n);
        return k * k == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t -->0 ){
            int n = sc.nextInt();
            if(ChinhPhuong(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
