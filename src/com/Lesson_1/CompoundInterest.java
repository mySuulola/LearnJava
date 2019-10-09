package com.Lesson_1;

public class CompoundInterest {
    public static void main(String[] args) {
        double amount;
        double principal = 1000;
        double rate = 0.05;
        int numberOfYears = 10;


        for(int year = 1; year <= numberOfYears; year++ ) {
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
