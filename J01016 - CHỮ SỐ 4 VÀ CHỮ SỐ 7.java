import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String s = sc.nextLine();
        int cnt = 0;
        for(char x: s.toCharArray()){
            if(x == '4' || x == '7') cnt++;
        }
        if(cnt == 4 || cnt == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
