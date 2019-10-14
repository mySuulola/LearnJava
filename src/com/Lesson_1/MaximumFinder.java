package com.Lesson_1;

import java.util.Scanner;

public class MaximumFinder {

    public static double maximumNumber(double num1, double num2, double num3) {
        double maximumNum = num1;
        if(num2 > maximumNum) {
            maximumNum = num2;
        }

        if(num3 > maximumNum) {
            maximumNum = num3;
        }
        return maximumNum;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three float values separated by spaces");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double result = maximumNumber(num1, num2, num3);
        System.out.println(result);
    }

}
