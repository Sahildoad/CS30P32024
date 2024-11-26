/*

Program: UEmployee.java          Last Date of this Revision: November 19, 2024

Purpose: An application that contains methods for returning the employee name and salary

Author: Sahil Doad 
School: CHHS
Course: Computer Programming 30
 

*/

package Mastery;
//Abstract base class representing a generic university employee
public abstract class UEmployee {
    private String name;
    private double salary;

 // Constructor to initialize the employee's name and salary
    public UEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

 // Abstract method to get specific details of the employee
    public abstract String getDetails();

    // Common toString method for all employees
    public String toString() {
        return "Name: " + name + ", Salary: $" + salary;
    }
}
