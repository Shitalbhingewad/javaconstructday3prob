package maxhoursformonth;


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
            partTimeOrFullTime = ((Math.random() <= 0.5) ? 1 : 2) * 2; //part time or full time
        }
    }

    void isAbsentPresent() { // employee is present or absent 
        if (isAbsent == 0) {
            System.out.println("Employee is Present for the day");
        } else {
            System.out.println("Employee is Absent for the day");
        }
    }

    int employeeDailyWage() { 
        switch (isAbsent) { 
            case 1:
                salary = 0; 
                break;
            case 0: 
                if (partTimeOrFullTime == 1) {
                    salary = 4 * wagePerHour; // If partTime = 1 i.eyyy
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

    int employeeHours() {
        if (partTimeOrFullTime == 1) {
            return 4;
        } else {
            return 8;
        }
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Employee empObject[] = new Employee[20];
        int totalSalary = 0;
        int totalHours = 0;
        for (int i = 1; i < 20; i++) {
            if (totalHours >= 100) {
                System.out.println("Maximum number of hours reached: " + totalHours);
                System.out.println("Salary total is: " + totalSalary);
                System.exit(0);
            }
            empObject[i] = new Employee();
            empObject[i].isAbsentPresent();
            totalSalary = totalSalary + empObject[i].employeeDailyWage();
            totalHours = totalHours + empObject[i].employeeHours();
        }
        System.out.println("Maximum number of days reached: 20");
        System.out.println("Salary total is :" + totalSalary);
    }

}