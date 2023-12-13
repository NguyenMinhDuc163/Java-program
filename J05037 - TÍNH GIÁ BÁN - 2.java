import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.lang.ref.SoftReference;
import java.util.HashMap;

 class Problem {
    private String idx, name, unit;
    private double  shipping, total, price, size,salePrice;

    public Problem(int idx, String name, String unit, double price, double size) {
        this.idx = String.format("MH%02d", idx);
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.size =size;
        this.shipping = Math.round(price * size *  5 / 100);
        this.total = Math.round(price * size + shipping);
        this.salePrice =  Math.ceil((double) total * 1.02 / size/100) * 100; // chia 100 de lm tron sau do nhan lai
    }

    public double getSalePrice() {
        return salePrice;
    }

    public String toString(){

        return String.format("%s %s %s %.0f %.0f %.0f\n",idx, name, unit, shipping, total,salePrice);
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
            a.add(new Problem(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        a.sort((x, y) -> Double.compare(y.getSalePrice(), x.getSalePrice()));
        a.forEach(System.out::println);
    }
}
