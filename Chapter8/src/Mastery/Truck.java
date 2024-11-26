/*

Program: Truck.java          Last Date of this Revision: November 19, 2024

Purpose: An application that is showing the payload capacity of a truck

Author: Sahil Doad
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;


public class Truck extends Vehicle {
// Payload capacity in pounds
private int payloadCapacity; 

// Constructor to initialize truck details
 public Truck(String make, String model, int year, int payloadCapacity) {
     super(make, model, year);
  // Call the constructor of Vehicle
     this.payloadCapacity = payloadCapacity;
 }

//Implementation of the abstract method for truck details
 @Override
 public String getDetails() {
     return "Truck: " + toString() + ", Payload Capacity: " + payloadCapacity + " lbs";
 }
}
