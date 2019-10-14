package com.Lesson_2;

public enum BookEnum {
    JHTP("Java How to Program", "2015"),
    LR("Learn React", "2015"),
    YDKJS("You don't know JS", "2012");

    private final String title;
    private final String copyrightYear;

    BookEnum(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
