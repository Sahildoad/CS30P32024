/*

Program: University.java          Last Date of this Revision: November 19, 2024

Purpose: An application that contains member variables for the university employee name and salary 

Author: Sahil Doad 
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

import java.util.Scanner;

public class University {
    public static void main(String[] args) {
    	// Create instances of Faculty and Staff
        Faculty faculty = new Faculty("Dr. Doad", 175000, "Computer Science");
        Staff staff = new Staff("Down Deep", 45000, "Lab Technician");

        Scanner input = new Scanner(System.in);
        String action;
        UEmployee employee = faculty; 

        do {
        	 // Display menu for user action
            System.out.println("\n(E)mployee Details \\ (Q)uit");
            System.out.print("Enter choice: ");
            action = input.next();

            if (!action.equalsIgnoreCase("Q")) {
            	// Ask for the type of employee
                System.out.print("Enter Employee number (1 for Faculty, 2 for Staff): ");
                int empNum = input.nextInt();
                // Assign the selected employee
                switch (empNum) {
                    case 1:
                        employee = faculty;
                        break;
                    case 2:
                        employee = staff;
                        break;
                    default:
                        System.out.println("Invalid Employee number!");
                        continue;
                }

             // Display details of the selected employee
                if (action.equalsIgnoreCase("E")) {
                    System.out.println(employee.getDetails());
                }
            }
        } while (!action.equalsIgnoreCase("Q"));

        System.out.println("Exiting program.");
        input.close();
    }
}

/* Screen Dump

(E)mployee Details \ (Q)uit
Enter choice: E
Enter Employee number (1 for Faculty, 2 for Staff): 1
Name: Dr. Doad, Salary: $175000.0, Department: Computer Science

(E)mployee Details \ (Q)uit
Enter choice: E
Enter Employee number (1 for Faculty, 2 for Staff): 2
Name: Down Deep, Salary: $45000.0, Job Title: Lab Technician

(E)mployee Details \ (Q)uit
Enter choice: Q
Exiting program.
 
 */
