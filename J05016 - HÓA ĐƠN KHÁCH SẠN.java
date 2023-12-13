import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Locale;

 class Invoice {
    private String idx, name, roomNum, checkIn, checkOut;
    private int extraFee, dayOfStay, totalFee;
    private static HashMap<String, Integer> floorFee = new HashMap<>();
    public Invoice(int idx, String name, String roomNum, String checkIn, String checkOut, int extraFee) {
        this.idx = String.format("KH%02d", idx);
        this.name = name.trim();
        this.roomNum = roomNum.trim();
        this.checkIn = checkIn.trim();
        this.checkOut = checkOut.trim();
        this.extraFee = extraFee;
        setFloorFee();
        setDayOfStay();
        setTotalFee();
    }

    public void setFloorFee() {
        floorFee.put("1", 25);
        floorFee.put("2", 34);
        floorFee.put("3", 50);
        floorFee.put("4", 80);
    }
    public void setDayOfStay(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(checkIn, formatter);
        LocalDate endDate = LocalDate.parse(checkOut, formatter);
        dayOfStay = (int) ChronoUnit.DAYS.between(startDate, endDate) + 1;
    }

    public void setTotalFee(){
        int floor = floorFee.get(roomNum.substring(0,1));
        totalFee =  floor * dayOfStay + extraFee;
    }
    public String toString(){
        return String.format("%s %s %s %d %d", idx, name, roomNum, dayOfStay , totalFee);
    }

    public int getTotalFee() {
        return totalFee;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Invoice> invoices = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            invoices.add(new Invoice(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        invoices.stream().sorted((x, y)->Integer.compare(y.getTotalFee(), x.getTotalFee())).forEach(System.out::println);
    }
}
