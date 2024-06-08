package OnTap.J06001;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> products = new HashMap<>();
        ArrayList<Invoice> invoices = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String idx = sc.nextLine();
            products.put(idx, new Product(idx, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String idx = sc.next();
            String quantity = sc.next();
            Product product = products.get(idx.substring(0,2));
            invoices.add(new Invoice(i, idx, product, quantity));
        }
        invoices.stream().sorted(Comparator.comparing(Invoice::getPrice).reversed()).forEach(System.out::println);
    }
}
