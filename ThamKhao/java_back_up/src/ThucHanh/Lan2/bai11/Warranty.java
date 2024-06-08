package ThucHanh.Lan2.bai11;

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
