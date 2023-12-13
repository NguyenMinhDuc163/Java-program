    package codeptit;

import java.io.*;
import java.util.*;

class Client{
    private String idx, name, type;
    private long startNum, endNum, totalPrice, fee = 0, extra = 0, VAT;
    private static Map<String, Integer> elecType = new HashMap<>();
    public Client(int idx, String name, String type, long startNum, long endNum) {
        this.idx = String.format("KH%02d", idx);
        this.name = stdName(name);
        this.type = type;
        this.startNum = startNum;
        this.endNum = endNum;
        elecType.put("A", 100);
        elecType.put("B", 500);
        elecType.put("C", 200);
        setTotalPrice();
    }
    public void setTotalPrice(){
        long quantity = endNum - startNum;
        VAT = 0;
        if(quantity < elecType.get(type))
            fee = quantity * 450;
        if(quantity > elecType.get(type)){
            fee = elecType.get(type) * 450;
            extra = (quantity - elecType.get(type)) * 1000;
            VAT = (extra * 5 ) / 100;
        }
        this.totalPrice = fee + extra + (int)VAT;
     
    }
    public String stdName(String tmp){
        String []s = tmp.trim().split("\\s+");
        String res = "";
        for(String x: s){
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }
    public long getTotalPrice() {
        return totalPrice;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", idx, name, fee, extra,VAT, totalPrice );
    }
    
}
public class J07056 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        List<Client> clients = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            clients.add(new Client(i, sc.nextLine(),sc.next(), sc.nextLong(), sc.nextLong()));
        }
        clients.stream().sorted(Comparator.comparing(Client::getTotalPrice).reversed()).forEach(System.out::println);
    }
}
