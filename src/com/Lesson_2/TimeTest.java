package com.Lesson_2;

public class TimeTest {
    private static void displayTime(String header, Time time) {
        System.out.printf("%S%nUniversal time: %s%nStandard time: %s%n", header, time.toUniversalString(), time.toString());
    }

    public static void main(String[] args) {
        Time morning = new Time(19,27,5);
        displayTime("this is for the morning time", morning);



    }
}
