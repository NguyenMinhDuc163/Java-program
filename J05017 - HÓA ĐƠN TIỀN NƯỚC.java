import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
class Invoice {
    private String idx, name;
    private double oldNum, newNum,extraFee, totalPrice, price, waterBlock;

    public Invoice(int idx, String name, double oldNum, double newNum) {
        this.idx = String.format("KH%02d", idx);
        this.name = name;
        this.oldNum = oldNum;
        this.newNum = newNum;
        setTotalPrice();

    }


    public void setTotalPrice(){
        waterBlock = newNum - oldNum;
        if(waterBlock > 50){
            totalPrice = 50 * 100;
            if(waterBlock > 100){
                totalPrice += 50 * 150;
                totalPrice += (waterBlock - 100) * 200;
                totalPrice = Math.round(totalPrice * 1.05);
            }
            else {
                totalPrice += (waterBlock - 50) * 150;
                totalPrice = Math.round(totalPrice * 1.03);
            }
        }
        else totalPrice = waterBlock * 102;
    }
    public double getTotalPrice() {
        return totalPrice;
    }

    public String toString(){
        return String.format("%s %s %.0f", idx, name, totalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Invoice> invoices = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            invoices.add(new Invoice(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        invoices.stream().sorted((x, y)->Double.compare(y.getTotalPrice(), x.getTotalPrice())).forEach(System.out::println);
    }
}
