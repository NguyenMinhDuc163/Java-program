package ThucHanh.Lan2.bai11;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
//        HashMap<String, Product> products = new HashMap<>();
//        HashMap<String, Client> clients = new HashMap<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Warranty> warranties = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String productID = sc.nextLine();
            String productName = sc.nextLine();
            String price = sc.nextLine();
            String warrantyTime = sc.nextLine();
            products.add(new Product(productID, productName, price, warrantyTime));
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String clientName = sc.nextLine();
            String address = sc.nextLine();
            String productID = sc.nextLine();
            String quantity = sc.nextLine();
            String date = sc.nextLine();
            Client client = new Client(i, clientName, address, productID, quantity, date);
            Product product = products.stream().filter(k -> k.getProductID().equals(productID)).findFirst().orElse(null);
            warranties.add(new Warranty(product, client));
        }
        warranties.stream().sorted(Comparator.comparing(Warranty::getWarrantyPeriod).thenComparing(Warranty::getClient))
                .forEach(System.out::println);
    }
}
