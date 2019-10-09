package com.Lesson_1;

public class Account {
    private String name_;
    private double balance_;

    public Account(String name, double balance) {
        this.name_ = name;
        if(balance > 0.0) {
            this.balance_ = balance;
        }
        System.out.println("Account created " + name);
    }

    public void getCustomerDetails() {
        System.out.printf("the account name is " + name_ + " with a deposit of " + balance_);
    }

    public void depositMoney(double deposit) {
        System.out.println("Depositing " + deposit + "...");
        if(deposit > 0) {
            balance_ = balance_ + deposit;
        }
    }
}
