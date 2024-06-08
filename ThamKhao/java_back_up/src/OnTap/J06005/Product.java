package OnTap.J06005;

public class Product {
    private String productID, productName, unit;
    private int priceIn, priceOut;

    public Product(String productID, String productName, String unit, String priceIn, String priceOut) {
        this.productID = productID;
        this.productName = productName;
        this.unit = unit;
        this.priceIn = Integer.parseInt(priceIn);
        this.priceOut = Integer.parseInt(priceOut);
    }
    public int getPriceOut() {
        return priceOut;
    }

    public int getPriceIn() {
        return priceIn;
    }

    @Override
    public String toString() {
        return productName;
    }
}
