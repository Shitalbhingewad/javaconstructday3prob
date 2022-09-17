package wageforamonth;


class Employee {
    int isAbsent;
    int wagePerHour = 20;
    int partTimeOrFullTime;
    int salary;
    int maxWorkingHours = 100;
    int maxWorkingDays = 20;

    Employee() {
        isAbsent = (int) Math.round(Math.random()); 
        if (isAbsent == 0) {
            partTimeOrFullTime = ((Math.random() <= 0.5) ? 1 : 2) * 2; //  part time or full time
        }
    }

    void AbsentPresent() { //  is present or absent 
        if (isAbsent == 0) {
            System.out.println("Employee is Present for the day");
        } else {
            System.out.println("Employee is Absent for the day");
        }
    }

    int DailyWage() { 
        switch (isAbsent) { 
            case 1:
                salary = 0; 
                break;
            case 0: 
                if (partTimeOrFullTime == 1) {
                    salary = 4 * wagePerHour;
                } else {
                    salary = 8 * wagePerHour;
                }

                break;
            default:
                System.out.println("No output!");
        }
        System.out.println("Salary for the day is : " + salary);
        return salary;
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Employee empObject[] = new Employee[20];
        int totalSalary = 0;
        for (int i = 1; i < 20; i++) {
            empObject[i] = new Employee();
            empObject[i].AbsentPresent();
            totalSalary = totalSalary + empObject[i].DailyWage();
        }
        System.out.println("Salary total is :" + totalSalary);
    }
}