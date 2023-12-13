import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;

class Problem {
    private String idx, name,birth, rank;
    private double theory,practice, avg;
    private int old;

    public Problem(int idx, String name, String birth, double theory, double practice) {
        this.idx = String.format("PH%02d", idx);
        this.name = name;
        this.birth = birth;
        this.theory = theory;
        this.practice = practice;
        double bonus = 0;
        if(theory >= 8 && practice >= 8) bonus = 1.0;
        else if(theory >= 7.5 && practice >= 7.5) bonus = 0.5;
        else bonus = 0;
        this.avg = (double) Math.round((double) (theory + practice) / 2 + bonus);
        if(avg > 10) avg = 10;
        if(avg < 5) rank = "Truot";
        else if (avg <= 6) rank = "Trung binh";
        else if (avg <= 7) rank = "Kha";
        else if(avg <= 8) rank = "Gioi";
        else rank = "Xuat sac";
        old = 2021 - Integer.parseInt(birth.substring(6));
    }

    public String toString(){
        return String.format("%s %s %d %.0f %s", idx, name, old, avg, rank);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Problem> a = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            a.add(new Problem(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        a.forEach(System.out::println);
    }
}
