import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String s =sc.nextLine();
        TreeSet<Character> se = new TreeSet<>();
        for(char x: s.toCharArray()){
            se.add(x);
        }
        System.out.println(se.size());
    }
}
