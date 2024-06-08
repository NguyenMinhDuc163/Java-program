package BaiTapCodeptit.J07020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        List<Client> clients = new ArrayList<>();
        List<Product> products  = new ArrayList<>();
        List<Invoice> invoices = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            clients.add(new Client(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("MH.in"));
        int m = sc.nextInt();
        for(int i = 1; i <= m; i++){
            sc.nextLine();
            products.add(new Product(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        sc = new Scanner(new File("HD.in"));
        int k = sc.nextInt();
        for(int i = 1; i <= k; i++){
            String clientID = sc.next();
            String productID = sc.next();
            int quantity = sc.nextInt();
            Client client =  clients.stream().filter(x -> x.getClientID().equals(clientID)).findFirst().orElse(null);
            Product product = products.stream().filter(x -> x.getProductID().equals(productID)).findFirst().orElse(null);
            invoices.add(new Invoice(i, client, product, quantity));
        }
        invoices.forEach(System.out::println);
    }
}
