import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            int res = romanToInt(s);
            System.out.println(res);
        }
    }

    public static int romanToInt(String s) {
        int[] ArrNumber = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] ArrLama = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        int res = 0;
        int currentIndex = 0;

        for (int i = 0; i < ArrLama.length; i++) {
            while (s.startsWith(ArrLama[i], currentIndex)) {
                res += ArrNumber[i];
                currentIndex += ArrLama[i].length();
                if (currentIndex >= s.length()) {
                    break;
                }
            }
        }

        return res;
    }
}
