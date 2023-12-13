J07020/Client.java
package codeptit.J07020;

public class Client {
    private String clientID, clientName, sex, birth, address;

    public Client(int clientID, String clientName, String sex, String birth, String address) {
        this.clientID = String.format("KH%03d", clientID);
        this.clientName = clientName;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
    }

    public String getClientID() {
        return clientID;
    }

    public Client() {
    }

    @Override
    public String toString() {
        return clientName + " " + address;
    }
}

J07020/Invoice.java
package codeptit.J07020;

public class Invoice {
    private String invoiceID;
    private Client client ;
    private Product product ;

    public Invoice(int invoiceID, Client client, Product product, int quantity) {
        this.invoiceID = String.format("HD%03d", invoiceID);
        this.client = client;
        this.product = product;
        this.quantity = quantity;
    }

    private int quantity;



    @Override
    public String toString() {
        return invoiceID + " " + client.toString() + " " + product.toString() + " " + quantity + " " + (quantity * product.getPriceOut());
    }
}

J07020/Main.java
package codeptit.J07020;

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

J07020/Product.java
package codeptit.J07020;

public class Product {
    private String productID, productName, unit;
    private int priceIn, priceOut;

    public Product(int productID, String productName, String unit, int priceIn, int priceOut) {
        this.productID = String.format("MH%03d", productID);
        this.productName = productName;
        this.unit = unit;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
    }

    public String getProductID() {
        return productID;
    }

    public int getPriceOut() {
        return priceOut;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return productName + " " + unit + " " + priceIn + " " + priceOut;
    }
}

