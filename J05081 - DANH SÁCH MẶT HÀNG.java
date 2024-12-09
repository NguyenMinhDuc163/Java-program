package org.example.codepit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    private String productID, productName, unit;
    int priceIn, priceOut;

    public Product(int index, String productName, String unit, int priceIn, int priceOut) {
        this.productID = String.format("MH%03d", index);
        this.productName = productName;
        this.unit = unit;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
    }

    int getProfit() {
        return this.priceOut - this.priceIn;
    }

    public String getProductID() {
        return productID;
    }

    @Override
    public String toString() {
        return String.join(" ", this.productID, this.productName, this.unit, String.valueOf(this.priceIn), String.valueOf(this.priceOut), String.valueOf(getProfit()));
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            products.add(new Product(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }

        products.stream()
                .sorted(Comparator.comparing(Product::getProfit).reversed())
                .forEach(System.out::println);
    }
}
