import java.util.Locale;
import java.util.Scanner;
 class Problem {
    private String name, birth;
    private double d1, d2, d3;

    public Problem(String name, String birth, double d1, double d2, double d3) {
        this.name = name;
        this.birth = birth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String toString(){
        return name + " " + birth + String.format(" %.1f", d1 + d2 + d3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Problem a = new Problem(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(a);
    }
}
