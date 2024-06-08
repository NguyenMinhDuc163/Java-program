package OnTap.J06001;

public class Invoice {
    private String invoiceID, invoiceCocde;
    private Product product;
    private int quantity;

    public Invoice(int invoiceID, String invoiceCocde, Product product, String quantity) {
        this.invoiceID = String.format("-%03d", invoiceID);
        this.invoiceCocde = invoiceCocde;
        this.product = product;
        this.quantity =Integer.parseInt(quantity);
    }

    public int solvePrice(){
        int totalPrice = 0;
        String type =  invoiceCocde.substring(2);
        if(type.equals("1")) totalPrice = product.getPriceOne() * quantity;
        else totalPrice = product.getPriceTwo() * quantity;
        return totalPrice;
    }

    public int solveDiscount(){
        int totalPrice = solvePrice();
        int discount = 0;
        if(quantity >= 150) discount = (int)(totalPrice * 0.5);
        else if (quantity >= 100) discount = (int)(totalPrice * 0.3);
        else if(quantity >= 50) discount = (int)(totalPrice * 0.15);
        else discount = 0;
        return discount;
    }
    public int getPrice(){
        return solvePrice() - solveDiscount();
    }
    @Override
    public String toString() {
        return invoiceCocde + invoiceID + " " + product +  " " + solveDiscount() + " " + (solvePrice() - solveDiscount());
    }
}
