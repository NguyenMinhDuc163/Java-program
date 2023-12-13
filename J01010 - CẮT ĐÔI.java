import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void solve(String s) {
        StringBuilder tmp = new StringBuilder();
        for (char x : s.toCharArray()) {
            if (x == '0' || x == '8' || x == '9') {
                tmp.append("0");
            } else if (x == '1') {
                tmp.append("1");
            } else {
                System.out.println("INVALID");
                return;
            }
        }
        String ans = tmp.toString().replaceFirst("^0+", "");
        if(ans.isEmpty()) System.out.println("INVALID");
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            solve(s);
        }
    }
}
