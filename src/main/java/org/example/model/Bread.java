package org.example.model;

public class Bread extends ProductForSale{

    private boolean isStale;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.isStale = false;
    }

    public Bread(String type, double price, String description, boolean isStale) {
        super(type, price, description);
        this.isStale = isStale;
    }

    public boolean isStale() {
        return isStale;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: "
                + getType() + " Price: "
                + getPrice() + " Description: "
                + getDescription() + "IsStale: "
                + isStale());
    }
}
