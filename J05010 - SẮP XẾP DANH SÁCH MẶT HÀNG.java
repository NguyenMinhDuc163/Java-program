import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
 class MatHang {
    public String idx, name, group;
    public double gMua, gBan;

    public MatHang(int idx, String name, String group, double gMua, double gBan) {
        this.idx = String.format("%d",idx);
        this.name = name;
        this.group = group;
        this.gMua = gMua;
        this.gBan = gBan;
    }

    public double getLoiNhuan(){
        return gBan - gMua;
    }
    public String toString(){
        return idx + " " + name + " " + group + " " + String.format("%.2f",getLoiNhuan());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<MatHang> matHangs = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            matHangs.add(new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        matHangs.sort((x, y) -> Double.compare(y.getLoiNhuan(), x.getLoiNhuan()));
        matHangs.forEach(System.out::println);
    }
}
