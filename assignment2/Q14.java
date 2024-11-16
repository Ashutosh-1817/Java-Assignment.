package assignment2;

import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;

    Employee(int id, String name, double salary) {
        emp_id = id;
        emp_name = name;
        basic_salary = salary;
    }

    void displayGrossSalary() {
        double gross_salary = basic_salary + (0.2 * basic_salary) + (0.1 * basic_salary); // Assuming 20% DA and 10% HRA
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        String name = sc.next();
        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.displayGrossSalary();
    }
}

