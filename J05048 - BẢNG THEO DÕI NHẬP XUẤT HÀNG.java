import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;

import java.util.HashMap;

class Problem {
    private final String idx;
    private double quantityIn, quantityOut, price, total, tax;

    public Problem(String idx, double quantityIn) {
        this.idx = idx;
        this.quantityIn = quantityIn;
        if(idx.charAt(0) == 'A') quantityOut = Math.round(0.6 * quantityIn);
        if(idx.charAt(0) == 'B') quantityOut = Math.round(0.7 * quantityIn);
        if(idx.charAt(idx.length() - 1) == 'Y') price = 110000;
        if(idx.charAt(idx.length() - 1) == 'N') price = 135000;
        this.total = quantityOut * price;
        if(idx.charAt(0) == 'A' && idx.charAt(idx.length() - 1) == 'Y') tax = total * 0.08;
        if(idx.charAt(0) == 'A' && idx.charAt(idx.length() - 1) == 'N') tax = total * 0.11;
        if(idx.charAt(0) == 'B' && idx.charAt(idx.length() - 1) == 'Y') tax = total * 0.17;
        if(idx.charAt(0) == 'B' && idx.charAt(idx.length() - 1) == 'N') tax = total * 0.22;
    }

    public String toString(){
        return String.format("%s %.0f %.0f %.0f %.0f %.0f", idx, quantityIn, quantityOut, price, total, tax) ;
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
            a.add(new Problem(sc.nextLine(), sc.nextDouble()));
        }
        a.forEach(System.out::println);
    }
}
