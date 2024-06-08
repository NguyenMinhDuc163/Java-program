package ThucHanh.Lan4.Bai17;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        List<Client>clients = new ArrayList<>();
        List<Product>products = new ArrayList<>();
        List<Invoice>invoices = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            clients.add(new Client(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("MH.in"));
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            products.add(new Product(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("HD.in"));
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= k; i++){
            String []s = sc.nextLine().split(" ");
            Client client = clients.stream().filter(x -> x.getClientID().equals(s[0])).findFirst().orElse(null);
            Product product = products.stream().filter(x -> x.getProductID().equals(s[1])).findFirst().orElse(null);
            invoices.add(new Invoice(i, client, product, s[2]));
        }
        invoices.forEach(System.out::println);
    }
}
