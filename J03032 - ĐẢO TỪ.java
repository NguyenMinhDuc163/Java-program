import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0 ){
            String []s = sc.nextLine().split("\\s+");
            for(String x: s){
                System.out.print(new StringBuilder(x).reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
