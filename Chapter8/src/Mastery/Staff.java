/*

Program: Staff.java          Last Date of this Revision: November 19, 2024

Purpose: An application that should include members for storing and returning the job title 

Author: Sahil Doad 
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

public class Staff extends UEmployee {
	 // Specific field for job title
     private String jobTitle;

     // Constructor to initialize staff details
    public Staff(String name, double salary, String jobTitle) {
    // Call the constructor of UEmployee
    	super(name, salary);
        this.jobTitle = jobTitle;
    }
    // Implementation of the abstract method to provide staff details
    @Override
    public String getDetails() {
        return toString() + ", Job Title: " + jobTitle;
    }
}
