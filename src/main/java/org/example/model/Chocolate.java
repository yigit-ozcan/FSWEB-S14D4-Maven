package org.example.model;

public class Chocolate extends ProductForSale{

    private boolean isOpen;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.isOpen = false;
    }

    public Chocolate(String type, double price, String description, boolean isOpen) {
        super(type, price, description);
        this.isOpen =  isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: "
                + getType() + " Price: "
                + getPrice() + " Description: "
                + getDescription() + "IsOpen: "
                + isOpen());
    }
}
