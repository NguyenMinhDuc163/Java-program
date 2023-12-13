import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static int []a = new int[100];
    public static int n;
    public static boolean used[] = new boolean[1005];

    public static boolean isCheck(){
        for(int i = 2; i <= n; i++){
            if(Math.abs(a[i] - a[i - 1]) == 1)
                return false;
        }
        return true;
    }
    public static void in(){
        for(int i = 1; i <= n; i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void Try(int i){
        for(int j = 1; j <= n; j++){
            if(!used[j]){
                a[i] = j; used[j] = true;
                if(i == n){
                    if(isCheck())
                     in();
                }
                else Try(i + 1);
                used[j] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t -->0 ){
            n = sc.nextInt();
            Try(1);
        }
    }
}
