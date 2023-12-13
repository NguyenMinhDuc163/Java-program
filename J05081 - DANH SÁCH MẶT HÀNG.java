import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
 class Problem {
    private String idx, name, unit;
    private int gMua, gban;

    public Problem(int idx, String name, String unit, int gMua, int gban) {
        this.idx = String.format("MH%03d", idx);
        this.name = name;
        this.unit = unit;
        this.gMua = gMua;
        this.gban = gban;
    }

    public int getLoiNhuan() {
        return gban - gMua;
    }
    public String toString(){
        return idx + " " + name + " " + unit + " " + gMua + " " + gban + " " + getLoiNhuan();
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
            Problem tmp = new Problem(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
            a.add(tmp);
        }
        a.sort((x, y) -> Integer.compare(y.getLoiNhuan(), x.getLoiNhuan()));
        a.forEach(System.out::println);
    }
}
