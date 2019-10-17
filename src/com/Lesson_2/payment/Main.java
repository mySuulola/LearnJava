package com.Lesson_2.payment;

public class Main {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[4];

        payableObjects[0] = new Invoice("0123", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("0123", "seat", 2, 375.00);
        payableObjects[2] = new SalariedEmployee("Ade", "Makinde", "JLFK432M", 47532.00);
        payableObjects[3] = new SalariedEmployee("Coolo", "Sam", "SDFA3DS", 23132.00);

        System.out.println("Invoice and Employees processed polymorphically");

        for(Payable currentPayable : payableObjects) {
            // invokes .toString implicitly
            System.out.println(currentPayable  + "Payment due is " + currentPayable.getPaymentAmount() + "\n");

        }
    }

}
