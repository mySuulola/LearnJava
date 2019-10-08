package com.Lesson_1;

public class AccountTest {
    public static void main(String[] args) {
        Account customerOne = new Account("James Salah", 3000);
        Account customerTwo = new Account("Adekunle Taiwo", 90000);
        customerOne.depositMoney(50);
        customerOne.depositMoney(1240);

        customerOne.getCustomerDetails();
        customerTwo.getCustomerDetails();

    }
}
