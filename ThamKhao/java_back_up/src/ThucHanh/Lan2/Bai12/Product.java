package ThucHanh.Lan2.Bai12;


public class Product {
    private String productID, productName,unit;
    private int priceIn, priceOut;

    public int getPriceIn() {
        return priceIn;
    }

    public String getProductID() {
        return productID;
    }

    public int getPriceOut() {
        return priceOut;
    }

    public Product(int productID, String productName, String unit, String priceIn, String priceOut) {
        this.productID = String.format("MH%03d", productID);
        this.productName = productName;
        this.unit = unit;
        this.priceIn = Integer.parseInt(priceIn);
        this.priceOut = Integer.parseInt(priceOut);
    }

    @Override
    public String toString() {
        return productName + " " + unit + " " + priceIn + " " + priceOut;
    }
}
