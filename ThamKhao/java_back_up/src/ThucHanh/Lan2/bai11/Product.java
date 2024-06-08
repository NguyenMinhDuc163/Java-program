package ThucHanh.Lan2.bai11;

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
