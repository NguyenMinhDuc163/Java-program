package OnTap.J06005;

public class Invoice {
    String invoiceID;
    Client client;
    Product product;
    int quantity ;

    public Invoice(int invoiceID, Client client, Product product, String quantity) {
        this.invoiceID = String.format("HD%03d", invoiceID);
        this.client = client;
        this.product = product;
        this.quantity = Integer.parseInt(quantity);
    }
    public int solvePrice(){
        return product.getPriceOut() * quantity;
    }

    public int getProfit(){
        return quantity * (product.getPriceOut() - product.getPriceIn());
    }
    @Override
    public String toString() {
        return invoiceID + " " + client + " " + product + " " + quantity + " " + solvePrice() + " " + getProfit();
    }
}
