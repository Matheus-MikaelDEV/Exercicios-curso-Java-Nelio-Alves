package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantity of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data:\n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();

            list.add(new Employee(name, salary, id));
        }

        System.out.print("Enter the employee ID that will have salary increase: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean idExists = false;

        for (Employee employee : list) {
            if (employee.getId() == id) {
                idExists = true;
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();
                sc.nextLine();
                employee.setSalary(employee.getSalary() * (1 + percentage / 100));
                System.out.printf("Updated data: %s, %.2f, %d%n", employee.getName(), employee.getSalary(), employee.getId());
            }
        }

        if (!idExists) {
            System.out.println("This ID does not exist!");
        }

        for (Employee employee : list) {
            System.out.printf("%s, %.2f, %d%n", employee.getName(), employee.getSalary(), employee.getId());
        }

        sc.close();
    }
}