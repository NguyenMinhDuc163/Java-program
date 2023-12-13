package codeptit;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
class Client{
    private String idx, name, room, checkIn, checkOut;
    private long dayStay, extraFee, totolPrice;
    private static HashMap<String, Integer> price = new HashMap<>();

    public Client(int idx, String name, String room, String checkIn, String checkOut, long extraFee) {
        this.idx = String.format("KH%02d", idx);
        this.name = name.trim();
        this.room = room.trim();
        this.checkIn = stdDay(checkIn.trim());
        this.checkOut = stdDay(checkOut.trim());
        this.extraFee = extraFee;
        setPrice(); setDayStay();
        setTotolPrice(); stdName();
    }
    public void setPrice(){
        price.put("1", 25);
        price.put("2", 34);
        price.put("3", 50);
        price.put("4", 80);
    }
    public void setDayStay(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDay = LocalDate.parse(checkIn, formatter);
        LocalDate endDay = LocalDate.parse(checkOut, formatter);
        dayStay = ChronoUnit.DAYS.between(startDay, endDay) + 1;
    }
    public void setTotolPrice(){
        totolPrice = price.get(room.substring(0,1)) * dayStay + extraFee;

    }

    public long getTotolPrice() {
        return totolPrice;
    }
    public String stdDay(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }
    public void stdName(){
        String []s = this.name.split("\\s+");
        String res = "";
        for(String x: s){
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        this.name = res.trim();
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", idx, name, room, dayStay, totolPrice);
    }
}
public class J07051 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        List<Client> clients = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            clients.add(new Client(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        clients.stream().sorted(Comparator.comparing(Client::getTotolPrice).reversed()).forEach(System.out::println);
    }
}
