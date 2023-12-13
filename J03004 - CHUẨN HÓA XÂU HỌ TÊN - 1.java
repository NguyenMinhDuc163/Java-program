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
            StringBuilder ans = new StringBuilder();
            for (String x : s) {
                if (x.length() > 0) {
                    ans.append(x.substring(0, 1).toUpperCase())
                            .append(x.substring(1).toLowerCase())
                            .append(" ");
                }
            }
            System.out.println(ans.toString().trim());
        }
    }
}
