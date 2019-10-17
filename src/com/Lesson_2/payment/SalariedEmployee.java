package com.Lesson_2.payment;

public class SalariedEmployee extends Employee {
    private  double weeklySalary;

    public SalariedEmployee(
            String firstName,
            String lastName,
            String socialSecurityNumber,
            double weeklySalary
    ) {
        super(firstName, lastName, socialSecurityNumber);
        if(weeklySalary < 0){
            throw new IllegalArgumentException("Weekly salary cannot be less than 0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0){
            throw new IllegalArgumentException("Weekly salary cannot be less than 0");
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return "Salaried Employee's weekly salary is  " +
                weeklySalary +
                ".\n";
    }
}
