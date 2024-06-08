package ThucHanh.Lan2.Bai12;

public class Invoice {
    private String invoiceID;
    private Client client;
    private Product product;
    private int quantity, totalPrice;

    public Invoice(int invoiceID, Client client, Product product, String quantity) {
        this.invoiceID = String.format("HD%03d", invoiceID);
        this.client = client;
        this.product = product;
        this.quantity = Integer.parseInt(quantity);
        this.totalPrice = product.getPriceOut() * this.quantity;
    }

    @Override
    public String toString() {
        return invoiceID + " " + client + " " + product + " " + quantity + " " + totalPrice;
    }
}
