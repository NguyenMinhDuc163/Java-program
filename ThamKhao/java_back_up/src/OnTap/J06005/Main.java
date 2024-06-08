package OnTap.J06005;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Client> clients = new HashMap<>();
        HashMap<String, Product> products = new HashMap<>();
        ArrayList<Invoice> invoices = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String idx = String.format("KH%03d", i);
            clients.put(idx, new Client(idx, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String idx = String.format("MH%03d", i);
            products.put(idx, new Product(idx, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= k; i++){
            String []s = sc.nextLine().split("\\s+");
            Client client = clients.get(s[0]);
            Product product = products.get(s[1]);
            invoices.add(new Invoice(i, client, product, s[2]));
        }
        invoices.stream().sorted(Comparator.comparing(Invoice::getProfit).reversed()).forEach(System.out::println);
    }
}
