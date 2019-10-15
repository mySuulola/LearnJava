package com.Lesson_2.employeeRecord;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Olaniyan", "ade", "543J4J54", 800);
        System.out.println(salariedEmployee + "\n salariedEmployee is " + salariedEmployee.earnings() + "\n\n");
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Chris", "Smith", "KLJ34JLK23", 16.75, 40);
        System.out.println(hourlyEmployee + "\n hourlyEmployee is " + hourlyEmployee.earnings() + "\n\n");
        CommissionEmployee commissionEmployee = new CommissionEmployee("Poke", "Man", "JDSF234K", 1_000, .06);
        System.out.println(commissionEmployee + "\n commissionEmployee is " + commissionEmployee.earnings() + "\n\n");
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Sarah", "Jones","JSDKF8923", 5_000, 0.04, 300);
        System.out.println(basePlusCommissionEmployee + "\n basePlusCommissionEmployee is " + basePlusCommissionEmployee.earnings() + "\n\n");


        Employee[] employeesArray = new Employee[4];
        employeesArray[0] = salariedEmployee;
        employeesArray[1] = hourlyEmployee;
        employeesArray[2] = commissionEmployee;
        employeesArray[3] = basePlusCommissionEmployee;
        System.out.println("\n\n\n Hello World \n\n\n");


        System.out.println(Arrays.toString(employeesArray));

        for (Employee currentEmployee : employeesArray) {
            System.out.println(currentEmployee);

            if(currentEmployee instanceof BasePlusCommissionEmployee) {

                // downcast Employee reference to BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.println("new base salary with 10% increase is  " + employee.getBaseSalary());
            }


        }


    }
}
