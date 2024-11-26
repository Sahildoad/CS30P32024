/*

Program: Minivan.java          Last Date of this Revision: November 19, 2024

Purpose: An application that is showing the number of doors on a car

Author: Sahil Doad
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;


public class Car extends Vehicle {
// Number of doors specific to a car
private int numDoors;

//Constructor to initialize car details
 public Car(String make, String model, int year, int numDoors) {
     super(make, model, year);
     this.numDoors = numDoors;
 }

//Implementation of the abstract method for car details
 @Override
 public String getDetails() {
     return "Car: " + toString() + ", Doors: " + numDoors;
 }
}
