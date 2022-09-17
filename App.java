package com.employeewagesproblems;

class Employee {
    long isAbsent;

    Employee() {
        isAbsent = Math.round(Math.random());
    }

    void isAbsentPresent() {
        if (isAbsent == 0) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

}

public class App {
    public static void main(String[] args) {
        System.out.println("Employee Wage Computation");
        Employee empObject = new Employee();
        empObject.isAbsentPresent();
    }
}