package com.Lesson_1;

public class Account {
    private String name_;
    private double balance_;

    public Account(String name, double balance) {
        this.name_ = name;
        if(balance > 0.0) {
            this.balance_ = balance;
        }
    }

    public void getCustomerDetails() {
        System.out.printf("the customer name is %s%n", name_);
        System.out.printf("the customer name is %s%n", balance_);
    }

    public void depositMoney(double deposit) {
        if(deposit > 0) {
            balance_ = balance_ + deposit;
        }
    }

}
