import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static boolean hasOnlyOneDifferentDigit(long num) {
        String numStr = String.valueOf(num);
        int length = numStr.length();

        for (int i = 0; i < length - 1; i++) {
            if (Math.abs(numStr.charAt(i) - numStr.charAt(i + 1)) != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (hasOnlyOneDifferentDigit(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
