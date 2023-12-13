import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;
class Invoice {
    private String codeIvoice;
    private Client client;
    private MatHang matHang;
    private int quantity, total;

    public Invoice(int codeIvoice, Client client, MatHang matHang, int quantity) {
        this.codeIvoice = String.format("HD%03d",codeIvoice);
        this.client = client;
        this.matHang = matHang;
        this.quantity = quantity;
        this.total = matHang.getPriceOut() * quantity;
    }

    public String toString(){
        return String.format("%s %s %s %s %s %d %d %d %d", codeIvoice, client.getName(), client.getAddress(),
                matHang.getName(), matHang.getUnit(), matHang.getPriceIn(), matHang.getPriceOut(), quantity, total);
    }
}
class Client {
    private String codeClient, name, sex, birth, address;

    public String getCodeClient() {
        return codeClient;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

    public Client(int codeClient, String name, String sex, String birth, String address) {
        this.codeClient = String.format("KH%03d", codeClient);
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
    }
}

 class MatHang {
    private String codeProduct, name, unit;
    private int priceIn, priceOut;

    public String getCodeProduct() {
        return codeProduct;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getPriceIn() {
        return priceIn;
    }

    public int getPriceOut() {
        return priceOut;
    }

    public MatHang(int codeProduct, String name, String unit, int priceIn, int priceOut) {
        this.codeProduct = String.format("MH%03d",codeProduct);
        this.name = name;
        this.unit = unit;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<MatHang> matHangs = new ArrayList<>();
        ArrayList<Invoice> invoices = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            clients.add(new Client(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m =sc.nextInt();
        for(int i = 1; i <= m; i++){
            sc.nextLine();
            matHangs.add(new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        int k = sc.nextInt();
        for(int i = 1; i <= k; i++){
            String codeClien = sc.next();
            String codeMH = sc.next();
            int quantity = sc.nextInt();
            Client a = clients.stream().filter(x -> x.getCodeClient().equals(codeClien)).findFirst().orElse(null);
            MatHang b = matHangs.stream().filter(x -> x.getCodeProduct().equals(codeMH)).findFirst().orElse(null);
            invoices.add(new Invoice(i, a, b,quantity));
        }
        invoices.forEach(System.out::println);
    }

}
