package com.Lesson_2.employeeRecord;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        if(wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be greater than 0");
        }
        if(hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours worked must be between 0.0 and 168.0");
        }
        this.wage = wage;
        this.hours = hours;
    }


    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        if(wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be greater than 0");
        }
        this.wage = wage;
    }

    public void setHours(double hours) {
        if(hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours worked must be between 0.0 and 168.0");
        }
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if(getHours() <= 40) {
            return getWage() * getHours();
        }else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }

    @Override
    public String toString() {
        return "Hourly Employee Details \n" +
                "Hourly wage is " + getWage() +
                " with " + getHours() +
                "number of hours \n" + super.toString();
    }
}
