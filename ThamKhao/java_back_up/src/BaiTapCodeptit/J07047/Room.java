package BaiTapCodeptit.J07047;

public class Room {
    private String roomType,  roomName;
    private double price, extra;

    public Room(String roomType, String roomName, String price, String extra) {
        this.roomType = roomType;
        this.roomName = roomName;
        this.price = Double.parseDouble(price);
        this.extra = Double.parseDouble(extra);
    }


    public double getPrice() {
        return price;
    }

    public double getExtra() {
        return extra;
    }
}
