import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] s = sc.nextLine().split("\\s+");
            ArrayList<String> ans = new ArrayList<>();
            for (String x : s) {
                if (x.length() > 0) {
                    String tmp = x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() ;
                    ans.add(tmp);
                }
            }
            for(int i = 1; i < ans.size() - 1; i++){
                System.out.print(ans.get(i) + " ");
            }
            System.out.print(ans.get(ans.size() - 1) + ", ");
            System.out.println(ans.get(0).toUpperCase());
        }
    }
}
