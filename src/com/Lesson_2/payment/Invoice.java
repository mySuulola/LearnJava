package com.Lesson_2.payment;

public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(
            String partNumber,
            String partDescription,
            int quantity,
            double pricePerItem) {
        if(quantity < 0) throw new IllegalArgumentException("Quantity must not be less than 0");
        if(pricePerItem < 0) throw new IllegalArgumentException("Price per item must not be less than 0");

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }

    @Override
    public String toString() {
        return " Invoice Details \n\f" +
                "Invoice Number: " + partNumber +
                "\n Product Description : " + partDescription +
                "\n Quantity : " + quantity +
                "\n Price per Item : " + pricePerItem + "\n";
    }
}
