import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashMap;

class Problem {
    private final String name, idx, stt;
    private int price, quanlity, discount, total;

    public Problem(String name, String idx, int price, int quanlity) {
        this.name = name;
        this.idx = idx;
        this.price = price;
        this.quanlity = quanlity;
        this.stt = idx.substring(1, 4);
        char type = idx.charAt(4);
        if(type == '1') discount = (int)(0.5 * price * quanlity);
        if(type == '2') discount = (int)(0.3 * price * quanlity);
        this.total = price * quanlity - discount;
    }

    public String toString(){
        return String.format("%s %s %s %d %d", name, idx, stt, discount, total) ;
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
            a.add(new Problem(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        a.forEach(System.out::println);
    }
}
