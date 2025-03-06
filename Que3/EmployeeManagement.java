// Object-Oriented Programming - Employee Management System

//-----------------------------------------------------------------

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id; // Employee ID
    private String name; // Employee Name
    private double salary; // Employee Salary

    // Creating a Constructor to so that we can initialize the employee details using 'this' reference keyword
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //we have to display the details so we create a method to display the employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        //creating Array List to store Employee object(details)
        List<Employee> employees = new ArrayList<>();
        
        // Creating and adding Employee objects(details) to the list
        employees.add(new Employee(101, "Tanay", 50000));
        employees.add(new Employee(102, "Pranav", 60000));
        employees.add(new Employee(103, "Akki", 55000));
        employees.add(new Employee(104, "Raj", 65000));
        
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
