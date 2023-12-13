import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.lang.ref.SoftReference;
import java.util.HashMap;

 class Problem {
    private String idx, name, begin, end;
    private String hour ;

    public Problem(String idx, String name, String begin, String end) {
        this.idx = idx;
        this.name = name;
        this.begin = begin;
        this.end = end;
    }

    public int getGioChoi(){
        String []B = begin.split(":");
        String []E = end.split(":");
        int hours = Integer.parseInt(E[0]) * 60 + Integer.parseInt(E[1]) - ( Integer.parseInt(B[0]) * 60 + Integer.parseInt(B[1]));
        this.hour =  (hours / 60) + " gio " + (hours % 60) + " phut ";
        return hours;
    }
    public String toString(){
        return idx + " " + name + " " + hour;
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
            a.add(new Problem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        a.sort((x, y) -> Integer.compare(y.getGioChoi(), x.getGioChoi()));
        a.forEach(System.out::println);
    }
}
