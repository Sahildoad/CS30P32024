/*

Program: MySavings.java          Last Date of this Revision: October 31, 2024

Purpose: An application that displays a menu of choices for entering pennies,nickels,dimes,and quarters into a PiggyBank object to store and load from a file  

Author: Sahil Doad
School: CHHS
Course: Computer Science 30
 

*/
package Mastery;

import java.io.*;


class PiggyBank implements Serializable {

 private double total;

 public PiggyBank() 
 {
	 // Initializes the total to 0.0
     total = 0.0;
 }

 public void addPenny() {
	// Increments total by 0.01
	 total += 0.01;
 }

 public void addNickel() {
	// Increments total by 0.05
	 total += 0.05;
 }

 public void addDime() {
	// Increments total by 0.10
	 total += 0.10;
 }

 public void addQuarter() {
	// Increments total by 0.25
	 total += 0.25;
 }

 public void takeMoneyOut(double amount) {
	// Checks if there is enough money to take out
	 if (amount <= total) {
         total -= amount;
      // Displays the amount taken out
         System.out.println("You took out: $" + amount);
     } else {
    	// Displays a message if there are insufficient funds
    	 System.out.println("Not enough funds.");
     }
 }

 public double getTotal() {
	// Returns the total amount
	 return total;
 }

 public void addAmount(double amount) {
	// Increments the total by the specified amount
	 total += amount;
 }


}

/* Screen Dump


1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 4

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 2

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 1
Total in bank: $0.86

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 0
Exiting and saving data...


  */

