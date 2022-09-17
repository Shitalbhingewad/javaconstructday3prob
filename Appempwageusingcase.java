package empwageusingcase;


class Employee {
    int isAbsent;
    int wagePerHour = 20;
    int partTimeOrFullTime;
    int salary;

    Employee() {
        isAbsent = (int) Math.round(Math.random()); 
        if (isAbsent == 0) {
            partTimeOrFullTime = ((Math.random() <= 0.5) ? 1 : 2) * 2; // part time or full time
        }
    }

    void isAbsentPresent() { // employee is present or absent for the day
        if (isAbsent == 0) {
            System.out.println("Employee is Present for the day");
        } else {
            System.out.println("Employee is Absent for the day");
        }
    }

    void employeeDailyWage() { // To calculate daily wage 
        switch (isAbsent) {
            case 1:
                salary = 0; 
                break;
            case 0: 
                salary = partTimeOrFullTime * wagePerHour;
                break;
            default:
                System.out.println("No output!");
        }
        System.out.println("Salary for the day is : " + salary);
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Employee empObject = new Employee();
        empObject.isAbsentPresent();
        empObject.employeeDailyWage();
    }
}