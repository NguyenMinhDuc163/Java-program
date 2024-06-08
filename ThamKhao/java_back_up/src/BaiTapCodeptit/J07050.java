package BaiTapCodeptit;

import java.io.*;
import java.util.*;

class Item{
    private String idx, name, type;
    private double priceIn, priceOut, profit;

    public Item(int idx, String name, String type, double priceIn, double priceOut) {
        this.idx = String.format("MH%02d", idx);
        this.name = name;
        this.type = type;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.profit = priceOut - priceIn;
    }

    public double getProfit() {
        return profit;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %.2f", idx, name, type, profit);
    }
}
public class J07050 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = sc.nextInt();
        List<Item> items = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            items.add(new Item(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        items.stream().sorted(Comparator.comparing(Item::getProfit).reversed()).forEach(System.out::println);
    }
}
