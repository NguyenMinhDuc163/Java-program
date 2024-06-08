//package codeptit;
//import java.io.*;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoField;
//import java.time.temporal.ChronoUnit;
//import java.util.*;
//class Client{
//    private String idx, name, room, checkin, checkout;
//    private long dayStay;
//
//    public Client(int idx, String name, String room, String checkin, String checkout) {
//        this.idx = String.format("KH%02d", idx);
//        this.name = name;
//        this.room = room;
//        this.checkin = checkin;
//        this.checkout = checkout;
//        setDayStay();
//    }
//    public void setDayStay(){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate startDate = LocalDate.parse(checkin, formatter);
//        LocalDate endDate = LocalDate.parse(checkout, formatter);
//        this.dayStay = ChronoUnit.DAYS.between(startDate, endDate);
//    }
//
//    public long getDayStay() {
//        return dayStay;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %s %d",idx, name, room, dayStay);
//    }
//}
//public class J07046 {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("KHACH.in"));
//        int n = sc.nextInt();
//        sc.nextLine();
//        List<Client> clients = new ArrayList<>();
//        for(int i = 1; i <= n; i++){
//            clients.add(new Client(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
//        }
//        clients.stream().sorted(Comparator.comparing(Client::getDayStay).reversed()).forEach(System.out::println);
//    }
//}
