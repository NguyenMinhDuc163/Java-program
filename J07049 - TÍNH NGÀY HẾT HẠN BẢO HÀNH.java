bai11/Client.java
package ThucHanh2.bai11;


public class Client {
    private String clientID, clientName, address, productID,PurchaseDate;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public String getClientID() {
        return clientID;
    }

    public String getPurchaseDate() {
        return PurchaseDate;
    }

    public Client(int clientID, String clientName, String address, String productID, String quantity, String purchaseDate) {
        this.clientID = String.format("KH%02d", clientID);
        this.clientName = clientName;
        this.address = address;
        this.productID = productID;
        this.quantity = Integer.parseInt(quantity);
        PurchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return String.join(" ", clientID, clientName, address, productID);
    }
}

bai11/Main.java
package ThucHanh2.bai11;

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

bai11/Product.java
package ThucHanh2.bai11;

public class Product {
    private String productID, producName;
    private int price,warrantyTime;

    public String getProductID() {
        return productID;
    }

    public int getPrice() {
        return price;
    }

    public int getWarrantyTime() {
        return warrantyTime;
    }

    public Product(String productID, String producName, String price, String warrantyTime) {
        this.productID = productID;
        this.producName = producName;
        this.price = Integer.parseInt(price);
        this.warrantyTime = Integer.parseInt(warrantyTime);
    }

    @Override
    public String toString() {
        return productID ;
    }
}

bai11/Warranty.java
package ThucHanh2.bai11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Warranty {
    private Product product;
    private Client client;
    private String warrantyPeriod;
    private int totalPrice = 0;
    public String solveDate(String purchaseDate, int warrantyTime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(purchaseDate.trim());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, warrantyTime);
        return sdf.format(calendar.getTime());
    }
    public Warranty(Product product, Client client) {
        this.product = product;
        this.client = client;
        totalPrice = product.getPrice() * client.getQuantity();
        try {
            warrantyPeriod = solveDate(client.getPurchaseDate(), product.getWarrantyTime());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public String getClient() {
        return client.getClientID();
    }
    public String getWarrantyPeriod(){
        String []s = warrantyPeriod.split("/");
        return s[2] + s[1] + s[0];
    }
    @Override
    public String toString() {
        return client + " " + totalPrice + " "+ warrantyPeriod;
    }
}

