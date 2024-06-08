package BaiTapCodeptit.J07020;

public class Product {
    private String productID, productName, unit;
    private int priceIn, priceOut;

    public Product(int productID, String productName, String unit, int priceIn, int priceOut) {
        this.productID = String.format("MH%03d", productID);
        this.productName = productName;
        this.unit = unit;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
    }

    public String getProductID() {
        return productID;
    }

    public int getPriceOut() {
        return priceOut;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return productName + " " + unit + " " + priceIn + " " + priceOut;
    }
}
