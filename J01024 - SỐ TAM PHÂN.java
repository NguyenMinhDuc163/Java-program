import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static boolean isCheck(String s){
        for(char x: s.toCharArray()){
            if(x != '0' && x != '1' && x != '2')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0 ){
            String s = sc.nextLine();
            if(isCheck(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
