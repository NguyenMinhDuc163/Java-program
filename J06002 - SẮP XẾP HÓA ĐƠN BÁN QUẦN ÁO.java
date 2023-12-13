import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.Objects;

class Invoice {
    private String codeInvoice, type, idx;
    private int quantity, discount, total;
    private MatHang matHang;

    public Invoice(int idx, String codeInvoice, String type,  int quantity, MatHang matHang) {
        this.idx = String.format("-%03d",idx);
        this.codeInvoice = codeInvoice;
        this.type = type;
        this.quantity = quantity;
        this.matHang = matHang;
        setDiscount();
    }
    public void setDiscount(){
        if(Objects.equals(type, "1")) total = quantity * matHang.getPriceOne();
        else total = quantity * matHang.getPriceTwo();
        if(quantity >= 150) discount = (int) (total * 0.5);
        else if(quantity >= 100) discount = (int) (total * 0.3);
        else if(quantity >= 50) discount = (int) (total * 0.15);
        else discount = 0;
    }

    public int getPay() {
        return total - discount;
    }

    public String toString(){
        return codeInvoice + idx + " " + matHang.getName() + " " + discount + " " + (total - discount);
    }
}

class MatHang {
    private String codeProduct, name;
    private int priceOne, priceTwo;

    public MatHang(String codeProduct, String name, int priceOne, int priceTwo) {
        this.codeProduct = codeProduct;
        this.name = name;
        this.priceOne = priceOne;
        this.priceTwo = priceTwo;

    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public String getName() {
        return name;
    }

    public int getPriceOne() {
        return priceOne;
    }

    public int getPriceTwo() {
        return priceTwo;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<MatHang> matHangs = new ArrayList<>();
        ArrayList<Invoice> invoices = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            matHangs.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        int m = sc.nextInt();
        for(int i = 1; i <= m; i++){
            String codeInvoce = sc.next();
            int quantity = sc.nextInt();
            MatHang a = matHangs.stream().filter(x -> x.getCodeProduct().equals(codeInvoce.substring(0,2))).findFirst().orElse(null);
            invoices.add(new Invoice(i, codeInvoce, codeInvoce.substring(2),quantity, a));
        }
        invoices.stream().sorted(Comparator.comparing(Invoice::getPay).reversed()).forEach(System.out::println);
    }
}
