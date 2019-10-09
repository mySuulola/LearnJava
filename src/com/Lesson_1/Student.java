package com.Lesson_1;

public class Student {
    private String name_;
    private double average_;


    public Student(String name, double average) {
        this.name_ = name;
        if(average >= 0.0 && average <= 100.00) {
            this.average_ = average;
        }
    }

    public void setAverage(double average) {
        if(average >= 0.0 && average <= 100.00) {
            this.average_ = average;
        }
    }

    public String getName() {
        return name_;
    }

    public String getLetterGrade() {
        System.out.println("Average is " + average_);
        double grade = this.average_;
        String letterGrade = "";
        if(grade > 69) {
            letterGrade = "A";
        }else if(grade >= 60.0) {
            letterGrade = "B";
        }else if(grade >= 50.0) {
            letterGrade = "C";
        }else if(grade >= 40.0) {
            letterGrade = "D";
        }else {
            letterGrade = "F";
        }
        return letterGrade;
    }


}
