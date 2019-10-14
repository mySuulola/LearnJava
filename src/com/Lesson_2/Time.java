package com.Lesson_2;

public class Time {
    private int hour_;
    private int minute_;
    private int second_;

    public Time() {

    }

    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }
        hour_ = hour;
        minute_ = minute;
        second_ = second;
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }
        hour_ = hour;
        minute_ = minute;
        second_ = second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour_, minute_, second_);
    }

    public String toString()
    {
        return String.format("%d:%02d:%02d %s", (
                (hour_ == 0 || hour_ == 12) ? 12 : hour_ % 12
                ), minute_, second_, ( hour_ < 12 ? "AM" : "PM" ));
    }


}
