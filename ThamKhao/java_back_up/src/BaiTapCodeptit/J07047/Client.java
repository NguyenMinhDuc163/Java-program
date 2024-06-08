package BaiTapCodeptit.J07047;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Client {
    private String clientID, clientName,roomID, checkIn, checkOut;
    private long day;
    private double totalPrice;
    private Room room;

    public Client(int idx, String clientName, String roomID, String checkIn, String checkOut, Room room) {
        this.clientID = String.format("KH%02d", idx);
        this.clientName = clientName;
        this.roomID = roomID;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.room = room;
        setDay();
    }
    public void setDay(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(this.checkIn, formatter);
        LocalDate endDate = LocalDate.parse(this.checkOut, formatter);
        day = ChronoUnit.DAYS.between(startDate, endDate);
        if(day == 0) day = 1;
    }
    public void setTotalPrice(){
        double price = day * room.getPrice();
        double discount = 0;
        if(day == 0) discount = price;
        else if(day >= 20) discount = price * (1  - 0.04);
        else if(day >= 10) discount = price * (1 - 0.02);
        else discount = 0;
//        double totalExtra = room.getExtra() * room.getPrice() * day;
//        totalPrice = (room.getPrice() * day + totalExtra) * (1 - discount);
//        totalPrice = Math.round(totalPrice * 100) / 100.0;
        totalPrice = price +  price * room.getExtra();
    }

    public long getDay() {
        return day;
    }

    @Override
    public String toString() {
        setTotalPrice();
        return String.join(" ",clientID, clientName, roomID) + " " +  day + " " + String.format("%.2f",totalPrice);
    }
}
