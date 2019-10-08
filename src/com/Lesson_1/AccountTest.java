package com.Lesson_1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome User, Enter your name");
            String name = input.nextLine();
            Account customer = new Account(name, 0);

            System.out.println(name + ", enter deposit amount for the account");
            double deposit =  input.nextDouble();
            customer.depositMoney(deposit);



            customer.getCustomerDetails();

        }catch (Exception exception) {
            System.out.println("Invalid Input. Please try again!!!");
        }

    }
}
