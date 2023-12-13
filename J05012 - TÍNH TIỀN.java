import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

 class Items {
    private String idx, name;
    private long quanlity, price, discount, totalPrice;

    public Items(String idx, String name, long quanlity, long price, long discount) {
        this.idx = idx;
        this.name = name;
        this.quanlity = quanlity;
        this.price = price;
        this.discount = discount;
        this.totalPrice = quanlity * price - discount;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public String toString(){
        return String.format("%s %s %d %d %d %d", idx, name, quanlity, price, discount, totalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Items> items = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            items.add(new Items(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong(), sc.nextLong()));
        }
        items.stream().sorted((x, y) -> Long.compare(y.getTotalPrice(),x.getTotalPrice())).forEach(System.out::println);
    }
}
