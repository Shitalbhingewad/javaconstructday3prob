package dailywage;


class Employee {
    long isAbsent;
    int wagePerHour = 20;
    int partTimeOrFullTime;
    int salary;

    Employee() {
        isAbsent = Math.round(Math.random());
        if (isAbsent == 0) {
            partTimeOrFullTime = ((Math.random() <= 0.5) ? 1 : 2) * 2;
        }
    }

    void isAbsentPresent() { //  employee is present or absent 
        if (isAbsent == 0) {
            System.out.println("Employee is Present for the day");
        } else {
            System.out.println("Employee is Absent for the day");
        }
    }

    void employeeDailyWage() { // calculate daily wage
        if (isAbsent != 0) {
            salary = 0;
        } else {
            salary = partTimeOrFullTime * wagePerHour;
        }
        System.out.println("Salary for the day is :" + salary);
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Employee Wage Computation");
        Employee empObject = new Employee();
        empObject.isAbsentPresent();
        empObject.employeeDailyWage();
    }
}