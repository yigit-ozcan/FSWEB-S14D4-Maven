package org.example.model;

public class Coke extends ProductForSale{

    private boolean isFull;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.isFull = true;
    }

    public Coke(String type, double price, String description, boolean isFull) {
        super(type, price, description);
        this.isFull = isFull;
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: "
                + getType() + " Price: "
                + getPrice() + " Description: "
                + getDescription() + "IsFull: "
                + isFull());
    }
}
