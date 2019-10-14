package com.Lesson_2;

import java.text.NumberFormat;
import java.util.EnumSet;
import java.util.Locale;

public class Main {
    private static void displayTime(String header, Time time) {
        System.out.println("The amount is " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(5000));
        System.out.printf("%S%nUniversal time: %s%nStandard time: %s%n", header, time.toUniversalString(), time.toString());
    }

    public static void main(String[] args) {
        try{
            // for the time class execution
            Time morning = new Time(19,27,5);
            displayTime("this is for the morning time", morning);

            System.out.println();
            // for the book enum - to print all the books in enum BookEnum
            for(BookEnum bookEnum : BookEnum.values()) {
                System.out.printf("%-10s%-45s%s%n", bookEnum, bookEnum.getTitle(), bookEnum.getCopyrightYear());
            }
            System.out.println();
            // to print the first 2 books in the enum BookEnum
            for(BookEnum bookEnum : EnumSet.range(BookEnum.JHTP, BookEnum.LR)) {
                System.out.printf("%-10s%-45s%s%n", bookEnum, bookEnum.getTitle(), bookEnum.getCopyrightYear());
            }
        }catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            System.out.println("hour, minute and/or second was out of range");
        }


    }
}
