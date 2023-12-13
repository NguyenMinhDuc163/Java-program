import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static int doTransPhone(char x){
        if(x == 'a' || x == 'b' || x == 'c') return 2;
        else if(x == 'd' || x == 'e' || x == 'f') return 3;
        else if(x == 'g' || x == 'h' || x == 'i') return 4;
        else if(x == 'j' || x == 'k' || x == 'l') return 5;
        else if(x == 'm' || x == 'n' || x == 'o') return 6;
        else if(x == 'p' || x == 'q' || x == 'r' || x == 's') return 7;
        else if(x == 't' || x == 'u' || x == 'v') return 8;
        else return 9;
    }

    public static boolean isCheck(String s){
        String tmp = "";
        for (char x: s.toCharArray()){
            tmp += doTransPhone(x);
        }
        String dao = new StringBuilder(tmp).reverse().toString();
        return tmp.equals(dao);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -->0 ){
            String s = sc.nextLine().toLowerCase();
            if(isCheck(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
