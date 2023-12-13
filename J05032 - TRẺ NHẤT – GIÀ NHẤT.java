import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.lang.ref.SoftReference;
import java.util.HashMap;

 class Problem {
    private String name, birth;

    public Problem(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getBirth(){
        String []s = birth.split("/");
        return s[2] + s[1] + s[0];
    }
    public String toString(){
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Problem> a = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            a.add(new Problem(sc.next(), sc.next()));
        }
        a.sort((x, y) -> x.getBirth().compareTo(y.getBirth()));
        System.out.println(a.get(a.size() - 1) + "\n" + a.get(0));
    }
}
