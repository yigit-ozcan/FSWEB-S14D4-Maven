package org.example.model;

public class Store {

    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate(
                "Chocolate", 25.0, "Dark chocolate", false
        );

        products[1] = new Coke(
                "Coke", 15.0, "Cold cola", true
        );

        products[2] = new Bread(
                "Bread", 10.0, "Daily bread", false
        );

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}
