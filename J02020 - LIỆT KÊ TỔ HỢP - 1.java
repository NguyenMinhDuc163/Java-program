import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static int []a = new int[100];
    public static int n, k, cnt = 0;

    public static void Try(int i){
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k){
                for(int t = 1; t <= k; t++)
                    System.out.print(a[t] + " ");
                System.out.println();
                cnt++;
            }
            else Try(i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        n = sc.nextInt(); k = sc.nextInt();
        Try(1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
