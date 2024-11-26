/*

Program: Minivan.java          Last Date of this Revision: November 19, 2024

Purpose: An application that is showing the seating capacity of a Minivan

Author: Sahil Doad
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;


public class Minivan extends Vehicle {
// Seating capacity specific to a minivan
private int seatingCapacity;

//Constructor to initialize minivan details
 public Minivan(String make, String model, int year, int seatingCapacity) {
     super(make, model, year);
  // Call the constructor of Vehicle
     this.seatingCapacity = seatingCapacity;
 }

 // Implementation of the abstract method for minivan details
 @Override
 public String getDetails() {
     return "Minivan: " + toString() + ", Seating Capacity: " + seatingCapacity;
 }
}

