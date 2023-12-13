import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;

import java.util.HashMap;

class Problem {
    private String idx, name;
    private double quantity, price, discount, totalPrice, money;
    private static HashMap<String, Integer> count = new HashMap<>();

    public String ma(){
        String []s = name.toUpperCase().split("\\s+");
        return  s[0].charAt(0) + ""+ s[1].charAt(0);
    }
    public Problem(int idx, String name, double quantity, double price) {
        this.name = name;
        count.put(ma(), count.getOrDefault(ma(), 0) + 1);
        this.idx = String.format("%s%02d",ma(),count.get(ma()));
        this.quantity = quantity;
        this.price = price;
        this.money = quantity * price;
        if(quantity > 10) discount = money * 0.05;
        else if(quantity >= 8) discount = money * 0.02;
        else if(quantity >= 5) discount = money * 0.01;
        else discount = 0;
        this.totalPrice = money - discount;
    }

    public String toString(){
        return String.format("%s %s %.0f %.0f", idx, name, discount, totalPrice);
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
            a.add(new Problem(i, sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        a.forEach(System.out::println);
    }
}
