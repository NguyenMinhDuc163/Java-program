import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void isCheck(String s){
        int odd = 0, even = 0;
        for(char x: s.toCharArray()){
            if(!Character.isDigit(x)){
                System.out.println("INVALID");
                return;
            }
            int tmp = x - '0';
            if(tmp % 2 == 0) even++;
            else odd++;
        }
        if(odd == even) System.out.println("INVALID");

        if((s.length() % 2 == 0 && even > odd )|| (s.length() % 2 == 1 && odd < even))
            System.out.println("YES");
        else System.out.println("NO");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0 ){
            String s = sc.nextLine();
            isCheck(s);
        }
    }
}
