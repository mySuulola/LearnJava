package com.Lesson_2.employeeRecord;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if(weeklySalary <= 0.0) {
            throw new IllegalArgumentException("Weekly Salary must be greater than 0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary <= 0.0) {
            throw new IllegalArgumentException("Weekly Salary must be greater than 0");
        }
        this.weeklySalary = weeklySalary;
    }


    @Override
    public double earnings()
    {
        return getWeeklySalary();
    }

    @Override
    public String toString()
    {
        return "Salaried Employee Details \n" +
                "Weekly salary is " + getWeeklySalary() +
                "\n" + super.toString();
    }
}
