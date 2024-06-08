package ThucHanh.Lan2.bai11;


import java.util.Objects;

public class Client {
    private String clientID, clientName, address, productID,PurchaseDate;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public String getClientID() {
        return clientID;
    }

    public String getPurchaseDate() {
        return PurchaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return getQuantity() == client.getQuantity() && Objects.equals(productID, client.productID) && Objects.equals(getPurchaseDate(), client.getPurchaseDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, getPurchaseDate(), getQuantity());
    }

    public Client(int clientID, String clientName, String address, String productID, String quantity, String purchaseDate) {
        this.clientID = String.format("KH%02d", clientID);
        this.clientName = clientName;
        this.address = address;
        this.productID = productID;
        this.quantity = Integer.parseInt(quantity);
        PurchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return String.join(" ", clientID, clientName, address, productID);
    }
}
