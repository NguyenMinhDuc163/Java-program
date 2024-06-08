package BaiTapCodeptit.J07020;

public class Invoice {
    private String invoiceID;
    private Client client ;
    private Product product ;

    public Invoice(int invoiceID, Client client, Product product, int quantity) {
        this.invoiceID = String.format("HD%03d", invoiceID);
        this.client = client;
        this.product = product;
        this.quantity = quantity;
    }

    private int quantity;



    @Override
    public String toString() {
        return invoiceID + " " + client.toString() + " " + product.toString() + " " + quantity + " " + (quantity * product.getPriceOut());
    }
}
