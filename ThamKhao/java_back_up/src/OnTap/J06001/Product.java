package OnTap.J06001;

public class Product {
    private String productID, proDuctName;
    private int priceOne, priceTwo;

    public Product(String productID, String proDuctName, String priceOne, String priceTwo) {
        this.productID = productID;
        this.proDuctName = proDuctName;
        this.priceOne = Integer.parseInt(priceOne);
        this.priceTwo = Integer.parseInt(priceTwo);
    }

    public int getPriceOne() {
        return priceOne;
    }

    public int getPriceTwo() {
        return priceTwo;
    }

    @Override
    public String toString() {
        return proDuctName;
    }
}
